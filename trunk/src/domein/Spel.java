<<<<<<< .mine
import java.util.*;
=======
package domein;
import ui.TestSpel;
>>>>>>> .r8

public class Spel {
	private int aantalSpelers;
	public int verkregenRij, verkregenKolom;
	private int[] beschikbareKleuren;
	Spelbord spelbord;
	
	public Spel(int aantalSpelers){
		this.aantalSpelers = aantalSpelers;		
		
	}
	
<<<<<<< .mine
	public int aantalSpelers;
	public ArrayList beschikbareKleuren;
=======

>>>>>>> .r8
	
<<<<<<< .mine
	Spelbord spelbord = new Spelbord(0,0); // hierin komen de rij/kolom (in volgorde) variabelen ;)
=======

>>>>>>> .r8
	
	
	
	public String toonBeschikbareKleuren(){
		
		String stringBeschikbareKleuren=new String();
		
		for(int i=0;i<(beschikbareKleuren.size()-1);i++){
			stringBeschikbareKleuren+=beschikbareKleuren.get(i) +", ";
		}
		return stringBeschikbareKleuren;
	}
	
	public void setKleuren(){
		/*
		 * .addAll() kan ook gebruikt worden, add zal voorlopig gebruikt worden omdat het overzichtelijker is
		 * */
		
		beschikbareKleuren.add("Zwart");
		beschikbareKleuren.add("Geel");
		beschikbareKleuren.add("Rood");
		beschikbareKleuren.add("Groen");
		
	}
	
	public void voegSpelerToe(){
		
		
	}
	
	public int[] startPositieBepalen(){
				
		int[] posReturn = new int[2];
		int midden=((spelbord.bord.length-1)/2);
		int midden2=midden*2;
		/*
		 * 123		midden= 	index 1	->4
		 * 456		midden2=	index 2 ->7
		 * 789
		 * */
		
			//String.valueOf(spelbord.bord[0][1]);
		
		if(spelbord.bord[0][midden] !=0){		//NOORD
			posReturn[0]=0;
			posReturn[1]=midden;
		}else 
			if(spelbord.bord[midden2][midden] !=0){	//ZUID
			posReturn[0]=midden2;
			posReturn[1]=midden;
		}else 
			if(spelbord.bord[midden][0] !=0){	//WEST
			posReturn[0]=midden;
			posReturn[1]=0;
		}else 
			if(spelbord.bord[midden][midden2] !=0){	//OOST   laatste if is overbodig maar zal gebruikt worden voor tijdens het debuggen
			posReturn[0]=midden;
			posReturn[1]=midden2;
		}
		
		return posReturn;
		
	}
	
	public void pion(int kleur, int startPosX, int startPosY){
		
	}
	
	public void startSpel(){
		
	}
	
	public int[][] toonBord(){

		return spelbord.spelbordVeld;
	}
	

	public void voegSpelerToe(int kleur, String naam){
		Speler speler = new Speler(kleur,naam);
	}

}	

