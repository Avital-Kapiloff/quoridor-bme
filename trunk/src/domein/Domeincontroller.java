package domein;
//import ui.TestSpel;
import java.util.List;
import java.util.ResourceBundle;



import javax.swing.JOptionPane;

public class Domeincontroller {
	private Spel spel;
	private ResourceController rc =  new ResourceController();

public ResourceBundle getMessages(){
	return rc.getMessages();
}
public void setMessages(int keuze){
	rc.setMessages(keuze);
}
public void startNieuwSpel(int aantalSpelers){
	
	spel = new Spel(aantalSpelers,rc);
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

public Vak[][] toonBord(){
	return spel.toonBord();
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
