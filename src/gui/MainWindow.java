package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import main.App;
import runtime.*;

@SuppressWarnings("serial")
public class MainWindow extends JFrame{      
    
    private JDesktopPane fDesk;
    
	private JToolBar fToolBar;
	
	private JMenuBar fMenuBar;
	        	
    private static MainWindow fInstance; // global instance of main window
    
    private ActionFileOpenXmi fActionFileOpenXmi = new ActionFileOpenXmi();
    
    private ActionFileOpenSnapshot fActionFileOpenSnapshot = new ActionFileOpenSnapshot();
    
    private ActionHelpAbout fActionHelpAbout = new ActionHelpAbout();
    
    private static IRuntime fPluginRuntime;
    
    private Map<Map<String, String>, PluginActionProxy> pluginActions = 
    		new HashMap<Map<String, String>, PluginActionProxy>();

	JLabel ucDiagram = new JLabel();

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
        mi.setAccelerator(KeyStroke
                .getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));
        mi.setMnemonic('O');
        
        
        // create the desktop
        fDesk = new JDesktopPane();
        fDesk.setDesktopManager(new ViewManager());
        
		// create toolbar
		fToolBar = new JToolBar();
		addToToolBar(fToolBar, fActionFileOpenXmi,  "Open model specification");
		addToToolBar(fToolBar, fActionFileOpenSnapshot,  "Open snapshot specification");
		//fToolBar.addSeparator();

        // Layout and set the content pane
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.setPreferredSize(new Dimension(800, 550));
//        contentPane.add(fToolBar, BorderLayout.NORTH);
        
        contentPane.add(ucDiagram, BorderLayout.CENTER);
        
//        contentPane.add(fTopSplitPane, BorderLayout.CENTER);        
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
				Log.debug("Adding ["
						+ currentActionDescMap.get("menuitem").toString()
						+ "] to plugins menu");
				menu.add(currentAction);
			} else {
				// Check if submenu already exists
				Component[] menuItems = menu.getMenuComponents();
				boolean createNewMenu = true;
				Log
						.debug("Menu item length was [" + menuItems.length
								+ "]");
				for (int iterateMenuItems = 0; iterateMenuItems < menuItems.length;) {
					Log.debug("Menu item is of type ["
							+ menuItems[iterateMenuItems].getClass() + "]");
					if (menuItems[iterateMenuItems] instanceof JMenu) {
						JMenu currentMenu = (JMenu) menuItems[iterateMenuItems];
						Log.debug("Compairing menu ["
								+ currentMenu.getText()
								+ "] and ["
								+ currentActionDescMap.get("menu")
										.toString() + "]");
						if (currentMenu.getText()
								.equals(
										currentActionDescMap.get("menu")
												.toString())) {
							Log.debug("Adding ["
									+ currentActionDescMap.get("menuitem")
											.toString() + "] to submenu ["
									+ currentMenu.getText() + "]");
							currentMenu.add(currentAction);
							createNewMenu = false;
							break;
						}
					}
					iterateMenuItems++;
				}
				if (createNewMenu) {
					Log.debug("Creating new Menu ["
							+ currentActionDescMap.get("menuitem")
									.toString() + "]");
					JMenu pluginSubmenu = new JMenu(currentActionDescMap
							.get("menu").toString());
					Log.debug("Adding ["
							+ currentActionDescMap.get("menu").toString()
							+ "] to new submenu ["
							+ pluginSubmenu.getText() + "]");
					pluginSubmenu.add(currentAction);
					menu.add(pluginSubmenu);
				}
			}
		}
		
//		menu = new JMenu("Plugins");
//		menu.setMnemonic('P');
//		this.fMenuBar.add(menu);
//		menu.add(fActionFileOpenSnapshot);
//		menu.add(new TestAction());
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
					App.parseFromFile(c.getSelectedFile().getPath());
					
					image = new ImageIcon("ucDiagram.png");
			    	image.getImage().flush();
			    	ucDiagram.setIcon(image);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
//            String path;
//            // reuse chooser if possible
//            if (fChooser == null) {
//                path = Options.getLastDirectory();
//                fChooser = new JFileChooser(path);
//                ExtFileFilter filter = new ExtFileFilter("uml",
//                        "Model specifications");
//                fChooser.addChoosableFileFilter(filter);
//                fChooser.setDialogTitle("Open specification");
//            }
//            int returnVal = fChooser.showOpenDialog(MainWindow.this);
//            if (returnVal != JFileChooser.APPROVE_OPTION)
//                return;
//
//            path = fChooser.getCurrentDirectory().toString();
//            Options.setLastDirectory(path);
//            Options.setResultDirectory(path);
//            File f = new File(path, fChooser.getSelectedFile().getName());
//            URI modelFileURI = URI.createFileURI(f.getPath());
//            
//            EclipseSolver eclipseSolver = fControl.getEclipseSolver();
//            
//            if ( eclipseSolver == null){
//            	eclipseSolver = new EclipseSolver(Options.eclipsePath, fLogPanel);
//            	fControl.setEclipseSolver(eclipseSolver);
//            }else{            	
//            	fControl.reset();            	
//            }
//            
//            //System.out.println(modelFileURI.toString());
//            
//            UMLResource r = (UMLResource) rSet.getResource(modelFileURI, true);
//            
//            IModelToCspSolverFactory<UMLResource> modelSolverFactory = new UmlModelToCspSolverFactory();
//            
//            modelSolver = modelSolverFactory.getModelToCspSolver(); 
//            fControl.setModelSolver(modelSolver);
//            modelSolver.setModelFileName(f.getName());
//            modelSolver.setModel(r);
//            initializeModelElementsDomain(modelSolver);            
//            modelSolver.setModelProperties(new ArrayList<IModelProperty>());
//            modelSolver.setCspCodeGenerator(new UmlToEclCodeGenerator(modelSolver));            
//            try {            	
//            	eclipseSolver.compile(getModelCspCode(), getImportLibs());
//    		} catch (EclipseException | IOException | ProcessingException e1) {			
//    			e1.printStackTrace();
//    		}            
//            fControl.resetSnapshot();
//            fLogPanel.setText("Loading the Model ... Done!");
        }

    }
    
    private class TestAction extends AbstractAction {
        TestAction() {
            super("Generate activity diagram");
        }

        public void actionPerformed(ActionEvent e) {
        	
        }
    }
    
    /**
     * Opens and compiles a snapshot specification file.
     */
    private class ActionFileOpenSnapshot extends AbstractAction {
        private JFileChooser fChooser;

        ActionFileOpenSnapshot() {
            super("Generate use case diagram");
        }

        public void actionPerformed(ActionEvent e) {
//            String path;
//            if(modelSolver == null){
//            	MessageBox dlg = new MessageBox(MainWindow.instance(),"Please load a model first!");
//    			dlg.setVisible(true);
//    			return;
//            }
//            // reuse chooser if possible
//            if (fChooser == null) {
//                path = Options.getLastDirectory();
//                fChooser = new JFileChooser(path);
//                ExtFileFilter filter = new ExtFileFilter("sna",
//                        "Snapshot specifications");
//                fChooser.addChoosableFileFilter(filter);
//                fChooser.setDialogTitle("Open snapshot specification");
//            }
//            int returnVal = fChooser.showOpenDialog(MainWindow.this);
//            if (returnVal != JFileChooser.APPROVE_OPTION)
//                return;
//
//            path = fChooser.getCurrentDirectory().toString();
//            Options.setLastDirectory(path);
//            File f = new File(path, fChooser.getSelectedFile().getName());
//            BufferedReader readbuffer;
//			try {
//				StringBuilder str = new StringBuilder();
//				String tmpStr;
//				Boolean isValidSnapshot = true;
//				readbuffer = new BufferedReader(new FileReader(f) );				 
//				String strRead;				
//				fControl.resetSnapshot();
//				strRead = readbuffer.readLine();
//				while(strRead != null){					
//					strRead = strRead.trim();
//					if(strRead != null && strRead.startsWith("[[") ){
//						tmpStr = str.toString();
//						if(!tmpStr.isEmpty() && tmpStr.charAt(tmpStr.length() - 1) == ','){
//							tmpStr = tmpStr.substring(0, tmpStr.length() - 1);
//						}
//						if(! tmpStr.isEmpty()){
//							fControl.addNewSnapshot(isValidSnapshot, tmpStr);
//						}						
//					}
//					if(strRead != null & strRead.endsWith("{")){
//						str = new StringBuilder();						
//					}else if( strRead != null && !strRead.endsWith("}") & !strRead.isEmpty()){
//						str.append(strRead);
//					}else if(strRead != null && strRead.startsWith("}")){
//						tmpStr = str.toString();
//						fControl.addNewSnapshot(isValidSnapshot, tmpStr);
//						if(isValidSnapshot){							
//							isValidSnapshot = false;
//						}
//					}						
//					strRead = readbuffer.readLine();
//				}
//				fControl.readyInferOCL();
//			} catch (IOException e1) {
//				fControl.readyInferOCL();				
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}			
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
//            AboutDialog dlg = new AboutDialog(MainWindow.this);
//            dlg.setVisible(true);
        }
    }  
}