package gui;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class SpelBordPion{
	private JLabel pion = new JLabel();
	private String naam="";
	//private int[] plaatsCord = new int[2]; //bv x=350px y=200px
	private int[] arrayCord = new int[2]; //bv x=2 y=2
	
	public SpelBordPion(String naam, String kleur){
		setPionKleur(kleur);
		setNaam(naam);
		System.out.println("Constructorz Succes");
	}
	
	public void setPionKleur(String kleur) {
		if(kleur!=null){
		if(kleur.toLowerCase().equals("blauw")){
			pion.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/PionBlauw.png")));
     }
		if(kleur.toLowerCase().equals("cyan")){
			pion.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/PionCyan.png")));
     }
		if(kleur.toLowerCase().equals("geel")){
			pion.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/PionGeel.png")));
     }
		if(kleur.toLowerCase().equals("grijs")){
			pion.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/PionGrijs.png")));
     }
		if(kleur.toLowerCase().equals("groen")){
			pion.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/PionGroen.png")));
     }
		if(kleur.toLowerCase().equals("magenta")){
			pion.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/PionMagenta.png")));
     }
		if(kleur.toLowerCase().equals("oranje")){
			pion.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/PionOranje.png")));
     }
		if(kleur.toLowerCase().equals("rood")){
			pion.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/PionRood.png")));
     }
		if(kleur.toLowerCase().equals("roze")){
			pion.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/PionRoze.png")));
     }
		pion.setBounds(0, 0, 50, 50);
		
		}
	}


	public String getNaam() {
		return naam;
	}


	public void setNaam(String naam) {
		this.naam = naam;
	}

/*
	public int[] getPlaatsCord() {
		return plaatsCord;
	}


	public void setPlaatsCord(int[] plaatsCord) {
		this.plaatsCord = plaatsCord;
	}
*/

	public int[] getArrayCord() {
		return arrayCord;
	}


	public void setArrayCord(int[] arrayCord) {
		this.arrayCord = arrayCord;
	}
	
	public void verplaatsNaar(int x, int y){
		pion.setLocation(x, y);
		}
	
	public JLabel getPion(){
		return pion;
	}
	
	/*public void setVakNr(int v){
		vaknr=v;
	}

	public int getVaknr() {
		return vaknr;
	}

	public SpelBordPion(String naam,String kleur){
		setNaam(naam);
		setPion(kleur);
	}
	
	public int[] getPos() {
		return pos;
	}

	public void setPos(int[] pos) {
		this.pos = pos;
		//vaknr=pos[0]+pos[1]+(16*pos[0]);	//int[0]=x   int[1]=y
	}
	public Cirkel getPion() {
		return pion;
	}

	public void setPion(String kleur) {
		this.pion = new Cirkel(kleur);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}*/
}
