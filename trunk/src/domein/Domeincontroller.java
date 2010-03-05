package domein;
import domein.Spel;


public class Domeincontroller {
	Spel spel;

public void startNieuwSpel(int aantalSpelers){
	spel = new Spel(aantalSpelers);
}
public int[] toonBeschikbareKleuren(){
	return spel.toonBeschikbareKleuren();
}
public void voegSpelerToe(int kleur, String naam){
	spel.voegSpelerToe(kleur, naam);
}
public void startSpel(){
	spel.StartSpel;
}
public String[][] toonBord(){
	spel.toonBord();
}
}
