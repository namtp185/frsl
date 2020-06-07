package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import metamodels.ActorInterface;
import metamodels.FRSLModel;
import metamodels.UsecaseInterface;
import Utils.Constants;

public class GenerateModel {

	private String filePath;

	private FRSLModel frslModel;

	private BufferedWriter writer;

	private StringBuffer dataBuffer;

	public GenerateModel() {
	}

	public GenerateModel(String generatedPath, FRSLModel frslModel) {
		try {
			writer = new BufferedWriter(new FileWriter(generatedPath, false));
			dataBuffer = new StringBuffer();
			this.frslModel = frslModel;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public FRSLModel getFrslModel() {
		return frslModel;
	}

	public void setFrslModel(FRSLModel frslModel) {
		this.frslModel = frslModel;
	}

	public BufferedWriter getWriter() {
		return writer;
	}

	public void setWriter(BufferedWriter writer) {
		this.writer = writer;
	}

	public StringBuffer getDatBuffer() {
		return dataBuffer;
	}

	public void setDataBuffer(StringBuffer dataBuffer) {
		this.dataBuffer = dataBuffer;
	}

	public void addHeader() {
		dataBuffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<uml:Model xmi:version=\"20200522\"\r\n" + 
				"	xmlns:xmi=\"http://www.omg.org/spec/XMI/20110701\"\r\n" + 
				"	xmlns:uml=\"http://www.eclipse.org/uml2/4.0.0/UML\"\r\n" + 
				"	xmi:id=\"_5ATRMIPREeGsVZAesWUgWw\" name=\"UML Model\">" + "\n");
	}
	
	public String addType(String value) {
		return "xmi:type=\"uml:" + value + "\"";
	}

	public String addName(String value) {
		return "name=\"" + value + "\"";
	}
	
	public String addBeginningTag(String tagName, String typeValue, String nameValue) {
		return "<" + tagName + " " + addType(typeValue) + " " + addName(nameValue) + ">";
	}
	
	public String addClosingTag(String tagName) {
		return "</" + tagName + ">";
	}
	
	public void addFooter() {
		dataBuffer.append("\n" + "</uml:Model>");
	}
	
	public void addBody() {
		
	}
	
	public void generate() {
		try {
			addHeader();
			// 1. Append model to
			Map<String, ActorInterface> actors = frslModel.getActors();
			if (actors != null && actors.size() > 0) {
				for (Entry<String, ActorInterface> entry : actors.entrySet()) {
					ActorInterface actorInterface = entry.getValue();
					Collection<UsecaseInterface> usecase = actorInterface.getUsecases();
					dataBuffer.append(addBeginningTag(Constants.PACKAGE_ELEMENT, "Class", entry.getKey()));
					for (UsecaseInterface s : usecase) {
						// s.getName()
						// s.getDescription().getText()
						// s.getPrecondition().getText()
					}
					dataBuffer.append(addClosingTag(Constants.PACKAGE_ELEMENT));
				}
			}
			addFooter();
			// TODO: 2. Append controller to
			
			writer.write(dataBuffer.toString());
			System.out.println("Model Done!");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
