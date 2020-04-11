package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import main.App;
import metamodels.Actor;
import metamodels.FRSLModel;
import runtime.IPluginActionExtensionPoint;
import runtime.IRuntime;
import runtime.Log;
import runtime.PluginActionProxy;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {

	private JDesktopPane fDesk;

	private JToolBar fToolBar;

	private JMenuBar fMenuBar;

	private static MainWindow fInstance; // global instance of main window

	private ActionFileOpenXmi fActionFileOpenXmi = new ActionFileOpenXmi();

	private ActionFileOpenSnapshot fActionFileOpenSnapshot = new ActionFileOpenSnapshot();

	private ActionHelpAbout fActionHelpAbout = new ActionHelpAbout();

	private ActionFileOpenPosWindow fActionOpenPosWindow = new ActionFileOpenPosWindow();

	private static IRuntime fPluginRuntime;

	private Map<Map<String, String>, PluginActionProxy> pluginActions = new HashMap<Map<String, String>, PluginActionProxy>();

	JLabel ucDiagram = new JLabel();
	
	FRSLModel frslModel;

	private JButton addToToolBar(JToolBar toolBar, AbstractAction action, String toolTip) {
		JButton tb = toolBar.add(action);
		tb.setToolTipText(toolTip);
		tb.setText("");
		return tb;
	}

	public MainWindow(IRuntime pluginRuntime) {
		super("FRSL");

		if (pluginRuntime != null) {
			fPluginRuntime = pluginRuntime;
		}
		fInstance = this;

		// create the menubar
		fMenuBar = new JMenuBar();
		getRootPane().setJMenuBar(fMenuBar);

		// `File' submenu
		JMenuItem mi;
		JMenu menu = new JMenu("File");
		menu.setMnemonic('F');
		fMenuBar.add(menu);
		mi = menu.add(fActionFileOpenXmi);
		mi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));
		mi.setMnemonic('O');

		// `Pos' submenu
		menu = new JMenu("Code");
		menu.setMnemonic('C');
		fMenuBar.add(menu);
		mi = menu.add(fActionOpenPosWindow);
		mi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK));
		mi.setMnemonic('V');

		// create the desktop
		fDesk = new JDesktopPane();
		fDesk.setDesktopManager(new ViewManager());

		// create toolbar
		fToolBar = new JToolBar();
		addToToolBar(fToolBar, fActionFileOpenXmi, "Open model specification");
		addToToolBar(fToolBar, fActionOpenPosWindow, "Open Pos system operation window");
		addToToolBar(fToolBar, fActionFileOpenSnapshot, "Open snapshot specification");
		// fToolBar.addSeparator();

		// Layout and set the content pane
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		contentPane.setPreferredSize(new Dimension(800, 550));
		// contentPane.add(fToolBar, BorderLayout.NORTH);

		contentPane.add(ucDiagram, BorderLayout.CENTER);

		// contentPane.add(fTopSplitPane, BorderLayout.CENTER);
		setContentPane(contentPane);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				close();
			}
		});

		setBounds(10, 20, 900, 700);

		// `Help' submenu
		menu = new JMenu("Help");
		menu.setMnemonic('H');
		fMenuBar.add(menu);
		mi = menu.add(fActionHelpAbout);
		mi.setMnemonic('A');

		// Plugins
		MainWindow.instance().fToolBar.addSeparator();
		// `Plugins' submenu
		menu = new JMenu("Plugins");
		menu.setMnemonic('P');
		this.fMenuBar.add(menu);

		IPluginActionExtensionPoint actionExtensionPoint = (IPluginActionExtensionPoint) fPluginRuntime
				.getExtensionPoint("action");

		this.pluginActions = actionExtensionPoint.createPluginActions(this);

		Set<Map.Entry<Map<String, String>, PluginActionProxy>> pluginActionSet = this.pluginActions.entrySet();

		for (Map.Entry<Map<String, String>, PluginActionProxy> currentActionMapEntry : pluginActionSet) {
			Map<String, String> currentActionDescMap = currentActionMapEntry.getKey();
			AbstractAction currentAction = currentActionMapEntry.getValue();
			addToToolBar(this.fToolBar, currentAction, currentActionDescMap.get("tooltip"));

			// Creating submenu and menu entries
			if (currentActionDescMap.get("menu").toString() == null) {
				// No submenu needed
				Log.debug("Adding [" + currentActionDescMap.get("menuitem").toString() + "] to plugins menu");
				menu.add(currentAction);
			} else {
				// Check if submenu already exists
				Component[] menuItems = menu.getMenuComponents();
				boolean createNewMenu = true;
				Log.debug("Menu item length was [" + menuItems.length + "]");
				for (int iterateMenuItems = 0; iterateMenuItems < menuItems.length;) {
					Log.debug("Menu item is of type [" + menuItems[iterateMenuItems].getClass() + "]");
					if (menuItems[iterateMenuItems] instanceof JMenu) {
						JMenu currentMenu = (JMenu) menuItems[iterateMenuItems];
						Log.debug("Compairing menu [" + currentMenu.getText() + "] and ["
								+ currentActionDescMap.get("menu").toString() + "]");
						if (currentMenu.getText().equals(currentActionDescMap.get("menu").toString())) {
							Log.debug("Adding [" + currentActionDescMap.get("menuitem").toString() + "] to submenu ["
									+ currentMenu.getText() + "]");
							currentMenu.add(currentAction);
							createNewMenu = false;
							break;
						}
					}
					iterateMenuItems++;
				}
				if (createNewMenu) {
					Log.debug("Creating new Menu [" + currentActionDescMap.get("menuitem").toString() + "]");
					JMenu pluginSubmenu = new JMenu(currentActionDescMap.get("menu").toString());
					Log.debug("Adding [" + currentActionDescMap.get("menu").toString() + "] to new submenu ["
							+ pluginSubmenu.getText() + "]");
					pluginSubmenu.add(currentAction);
					menu.add(pluginSubmenu);
				}
			}
		}

		/*
		 * menu = new JMenu("Plugins"); menu.setMnemonic('P'); this.fMenuBar.add(menu);
		 * menu.add(fActionFileOpenSnapshot); menu.add(new TestAction());
		 */
	}

	private void close() {
		setVisible(false);
		dispose();
	}

	/**
	 * Returns the instance of MainWindow.
	 */
	public static MainWindow instance() {
		return fInstance;
	}

	/**
	 * Opens and compiles a specification file.
	 */
	private class ActionFileOpenXmi extends AbstractAction {
		private JFileChooser fChooser;

		ActionFileOpenXmi() {
			super("Open usecase specification");
		}

		public void actionPerformed(ActionEvent e) {

			ImageIcon image;
			JFileChooser c = new JFileChooser(".");
			int rVal = c.showOpenDialog(MainWindow.this);
			if (rVal == JFileChooser.APPROVE_OPTION) {
				try {
					frslModel = App.parseFromFile(c.getSelectedFile().getPath());

					image = new ImageIcon("ucDiagram.png");
					image.getImage().flush();
					ucDiagram.setIcon(image);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

	}

	private class ActionFileOpenPosWindow extends AbstractAction {

		ActionFileOpenPosWindow() {
			super("Open Pos system operation window");
		}

		public void actionPerformed(ActionEvent e) {
			if (frslModel != null) {
				PosSystem posSystem = new PosSystem(frslModel);
				posSystem.pack();
				posSystem.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(MainWindow.this, "There's no input usecase!", "ERROR",
				        JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	/**
	 * Opens and compiles a snapshot specification file.
	 */
	private class ActionFileOpenSnapshot extends AbstractAction {
		ActionFileOpenSnapshot() {
			super("Generate use case diagram");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}

	/**
	 * Help about.
	 */
	private class ActionHelpAbout extends AbstractAction {
		ActionHelpAbout() {
			super("About...");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}
}