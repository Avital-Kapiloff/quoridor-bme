package domein;

public class Pion
{
private int kleur;
private int[] positie = new int[2];


	public Pion(){
		
	}

	public Pion(int kleur,int[] positie)
	{
		setKleur(kleur);
		setPositie(positie);
	}
	
	public void setKleur(int kleur)
	{
		this.kleur = kleur;
	}

	public int[] getPositie() {
		return positie;
	}

	public void setPositie(int[] positie) {
		this.positie = positie;
	}

	public int getKleur() {
		return kleur;
	}
	
	



}

