package frsl.runtime;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

import frsl.gui.MainWindow;
import frsl.runtime.itf.IPlugin;
import frsl.runtime.itf.IPluginAction;
import frsl.runtime.itf.IPluginActionDelegate;
import frsl.runtime.itf.IPluginActionDescriptor;
import frsl.runtime.itf.IPluginRuntime;

/**
 * This class provides the abstract behaviour for Plugin Action Proxies. It is
 * mandatory to connect the Plugin Action Proxy with the implemented Plugin
 * Action in the Plugins.
 */
@SuppressWarnings("serial")
public abstract class PluginAction extends AbstractAction implements IPluginAction {

	private IPluginActionDescriptor pluginActionDescriptor;

	private IPluginActionDelegate pluginActionDelegate;

	private MainWindow parent;

	/**
	 * Constructor to create a Plugin Action Proxy with the given Plugin Action
	 * Descriptor, in the current Session, a parent Window.
	 */
	public PluginAction(IPluginActionDescriptor pluginActionDescriptor, MainWindow parent, String name,
			ImageIcon icon) {
		super(name, icon);
		this.pluginActionDescriptor = pluginActionDescriptor;
		this.parent = parent;
	}

	public void actionPerformed(ActionEvent event) {
		if (this.pluginActionDelegate == null) {
			this.pluginActionDelegate = createActionDelegate();
			if (this.pluginActionDelegate == null) {
				Log.error("Did not get a valid ActionDelegate for ["
						+ this.pluginActionDescriptor.getPluginActionModel().getId() + "]");
				return;
			}
		}
		this.pluginActionDelegate.performAction(this);
	}

	/**
	 * Method to connect with the Plugin Action in the Plugin.
	 */
	private IPluginActionDelegate createActionDelegate() {
		IPlugin thePlugin = this.pluginActionDescriptor.getParent().getPluginClass();
		if (thePlugin == null) {
			Log.debug("No main plugin class found! Running ActionDelegate directly.");
		} else {
			try {
				IPluginRuntime pluginRuntime = PluginRuntime.getInstance();
				Log.debug("Plugin not started yet, starting now...");
				thePlugin.run(pluginRuntime);
			} catch (Exception e) {
				Log.error("The plugin [" + thePlugin.getName() + "] could not be started! " + e);
			}
		}
		this.pluginActionDelegate = this.pluginActionDescriptor.getActionClass();
		return this.pluginActionDelegate;
	}

	public MainWindow getParent() {
		return this.parent;
	}
}
