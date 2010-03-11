package domein;


public class Speler 
{
	private String naam="";
	private int kleur= 0;
	
	
	public int getKleur() {
		return kleur;
	}

	public void setKleur(int kleur) {
		this.kleur = kleur;
	}

	public Speler(String naam, int kleur)
	
	{
		setNaam(naam);
		setKleur(kleur);
		
	}
	public Speler(){
		
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	

}