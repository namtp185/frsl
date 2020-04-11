package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import metamodels.Actor;
import metamodels.Association;
import metamodels.FRSLModel;

@SuppressWarnings("serial")
public class PosSystem extends JFrame {

	private JDesktopPane fDesk;

	private static PosSystem fInstance; // global instance of pos window

	JLabel ucDiagram = new JLabel();

	/**
	 * Returns the instance of PosSystem.
	 */
	public static PosSystem instance() {
		return fInstance;
	}

	public PosSystem(FRSLModel frslModel) {
		// super("Pos Window");

		fInstance = this;

		// create the desktop
		fDesk = new JDesktopPane();
		fDesk.setDesktopManager(new ViewManager());

		// Layout and set the content pane
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		contentPane.setPreferredSize(new Dimension(800, 550));
		setContentPane(contentPane);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				close();
			}
		});

		setBounds(350, 180, 900, 700);

		System.out.println("========== Use case map here ==========");
		frslModel.getAssociations().entrySet().forEach(etr -> {
			Association association = (Association) etr.getValue();
			if (association != null && association.getName() != null) {
				System.out.println(etr.getKey() + " <=====> " + association.getName());
			}
		});
		System.out.println("========== Pending accosication ==========");
		frslModel.getPendingAssociation().entrySet().forEach(etr -> {
			if (etr.getKey() != null && etr.getValue() != null) {
				System.out.println(etr.getKey() + " <=====> " + etr.getValue());
			}
		});

	}

	private void close() {
		setVisible(false);
		dispose();
	}
}