package gui;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
public class KiesSpelerNamen extends javax.swing.JPanel {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel lnlGeefNamenVoor;
	private JButton btnBeginSpel;
	
	JLabel[] lblSpelernamen;
	JTextField[] txtSpelernamen;
	JComboBox[] cboSpelerKleur;
	ComboBoxModel cbom;
	int boxAfstand=40;
	
	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new KiesSpelerNamen());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public KiesSpelerNamen() {

		initGUI();
	}
	
	private void initGUI() {
		try {
			setPreferredSize(new Dimension(900, 900));
			setBounds(900,900,900,900);
			this.setLayout(null);
			{
				lnlGeefNamenVoor = new JLabel();
				this.add(lnlGeefNamenVoor);
				lnlGeefNamenVoor.setText("Geef de namen voor:");
				lnlGeefNamenVoor.setBounds(12, 12, 125, 16);
			}

			//System.out.println(StartLaadSpel.dc.getAantalSpelers());
			zetKiesSpelerNamen(StartLaadSpel.dc.getAantalSpelers());
			vulKleur();
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
		this.add(lblSpelernamen[i]);
		lblSpelernamen[i].setText("Speler " + (i+1));
		lblSpelernamen[i].setBounds(12,boxAfstand,59,16);
		
		//--Voeg alle textboxen toe
		txtSpelernamen[i] = new JTextField();
		this.add(txtSpelernamen[i]);
		txtSpelernamen[i].setBounds(71,boxAfstand,150,22);

		//--Voeg alle comboboxen toe
		
		
		
		//cbom =new DefaultComboBoxModel();
		cboSpelerKleur[i]=new JComboBox();
		this.add(cboSpelerKleur[i]);
		//cboSpelerKleur[i].setModel(cbom); // hier komt de cbospelerkleurvulKleur();
		cboSpelerKleur[i].setBounds(233, boxAfstand,109,22);
		//cboSpelerKleur[i].setModel(new DefaultComboBoxModel());
		cboSpelerKleur[i].addItemListener(new ItemListener() {public void itemStateChanged(ItemEvent evt) {	cboSpelerKleurItemStateChanged(evt);} });
		
		boxAfstand+=28;
		System.out.println(i);
	}
	// Voeg das einen knoptjen toetjes
				btnBeginSpel = new JButton();
				this.add(btnBeginSpel);
				btnBeginSpel.setText("Begin Spel!");
				btnBeginSpel.setBounds(35, boxAfstand, 284, 53);
				btnBeginSpel.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						btnBeginSpelMouseClicked(evt);
					}
				});

}

private void cboSpelerKleurItemStateChanged(ItemEvent evt) {
	//System.out.println(evt.getItem());

	
	if (evt.getStateChange() == ItemEvent.SELECTED) { 
		// Item was just selected 
		//System.out.println(evt.getItem());
	} else if (evt.getStateChange() == ItemEvent.DESELECTED) { 
			// Item is no longer selected 
		//System.out.println(evt.getItem());
	}
	
}

public void vulKleur(){
	
	//StartLaadSpel.dc.verwijderKleur(evt.getItem());
	//StartLaadSpel.dc.toonBeschikbareKleuren();
	
	
	for(int i=0;i<StartLaadSpel.dc.getAantalSpelers();i++)
	{
		cbom = new DefaultComboBoxModel(StartLaadSpel.dc.toonBeschikbareKleuren().toArray());
		cboSpelerKleur[i].setModel(cbom);
		StartLaadSpel.dc.verwijderKleur(cboSpelerKleur[i].getSelectedItem().toString());
		//System.out.println(cboSpelerKleur[i].getSelectedIndex());
		
		//if(i==3){for(int j=0;j<StartLaadSpel.dc.getAantalSpelers();j++){cboSpelerKleur[j].setModel(cbom);}}
	}
	
	
	
	//for(JComboBox cbos: cboSpelerKleur)
	{
	//	System.out.println(cbos.getSelectedIndex());
	}
	
	
}

private void btnBeginSpelMouseClicked(MouseEvent evt) {
	for(int i=0;i<StartLaadSpel.dc.getAantalSpelers();i++)
	{
		StartLaadSpel.dc.voegSpelerToe(txtSpelernamen[i].getText(), cboSpelerKleur[i].getSelectedItem().toString());
		
	}
	
	
	for(int x=0;x<StartLaadSpel.dc.getAantalSpelers();x++)
	{
		lblSpelernamen[x].setVisible(false);
		txtSpelernamen[x].setVisible(false);
		cboSpelerKleur[x].setVisible(false);
	}
	btnBeginSpel.setVisible(false);
	lnlGeefNamenVoor.setVisible(false);
	
	SpelBordPanel sb = new SpelBordPanel();
	this.add(sb);
	sb.setPreferredSize(new java.awt.Dimension(900, 900));
	
	//TODO add your code for btnBeginSpel.mouseClicked
}

	//{System.out.println(evt.);}
	//TODO add your code for cboKleurSpeler3.itemStateChanged
}

