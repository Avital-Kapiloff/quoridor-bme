package gui;
//import com.jgoodies.forms.layout.CellConstraints;
//import com.jgoodies.forms.layout.FormLayout;

import domein.Domeincontroller;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import domein.Domeincontroller;

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
public class StartLaadSpel extends javax.swing.JFrame {

	/**
	* Auto-generated main method to display this JFrame
	*/
	StartLaadPanel pnlSLP;
	KiesAantalSpelers pnlKiesAantalSpelers;
	static Domeincontroller dc;
	
	
	public static void main(String[] args) {
		
		dc = new Domeincontroller();
		
		
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				StartLaadSpel inst = new StartLaadSpel();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public StartLaadSpel() {

		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			BorderLayout thisLayout = new BorderLayout();
			getContentPane().setLayout(thisLayout);
			this.setPreferredSize(new java.awt.Dimension(900,900));
			pack();
			this.setSize(900, 900);

			{
				
//				/kiesAantalSpelers();
				//getContentPane().remove(pnlKiesAantalSpelers);
				setStartLaad();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
		public void setStartLaad(){
			pnlSLP = new StartLaadPanel();
			getContentPane().add(pnlSLP, BorderLayout.CENTER);
			pnlSLP.setPreferredSize(new java.awt.Dimension(200, 200));
			
		}
		

}
