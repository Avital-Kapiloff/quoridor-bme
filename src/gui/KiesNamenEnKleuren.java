package gui;

import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
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
public class KiesNamenEnKleuren extends javax.swing.JFrame {

	GUIController gc = new GUIController();
	JLabel[] lblSpelernamen;
	JTextField[] txtSpelernamen;
	JComboBox[] cboSpelerKleur;
	JLabel lblGeefNamenVoor;
	JButton btnBeginSpel;
	int boxAfstand=40;


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				KiesNamenEnKleuren inst = new KiesNamenEnKleuren();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public KiesNamenEnKleuren() {
		super();
		initGUI();
		
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			pack();
			setSize(400, 300);
			
			{
				lblGeefNamenVoor = new JLabel();
				this.add(lblGeefNamenVoor);
				lblGeefNamenVoor.setText("Geef de namen voor:");
				lblGeefNamenVoor.setBounds(12, 12, 125, 16);
			}
			
			zetKiesSpelerNamen(gc.dc.getAantalSpelers());
			gc.zetBEGINKleuren(cboSpelerKleur);
			gc.zetCBOKleuren(cboSpelerKleur);
			setVisible(true);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void zetKiesSpelerNamen(int aantalSpelers){
		lblSpelernamen = new JLabel[aantalSpelers];
		txtSpelernamen = new JTextField[aantalSpelers];
		cboSpelerKleur = new JComboBox[aantalSpelers];
		
		for(int i=0;i<(aantalSpelers);++i)
		{
			//De layout MOET op absoluut staan voor dit te kunnen laten werken
			//--Voeg alle labels toe
			lblSpelernamen[i] = new JLabel();
			getContentPane().add(lblSpelernamen[i]);
			lblSpelernamen[i].setText("Speler " + (i+1));
			lblSpelernamen[i].setBounds(12, boxAfstand, 59, 16);
			
			//--Voeg alle textboxen toe
			txtSpelernamen[i] = new JTextField();
			getContentPane().add(txtSpelernamen[i]);
			txtSpelernamen[i].setBounds(71, boxAfstand, 150, 22);
			txtSpelernamen[i].addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent evt){
					controleerInvoer(evt);
				}
			});
			//--Voeg alle comboboxen toe
			
			
			
			//cbom =new DefaultComboBoxModel();
			cboSpelerKleur[i]=new JComboBox();
			getContentPane().add(cboSpelerKleur[i]);
			//cboSpelerKleur[i].setModel(cbom); // hier komt de cbospelerkleurvulKleur();
			cboSpelerKleur[i].setBounds(233, boxAfstand, 109, 22);
			//cboSpelerKleur[i].setModel(new DefaultComboBoxModel(gc.dc.toonBeschikbareKleuren().toArray()));
			cboSpelerKleur[i].addItemListener(new ItemListener() {public void itemStateChanged(ItemEvent evt) {	cboKlikFunctie(evt);}});
			
			boxAfstand+=28;
			//System.out.println(boxAfstand);
		}
		
	

				btnBeginSpel = new JButton();
				this.add(btnBeginSpel);
				btnBeginSpel.setText("Begin Spel!");
				btnBeginSpel.setBounds(35, boxAfstand, 284, 53);
				btnBeginSpel.setEnabled(false);
		
	}
	
	private void cboKlikFunctie(ItemEvent evt) {
		
		if (evt.getStateChange() == ItemEvent.SELECTED) { 
			gc.zetCBOKleuren(cboSpelerKleur);
		}		
	}
	
	private void controleerInvoer(KeyEvent e){
		//System.out.println(gc.checkNaam(txtSpelernamen));
		
		if(gc.controleerNaam(txtSpelernamen)){
			btnBeginSpel.setEnabled(true);
		}
		else
		{btnBeginSpel.setEnabled(false);}
		
	}

}
