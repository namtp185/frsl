package main;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FileChooser extends JFrame {

	protected JButton open = new JButton("Open");
	
	protected JButton add = new JButton("Add");
	
	public FileChooser() {
		JPanel p = new JPanel();
	    open.addActionListener(new OpenL());
	    p.add(open);
	    add.addActionListener(new AddL());
	    p.add(add);
	    
	    Container cp = getContentPane();
	    cp.add(p, BorderLayout.SOUTH);
	}
	
	class OpenL implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
			JFileChooser c = new JFileChooser(".");
			int rVal = c.showOpenDialog(FileChooser.this);
			if (rVal == JFileChooser.APPROVE_OPTION) {
				try {
					App.parseFromFile(c.getSelectedFile().getPath());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
	    }
	}
	
	class AddL implements ActionListener {
		protected JFrame addWindow;
		protected JTextField ucName, description;
		protected JPanel p;
		protected JButton submit = new JButton("Submit");
	    public void actionPerformed(ActionEvent e) {
			addWindow = new JFrame();
			Container cp = addWindow.getContentPane();
			
			p = new JPanel();
			p.setLayout(new GridLayout(2, 2));
			
			ucName = new JTextField(30);
			p.add(new JLabel("Usecase Name"));
			p.add(ucName);
			
			description = new JTextField(30);
			p.add(new JLabel("Short Description"));
			p.add(description);
			
			cp.add(p, BorderLayout.NORTH);
			
			p = new JPanel();
			submit.addActionListener(new SubmitL());
			p.add(submit);
			
			cp.add(p, BorderLayout.SOUTH);
			
			addWindow.setSize(500, 300);
			addWindow.setVisible(true);
	    }
	    
	    class SubmitL implements ActionListener {
	    	Map<String, String> data = new TreeMap<String, String>();
		    public void actionPerformed(ActionEvent e) {
		    	data.put("Usecase Name", ucName.getText());
		    	data.put("Short Description", description.getText());
		    	App.addUsecase(data);
		    	addWindow.setVisible(false);
		    	addWindow.dispose();
		    }
		}
	}
	
}
