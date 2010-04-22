package gui;

import java.security.AllPermission;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import domein.Domeincontroller;
import gui.ReflectionController;
import gui.GetScreenSize;

public class GUIController {
	
	public GUIController() {

	}
	
	private GetScreenSize ss = new GetScreenSize();
	public static Domeincontroller dc = new Domeincontroller();
	public static ReflectionController rc = new ReflectionController("gui");
	private static List<String> allKleurenVanSpel =new ArrayList<String>();
	private List<String> lstKleur;
	
	


	public static void main(String args[]){
		List<String> formLijst = new ArrayList<String>();
		
		
		formLijst.add("StartLaad");
		formLijst.add("KiesAantalSpelers");
		formLijst.add("KiesNamenEnKleuren");
		
		rc.setClassList(formLijst);
		
		rc.setNextForm();
		
		
	}
	
	private Boolean checkLeeg(JTextField[] txtSpelernamen){
		for(JTextField txtSN:txtSpelernamen){
			if(txtSN.getText().toString().equals("")){
				return false;
			}
		}
		return true;
	}
	
	public Boolean controleerNaam(JTextField[] txtSpelernamen){
		if(checkLeeg(txtSpelernamen)){
			for(int i=0;i<dc.getAantalSpelers();++i){
			for(int j=i+1;j<dc.getAantalSpelers();++j){
				
				if(txtSpelernamen[i].getText().equals(txtSpelernamen[j].getText()) )
				{
					return false;
				}
			}
		}
		return true;
		}
		return false;
		
	}
	
	//--------
	public int getMiddelWidth(int boxSize){
		return (ss.getWidth()/2)-(boxSize/2);
	}
	
	public int getMiddelHeight(int boxSize){
		return (ss.getHeight()/2)-(boxSize/2);
	}
	//--------
	
	public void zetBEGINKleuren(JComboBox[] cboSpelerKleur){
		lstKleur = new ArrayList<String>();
		int j=0;
		lstKleur.addAll(getAllKleurenVanSpel());
		
		for(JComboBox cboSK:cboSpelerKleur){
				cboSpelerKleur[j].setModel(new DefaultComboBoxModel(lstKleur.toArray()));
				lstKleur.remove(0);
			++j;
		}
	}
	
	public void zetCBOKleuren(JComboBox[] cboSpelerKleur){
		int i=0;
		String[] tempKleuren = new String[dc.getAantalSpelers()];
		lstKleur = new ArrayList<String>();
		
		lstKleur.addAll(getAllKleurenVanSpel());
		
		for(JComboBox cboSK:cboSpelerKleur){
			tempKleuren[i]=cboSK.getSelectedItem().toString();
			++i;
		}
		i=0;
		
		for(JComboBox cboSK:cboSpelerKleur){
					lstKleur.remove(cboSK.getSelectedItem());
		}
		
		for(JComboBox cboSK:cboSpelerKleur){
			lstKleur.add(0, tempKleuren[i]);
			cboSpelerKleur[i].setModel(new DefaultComboBoxModel(lstKleur.toArray()));
			cboSpelerKleur[i].setSelectedItem(tempKleuren[i]);
			lstKleur.remove(tempKleuren[i]);
			++i;
		}
	} 
	
	
	public static List<String> getAllKleurenVanSpel() {
		return allKleurenVanSpel;
	}

	public static void setAllKleurenVanSpel(List<String> allKleurenVanSpel) {
		GUIController.allKleurenVanSpel = allKleurenVanSpel;
	}
}