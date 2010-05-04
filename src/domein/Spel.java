package domein;
import java.util.*;

import domein.Spelbord;
import domein.Speler;

public class Spel implements SpelbordInterface{
		
	private int aantalSpelers;
	private List<String> beschikbareKleuren= new ArrayList<String>();
	private Speler huidigeSpeler = new Speler();
	//private List<Speler> spelers = new ArrayList<Speler>();
	private int spelerTeller=0;
	private int tellerHuidigeSpeler=3;
	Speler[] speler;
	
	private Spelbord spelbord;
	private final int GROOTTE_BORD = 17;
	
	public Spel(int aantalSpelers){
		setKleuren();
		spelbord = new Spelbord(GROOTTE_BORD);
		spelbord.genereerBord();
		setAantalSpelers(aantalSpelers);
		speler = new Speler[aantalSpelers];
		
	}
	
	public Spel() {}

	private void setAantalSpelers(int aantalSpelers){
		this.aantalSpelers = aantalSpelers;
	}
	
	public int getAantalSpelers(){
		return aantalSpelers;
	}
	
	//---------------------------------------------------------------
	
	
		public void setHuidigeSpeler(){  	
			if(tellerHuidigeSpeler>=(aantalSpelers-1)){tellerHuidigeSpeler=0;}else{++tellerHuidigeSpeler;}
		  //if(teller==(aantalSpelers-1) && aantalSpelers==4){teller=0;}else if(aantalSpelers==4){++teller;}
		 // if(teller==(aantalSpelers-1) && aantalSpelers==2){teller=0;}else if(aantalSpelers==2){++teller;}
		  huidigeSpeler=speler[tellerHuidigeSpeler]; 
		  System.out.println(huidigeSpeler.getNaam());
		 }
	//---------------------------------------------------------------
	
	public List<String> toonBeschikbareKleuren(){
		return beschikbareKleuren;

	}
	//---------------------------------------------------------------
	
	public void verwijderKleur(String kleur) {
		beschikbareKleuren.remove(kleur);
	}
	
	//---------------------------------------------------------------
	public void setKleuren(){
		
		beschikbareKleuren.add("Blauw");
		beschikbareKleuren.add("Cyan");
		beschikbareKleuren.add("Geel");
		beschikbareKleuren.add("Grijs");
		beschikbareKleuren.add("Groen");
		beschikbareKleuren.add("Magenta");
		beschikbareKleuren.add("Oranje");
		beschikbareKleuren.add("Rood");
		beschikbareKleuren.add("Roze");
		
		
		
	}
	//---------------------------------------------------------------
	public void voegSpelerToe(String naam, String kleur){//kleur voorlopig naar String veranderd ipv int
		speler[spelerTeller] = new Speler(naam,kleur);
		//spelers.add(new Speler(naam,kleur));
		//System.out.println(speler[spelerTeller].getNaam() + " | " + speler[spelerTeller].getKleur() );
		//System.out.println(spelers.get(spelerTeller).getNaam()+" ____ " +spelers.get(spelerTeller).getKleur());
		//System.out.println(spelers.get(spelerTeller).getNaam());
		++spelerTeller;
	}
	
	//---------------------------------------------------------------
	
	public int[] startPositieBepalen(){
				
		int[] posReturn = new int[2];
		int midden=((spelbord.getSize()-1)/2);
		int midden2=midden*2;
		/*
		 * midden en midden2 wordt aangemaakt om minder rekenwerk uit te voeren
		 * 
		 * 123		midden= 	index 1	->4
		 * 456		midden2=	index 2 ->7
		 * 789
		 * */
		
			//String.valueOf(spelbord.bord[0][1]);
		
		if(spelbord.getBord()[0][midden].isLeeg()){			//NOORD
			posReturn[0]=0;
			posReturn[1]=midden;
		}else 
			if(spelbord.getBord()[midden2][midden].isLeeg()){	//ZUID
			posReturn[0]=midden2;
			posReturn[1]=midden;
		}else 
			if(spelbord.getBord()[midden][0].isLeeg()){		//WEST
			posReturn[0]=midden;
			posReturn[1]=0;
		}else 
			if(spelbord.getBord()[midden][midden2].isLeeg()){	//OOST   laatste if is overbodig maar zal gebruikt worden voor tijdens het debuggen
			posReturn[0]=midden;
			posReturn[1]=midden2;
		}
		
		return posReturn;
		
	}
	//---------------------------------------------------------------
	
	public void startSpel(){
		
	}
	
	public Vak[][] toonBord(){
		return spelbord.getBord();
	}

	@Override
	public Vak[][] getBord() {
		return spelbord.getBord();
	}
	

}	

