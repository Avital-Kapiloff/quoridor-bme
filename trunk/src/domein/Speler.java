package domein;


public class Speler 
{
	private String naam;
	private int kleur;
	
	
	public int getKleur() {
		return kleur;
	}

	public void setKleur(int kleur) {
		this.kleur = kleur;
	}

	public Speler(int kleur, String naam)
	
	{
		setNaam(naam);
		setKleur(kleur);
		
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	

}