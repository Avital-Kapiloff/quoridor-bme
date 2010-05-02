package gui;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

import gui.GUIController;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class StartLaad extends javax.swing.JFrame {
	private JButton btnStartSpel;
	private GUIController gc = new GUIController();
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				StartLaad inst = new StartLaad();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public StartLaad() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				btnStartSpel = new JButton();
				getContentPane().add(btnStartSpel, "Center");
				btnStartSpel.setText("Start Spel");
				btnStartSpel.setBounds(69, 47, 146, 50);
				btnStartSpel.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent evt) {
						btnStartSpelMousePressed(evt);
					}
				});
			}
			pack();
			setSize(300, 300);
			setVisible(true);
			setLocation(new java.awt.Point(gc.getMiddelWidth(this.getWidth()), gc.getMiddelHeight(this.getHeight())));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void btnStartSpelMousePressed(MouseEvent evt) {
		gc.rc.setNextForm();
		this.dispose();
	}

}
