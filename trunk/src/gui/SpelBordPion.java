package gui;

import domein.Pion;

public class SpelBordPion{
	private Cirkel pion;
	private String naam="";
	private int[] pos = new int[2];
	private int vaknr;
	
	

	public SpelBordPion(String naam,String kleur){
		setNaam(naam);
		setPion(kleur);
	}
	
	public int[] getPos() {
		return pos;
	}

	public void setPos(int[] pos) {
		this.pos = pos;
		vaknr=pos[0]+pos[1]+(16*pos[0]);	//int[0]=x   int[1]=y
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
	}
}
