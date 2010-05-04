package domein;

public class Pion
{
private int kleur;


	public Pion(){
		
	}

	public Pion(int kleur,int[] positie)
	{
		setKleur(kleur);
	
	}
	
	public void setKleur(int kleur)
	{
		this.kleur = kleur;
	}
	
	public int getKleur() {
		return kleur;
	}
	
	



}

