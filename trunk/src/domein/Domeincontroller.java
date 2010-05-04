package domein;
//import ui.TestSpel;
import java.util.List;
import java.util.ResourceBundle;

public class Domeincontroller {
	private Spel spel;
	public SpelbordInterface spelbordInterface;

public void startNieuwSpel(int aantalSpelers){
	
	spel = new Spel(aantalSpelers);
	spelbordInterface= spel;
}
public List<String> toonBeschikbareKleuren(){
	return spel.toonBeschikbareKleuren();
}
public void voegSpelerToe(String naam, String kleur){
	spel.voegSpelerToe(naam, kleur);
}
private ResourceController rc =  new ResourceController();

public ResourceBundle getMessages(){
	return rc.getMessages();
}
public void setMessages(int keuze){
	rc.setMessages(keuze);
}
public void startSpel(){
	spel.startSpel();
}

/*public String toonBord(){
	StringBuilder f = new StringBuilder();
	
	for(int i =0;i<16;i++){
		for(int j =0;i<16;j++){
			f.append(spel.toonBord()[i][j].toString());
		}
	}
	
	
	return f.toString();			//via interface
}*/
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
