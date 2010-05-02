package domein;


public class Speler 
{
	private String naam="";
	private String kleur="";
	private int muren = 10;
	
	public int getMuren() {
		return muren;
	}

	public void verminderMuren(){
		--muren;
	}

	public String getKleur() {
		return kleur;
	}

	public void setKleur(String kleur) {
		this.kleur = kleur;
	}

	public Speler(String naam, String kleur)
	
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