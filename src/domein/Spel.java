package domein;
import ui.TestSpel;

public class Spel {
	private int aantalSpelers;
	public int verkregenRij, verkregenKolom;
	private int[] beschikbareKleuren;
	Spelbord spelbord;
	
	public Spel(int aantalSpelers){
		this.aantalSpelers = aantalSpelers;		
		
	}
	

	

	
	public int[] toonBeschikbareKleuren(){

		return beschikbareKleuren;
	}
	
	public void deKleuren(){
		/*hier komt de code om de kleuren uit de database te halen
		 * 
		 * 
		 * 
		 * */
		
	}
	
	public void voegSpelerToe(){
		
		
	}
	
	public void startPositieBepalen(){
		
		
		
	}
	
	public void pion(int kleur, int startPosX, int startPosY){
		
	}
	
	public void startSpel(){
		
	}
	
	public int[][] toonBord(){

		return spelbord.spelbordVeld;
	}
	
	public void setKleuren(){ //deKleuren()
		
		/* Hier komt de code om de kleuren uit de databank te halen
		 * 
		 * 
		 * */
	}
	public void voegSpelerToe(int kleur, String naam){
		Speler speler = new Speler(kleur,naam);
	}

}	

