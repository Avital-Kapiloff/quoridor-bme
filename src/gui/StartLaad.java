package gui;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

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
	private JComboBox cboLangField;
	private ButtonGroup buttonGroup1;
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
				getContentPane().add(getcboLangField());
				gc.dc.setMessages(3);
				btnStartSpel.setText(gc.dc.getMessages().getString("START_GAME"));
				btnStartSpel.setBounds(65, 133, 146, 50);
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
	
	private ButtonGroup getButtonGroup1() {
		if(buttonGroup1 == null) {
			buttonGroup1 = new ButtonGroup();
		}
		return buttonGroup1;
	}
	
	private JComboBox getcboLangField() {
		if(cboLangField == null) {
			ComboBoxModel cboLangFieldModel = 
				new DefaultComboBoxModel(
						new String[] { "Nederlands", "English", "Français" });
			cboLangField = new JComboBox();
			cboLangField.setModel(cboLangFieldModel);
			cboLangField.setBounds(48, 37, 134, 23);
			cboLangField.setVisible(true);
			cboLangField.addItemListener(new ItemListener() {public void itemStateChanged(ItemEvent evt) {	cboKlikFunctie(evt);}});
		}
		return cboLangField;
	}
	
	private void cboKlikFunctie(ItemEvent evt) {
		if (cboLangField.getSelectedItem()=="English"){
			gc.dc.setMessages(1);
			btnStartSpel.setText(gc.dc.getMessages().getString("START_GAME"));
			
		}else{
			if (cboLangField.getSelectedItem()=="Français"){
				gc.dc.setMessages(2);
				btnStartSpel.setText(gc.dc.getMessages().getString("START_GAME"));
				
			}else{
				gc.dc.setMessages(3);
				btnStartSpel.setText(gc.dc.getMessages().getString("START_GAME"));
				
			}
		}
			
		//if (evt.getStateChange() == ItemEvent.SELECTED) { 
		//	gc.dc.(cboLangField);
		//}		
	}
}
