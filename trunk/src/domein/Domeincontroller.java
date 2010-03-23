package domein;

import ui.TestSpel;

public class Domeincontroller {
	private Spel spel;

public void startNieuwSpel(int aantalSpelers){
	
	spel = new Spel(aantalSpelers);
	
}
public String toonBeschikbareKleuren(){
	return spel.toonBeschikbareKleuren();
}
public void voegSpelerToe(String naam, int kleur){
	spel.voegSpelerToe(naam, kleur);
}
public void startSpel(){
	spel.startSpel();
}
public void plaatsMuur(){
	
}
public void verplaatsPion(){
	
}
public void toonBord(){
	
	TestSpel.toonBord(spel.toonBord());
}
public void verwijderKleur(int kleur) {
	spel.verwijderKleur(kleur);
	
}
}
