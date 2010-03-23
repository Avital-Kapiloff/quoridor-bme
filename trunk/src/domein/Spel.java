package domein;
import java.util.*;

import domein.Spelbord;
import domein.Speler;

public class Spel {
		
	private int aantalSpelers;
	private List<String> beschikbareKleuren= new ArrayList<String>();
	private Speler huidigeSpeler;
	private List<Speler> spelers;
	private int spelerTeller=0;
	
	Speler[] speler;
	
	private Spelbord spelbord;
	private final int GROOTTE_BORD = 17;
	
	public Spel(int aantalSpelers){
		setKleuren();
		spelbord = new Spelbord(GROOTTE_BORD,GROOTTE_BORD);
	}
	//---------------------------------------------------------------
	
	
		public void setHuidigeSpeler(){//behoort niet tot ITERATIE 1
		/*dit kan ook korter verwezlijkt worden met ne teller
		 *de huidige speler zal eerst de speler zijn die het laatst is, wordt gedeclareerd bij het toevoegen van spelers; 
		 *	
		 *	public Speler huidigeSpeler= speler[3]; 
		 * 	teller=3
		 * 	
		 * if(teller==(aantalSpelers-1) && aantalSpelers==4){teller=0;}else if(aantalSpelers==4){++teller;}
		 * if(teller==(aantalSpelers-1) && aantalSpelers==2){teller=0;}else if(aantalSpelers==2){++teller;}
		 * huidigeSpeler=speler[teller];
		 * 
		 * */

	}
	//---------------------------------------------------------------
	
	public String toonBeschikbareKleuren(){
		
		StringBuilder builder = new StringBuilder();
		for(String kleur: beschikbareKleuren)
		{
			builder.append(kleur).append(", ");
		}
		return builder.toString();
	}
	//---------------------------------------------------------------
	
	public void verwijderKleur(int kleurCode) {
		beschikbareKleuren.remove(kleurCode);
	}
	
	//---------------------------------------------------------------
	public void setKleuren(){
		/*
		 * .addAll() kan ook gebruikt worden maar .add(index, waarde) zal voorlopig gebruikt worden omdat het overzichtelijker is
		 * */
		
		beschikbareKleuren.add("Zwart");
		beschikbareKleuren.add("Geel");
		beschikbareKleuren.add("Rood");
		beschikbareKleuren.add("Groen");
		
	}
	//---------------------------------------------------------------
	public void voegSpelerToe(String naam, int kleur){
		speler[spelerTeller] = new Speler(naam,kleur);
		++spelerTeller;
	}
	
	//---------------------------------------------------------------
	
	public int[] startPositieBepalen(){
				
		int[] posReturn = new int[2];
		int midden=((spelbord.getBord().length-1)/2);
		int midden2=midden*2;
		/*
		 * midden en midden2 wordt aangemaakt om minder rekenwerk uit te voeren
		 * 
		 * 123		midden= 	index 1	->4
		 * 456		midden2=	index 2 ->7
		 * 789
		 * */
		
			//String.valueOf(spelbord.bord[0][1]);
		
		if(spelbord.getBord()[0][midden] ==0){			//NOORD
			posReturn[0]=0;
			posReturn[1]=midden;
		}else 
			if(spelbord.getBord()[midden2][midden] ==0){	//ZUID
			posReturn[0]=midden2;
			posReturn[1]=midden;
		}else 
			if(spelbord.getBord()[midden][0] ==0){		//WEST
			posReturn[0]=midden;
			posReturn[1]=0;
		}else 
			if(spelbord.getBord()[midden][midden2] ==0){	//OOST   laatste if is overbodig maar zal gebruikt worden voor tijdens het debuggen
			posReturn[0]=midden;
			posReturn[1]=midden2;
		}
		
		return posReturn;
		
	}
	//---------------------------------------------------------------
	
	public void startSpel(){
		
	}
	
	public int[][] toonBord(){
		return spelbord.getBord();
	}
	

}	

