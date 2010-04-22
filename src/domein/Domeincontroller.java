package domein;
//import ui.TestSpel;
import java.util.List;

public class Domeincontroller {
	private Spel spel;

public void startNieuwSpel(int aantalSpelers){
	
	spel = new Spel(aantalSpelers);
}
public List<String> toonBeschikbareKleuren(){
	return spel.toonBeschikbareKleuren();
}
public void voegSpelerToe(String naam, String kleur){
	spel.voegSpelerToe(naam, kleur);
}
public void startSpel(){
	spel.startSpel();
}

public void toonBord(){
	
	//TestSpel.toonBord(spel.toonBord());
}
public void verwijderKleur(String kleur) {
	spel.verwijderKleur(kleur);
	
}

public int getAantalSpelers(){
	return spel.getAantalSpelers();
}

public void zetKleuren(){
	spel.setKleuren();
}

}
