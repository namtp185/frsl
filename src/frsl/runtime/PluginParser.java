package frsl.runtime;

import java.io.IOException;
import java.util.Stack;
import java.util.Vector;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

//import org.tzi.use.runtime.model.PluginActionModel;
//import org.tzi.use.runtime.model.PluginModel;
//import org.tzi.use.runtime.model.PluginServiceModel;
//import org.tzi.use.runtime.model.PluginShellCmdModel;
//import org.tzi.use.util.Log;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import frsl.runtime.itf.IPluginParserSymbols;

/**
 * The Plugin Parser class. This class uses the Plugin Parser Symbols provided
 * by the PluginParserSymbols interface. While parsing the XML declaration file
 * this class creates the additional Plugin Service, Action and Shell Command
 * Descriptors if nessecary.
 */
public class PluginParser extends DefaultHandler implements
		IPluginParserSymbols {

	private final Stack<PluginModel> pluginDesciptors = new Stack<PluginModel>();

	private final SAXParserFactory factory = SAXParserFactory.newInstance();

	public void characters(char buf[], int offset, int len) throws SAXException {
		Log.debug("PluginParser: Touching characters.");
		String s = new String(buf, offset, len);
		Log.debug(s);
	}

	public void endDocument() {
		Log.debug("PluginParser: Touching endDocument.");
	}

	public void endElement(String uri, String elementName, String qName) {
		Log.debug("PluginParser: Touching endElement.");
	}

	public void handlePlugin(String qName, Attributes attributes) {
		Log.debug("PluginParser: Entering handlePlugin.");
		Log.debug("PluginParser: element=[" + qName + "]");
		if (qName.equals(PLUGIN)) {
			Log.debug("PluginParser:  attributes counted ["
					+ attributes.getLength() + "]");
			parsePluginAttributes(attributes);
		} else {
			Log.debug("PluginParser: handlePlugin  at " + qName);
		}
		Log.debug("PluginParser: Leaving handlePlugin.");
	}

	public void handlePluginAction(String qName, Attributes attributes) {
		Log.debug("PluginParser: Entering handlePluginAction.");
		Log.debug("PluginParser: element=[" + qName + "]");
		if (qName.equals(PLUGIN_ACTION)) {
			Log.debug("PluginParser:  attributes counted ["
					+ attributes.getLength() + "]");
			parsePluginActionAttributes(attributes);
		} else {
			Log.debug("PluginParser: handlePluginAction  at " + qName);
		}
		Log.debug("PluginParser: Leaving handlePluginAction.");
	}


	private void internalError(String position, String attribute) {
		System.out.println("Parse error at position " + position
				+ " with Attribute " + attribute);
	}

	public synchronized PluginModel parsePlugin(InputSource inputSource)
			throws SAXException, IOException, ParserConfigurationException {

		SAXParser saxParser = factory.newSAXParser();
		saxParser.parse(inputSource, this);
		return pluginDesciptors.pop();
	}

	public void parsePluginActionAttributes(Attributes attributes) {

		PluginActionModel action = new PluginActionModel();

		PluginModel current = this.pluginDesciptors.pop();
		Vector<PluginActionModel> actions = current.getActions();

		Log.debug("PluginParser: Entering parsePluginActionAttributes.");
		// process attributes
		int len = attributes.getLength();
		Log
				.debug("PluginParser: parsePluginActionAttributes counted attributes ["
						+ attributes.getLength() + "]");
		for (int i = 0; i < len; i++) {
			String attrName = attributes.getQName(i);
			String attrValue = attributes.getValue(attrName);
			Log.debug("PluginParser: " + attrName + " found.");
			if (attrName.equals(PLUGIN_ID)) {
				action.setId(attrValue);
				Log.debug("Setting " + attrName);
			} else if (attrName.equals(PLUGIN_ACTION_ICON)) {
				action.setIcon(attrValue);
				Log.debug("Setting " + attrName);
			} else if (attrName.equals(PLUGIN_ACTION_CLASS)) {
				action.setActionClass(attrValue);
				Log.debug("Setting " + attrName);
			} else if (attrName.equals(PLUGIN_ACTION_LABEL)) {
				action.setLabel(attrValue);
				Log.debug("Setting " + attrName);
			} else if (attrName.equals(PLUGIN_ACTION_TOOLTIP)) {
				action.setTooltip(attrValue);
				Log.debug("Setting " + attrName);
			} else if (attrName.equals(PLUGIN_ACTION_MENU)) {
				action.setMenu(attrValue);
				Log.debug("Setting " + attrName);
			} else if (attrName.equals(PLUGIN_ACTION_MENU_ITEM)) {
				action.setMenuitem(attrValue);
				Log.debug("Setting " + attrName);
			} else if (attrName.equals(PLUGIN_ACTION_TOOLBAR_ITEM)) {
				action.setToolbaritem(attrValue);
				Log.debug("Setting " + attrName);
			} else
				internalError(PLUGIN, attrName);
		}
		actions.add(action);
		pluginDesciptors.push(current);
		Log.debug("PluginParser: Leaving parsePlugin.");
	}

	public void parsePluginAttributes(Attributes attributes) {

		PluginModel current = new PluginModel();

		this.pluginDesciptors.push(current);
		Log.debug("PluginParser: Entering parsePlugin.");
		// process attributes
		int len = attributes.getLength();
		Log.debug("PluginParser: parsePlugin counted attributes ["
				+ attributes.getLength() + "]");
		for (int i = 0; i < len; i++) {
			String attrName = attributes.getQName(i);
			String attrValue = attributes.getValue(attrName);
			Log.debug("PluginParser: " + attrName + " found.");
			if (attrName.equals(PLUGIN_ID)) {
				current.setId(attrValue);
				Log.debug("Setting " + attrName);
			} else if (attrName.equals(PLUGIN_NAME)) {
				current.setName(attrValue);
				Log.debug("Setting " + attrName);
			} else if (attrName.equals(PLUGIN_VERSION)) {
				current.setVersion(attrValue);
				Log.debug("Setting " + attrName);
			} else if (attrName.equals(PLUGIN_PUBLISHER)) {
				current.setPublisher(attrValue);
				Log.debug("Setting " + attrName);
			} else if (attrName.equals(PLUGIN_CLASS)) {
				current.setPluginClass(attrValue);
				Log.debug("Setting " + attrName);
			} else
				internalError(PLUGIN, attrName);
		}
		Log.debug("PluginParser: Leaving parsePlugin.");
	}

	public void startDocument() throws SAXException {
		Log.debug("PluginParser: Touching startDocument.");
	}

	public void startElement(String uri, String elementName, String qName,
			Attributes attributes) {
		Log.debug("PluginParser: Entering startElement.");
		Log.debug("PluginParser: element=[" + qName + "] attributes=["
				+ attributes.getLength() + "]");
		handlePlugin(qName, attributes);
		handlePluginAction(qName, attributes);
		Log.debug("PluginParser: Leaving startElement.");
	}

	public void warning(SAXParseException ex) {
		Log.error("Parsing failed due " + ex);
	}
}
