package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JSplitPane;

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
public class StartLaadPanel extends javax.swing.JPanel {
	private JButton btnStart;
	private JButton btnLaad;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new StartLaadPanel());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		
	}
	
	public StartLaadPanel() {

		initGUI();
	}
	
	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout(2, 1);
			thisLayout.setColumns(1);
			thisLayout.setHgap(10);
			thisLayout.setVgap(5);
			this.setLayout(thisLayout);
			setPreferredSize(new Dimension(200, 200));
			{
				btnStart = new JButton();
				this.add(btnStart);
				btnStart.setText("START SPEL");
				btnStart.setPreferredSize(new Dimension(200,200));
				btnStart.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						btnStartMouseClicked(evt);
					}
				});
			}
			{
				btnLaad = new JButton();
				this.add(btnLaad);
				btnLaad.setText("LAAD SPEL");
				btnLaad.setPreferredSize(new Dimension(200,200));
				btnLaad.setSize(200, 200);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void btnStartMouseClicked(MouseEvent evt) {

		btnLaad.setVisible(false);
		this.remove(btnLaad);
		btnStart.removeMouseListener(btnStart.getMouseListeners()[1]);
		btnStart.setVisible(false);
		this.remove(btnStart);
		
		KiesAantalSpelers pnlKiesAantalSpelers = new KiesAantalSpelers();
		this.add(pnlKiesAantalSpelers,BorderLayout.CENTER);
		pnlKiesAantalSpelers.setPreferredSize(new java.awt.Dimension(196, 97));
		//btnStart.removeMouseListener();
	}


}
