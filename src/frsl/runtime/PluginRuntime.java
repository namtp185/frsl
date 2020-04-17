package frsl.runtime;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

//import org.tzi.use.main.runtime.IExtensionPoint;
//import org.tzi.use.runtime.IPluginDescriptor;
//import org.tzi.use.runtime.IPluginRuntime;
//import org.tzi.use.runtime.gui.impl.ActionExtensionPoint;
//import org.tzi.use.runtime.gui.impl.MModelExtensionPoint;
//import org.tzi.use.runtime.model.PluginServiceModel;
//import org.tzi.use.runtime.service.IPluginService;
//import org.tzi.use.runtime.service.IPluginServiceDescriptor;
//import org.tzi.use.runtime.service.impl.PluginServiceDescriptor;
//import org.tzi.use.runtime.shell.impl.ShellExtensionPoint;
//import org.tzi.use.runtime.util.PluginRegistry;
//import org.tzi.use.runtime.util.ServiceRegistry;
//import org.tzi.use.util.Log;
//import org.tzi.use.util.StringUtil;

/**
 * @author Roman Asendorf
 */
public class PluginRuntime implements IPluginRuntime {

	private static IPluginRuntime instance = new PluginRuntime();

	/**
	 * Method returning the Singleton instance of the PluginRuntime
	 * 
	 * @return The PluginRuntime instance.
	 */
	public static IPluginRuntime getInstance() {
		return instance;
	}

	private Map<String, IPluginDescriptor> registeredPlugins = new HashMap<String, IPluginDescriptor>();

	private Map<String, IPluginServiceDescriptor> registeredServices = new HashMap<String, IPluginServiceDescriptor>();

	public IExtensionPoint getExtensionPoint(String extensionPoint) {
		if (extensionPoint.equals("action")) {
			return ActionExtensionPoint.getInstance();
//		} else if (extensionPoint.equals("shell")) {
//			return ShellExtensionPoint.getInstance();
//		} else if (extensionPoint.equals("model")) {
//			return MModelExtensionPoint.getInstance();
		} else
			return null;
	}

	/**
	 * Method to get a Plugin by it's name.
	 * 
	 * @param pluginName
	 *            The Plugin's name.
	 * @return The plugin descriptor
	 */
	public IPluginDescriptor getPlugin(String pluginName) {
		return this.registeredPlugins.get(pluginName);
	}

	public Map<String, IPluginDescriptor> getPlugins() {
		return this.registeredPlugins;
	}

	public IPluginService getService(String pluginServiceClassName) {
		PluginServiceDescriptor currentPluginServiceDescriptor = (PluginServiceDescriptor) this.registeredServices
				.get(pluginServiceClassName);
		if (currentPluginServiceDescriptor.getPluginServiceModel()
				.getServiceClass().equals(pluginServiceClassName)) {
			return currentPluginServiceDescriptor.getServiceClass();
		}
		return null;
	}

	public Map<String, IPluginServiceDescriptor> getServices() {
		return this.registeredServices;
	}

	public void registerPlugin(String pluginFilename, URL pluginURL) {
		URL newPluginURL;
		try {
			newPluginURL = new URL(pluginURL + pluginFilename);
			PluginRegistry pluginRegistry = PluginRegistry.getInstance();
			IPluginDescriptor currentPluginDescriptor = pluginRegistry
					.registerPlugin(newPluginURL);
			if (currentPluginDescriptor == null) {
				return;
			}
			
			IPluginDescriptor otherPlugin = getPlugin(currentPluginDescriptor.getPluginModel().getName());
			if(otherPlugin != null){
				return;
			}
			
			getPlugins().put(
					currentPluginDescriptor.getPluginModel().getName(),
					currentPluginDescriptor);
		} catch (MalformedURLException mfurle) {
//			Log.error("No valid URL given to register plugin: " + mfurle);
		}
	}

	private void registerService(
			IPluginServiceDescriptor currentPluginServiceDescriptor) {
		getServices().put(
				currentPluginServiceDescriptor.getPluginServiceModel().getId(),
				currentPluginServiceDescriptor);
	}

	public void registerServices(IPluginDescriptor currentPluginDescriptor) {

		ServiceRegistry serviceRegistry = ServiceRegistry.getInstance();

		Vector<PluginServiceModel> pluginServices = currentPluginDescriptor.getPluginModel().getServices();

		for (int cntPluginServices = 0; cntPluginServices < pluginServices.size();) {
			PluginServiceModel currentPluginServiceModel = pluginServices.get(cntPluginServices);
			IPluginServiceDescriptor currentPluginServiceDescriptor = serviceRegistry
					.registerPluginService(currentPluginDescriptor,
							currentPluginServiceModel);

			registerService(currentPluginServiceDescriptor);
			cntPluginServices++;
		}
	}

}
