package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.JFrame;


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
public class KiesAantalSpelers extends javax.swing.JPanel {

	


	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	
	private JButton btn2Spelers,btn4Spelers;
	private JLabel lblKiesAantalSpelers;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new KiesAantalSpelers());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public KiesAantalSpelers() {

		initGUI();
	}
	
	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout(3, 1);
			thisLayout.setColumns(1);
			thisLayout.setHgap(10);
			thisLayout.setVgap(5);
			this.setLayout(thisLayout);
			setPreferredSize(new Dimension(200, 200));
			
			{	
			lblKiesAantalSpelers = new JLabel();
			this.add(lblKiesAantalSpelers);
			lblKiesAantalSpelers.setText("Kies aantal spelers");
		}
		{
			btn2Spelers = new JButton();
			this.add(btn2Spelers);
			btn2Spelers.setText("2");
			btn2Spelers.setPreferredSize(new java.awt.Dimension(200, 100));
			btn2Spelers.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					btn2SpelersMouseClicked(evt);
				}
			});

		}
		{
			btn4Spelers = new JButton();
			this.add(btn4Spelers);
			btn4Spelers.setText("4");
			btn4Spelers.setPreferredSize(new java.awt.Dimension(200, 100));
			btn4Spelers.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					btn4SpelersMouseClicked(evt);
				}
			});

		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void verwijderKiesAantalSpelers(){
		lblKiesAantalSpelers.setVisible(false);
		this.remove(lblKiesAantalSpelers);
		btn2Spelers.setVisible(false);
		this.remove(btn2Spelers);
		btn4Spelers.setVisible(false);
		this.remove(btn4Spelers);
		
		btn2Spelers.removeMouseListener(btn2Spelers.getMouseListeners()[1]);
		btn4Spelers.removeMouseListener(btn4Spelers.getMouseListeners()[1]);
		
		zetSpelerNaamEnKleur();
	}
	
	private void zetSpelerNaamEnKleur(){
		KiesSpelerNamen kSN = new KiesSpelerNamen();
		this.add(kSN,BorderLayout.CENTER);
	}
	
	private void btn2SpelersMouseClicked(MouseEvent evt) {
		StartLaadSpel.dc.startNieuwSpel(2);
		verwijderKiesAantalSpelers();
	}
	
	private void btn4SpelersMouseClicked(MouseEvent evt) {
		StartLaadSpel.dc.startNieuwSpel(4);
		verwijderKiesAantalSpelers();
	}

}
