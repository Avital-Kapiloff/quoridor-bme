package domein;

import ui.TestSpel;

public class Domeincontroller {
	Spel spel;

public void startNieuwSpel(int aantalSpelers){
	spel = new Spel(aantalSpelers);
}
public String toonBeschikbareKleuren(){
	return spel.toonBeschikbareKleuren();
}
public void voegSpelerToe(int kleur, String naam){
	spel.voegSpelerToe(kleur, naam);
}
public void startSpel(){
	spel.startSpel();
}

public void toonBord(){
	
	TestSpel.toonBord(spel.toonBord());
}
}
