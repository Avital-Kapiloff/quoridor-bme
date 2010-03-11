import java.util.*;

public class Spel {
	
	public Spel(int aantalSpelers){
		
	}
	
	public int aantalSpelers;
	public ArrayList beschikbareKleuren;
	public Speler huidigeSpeler;
	public ArrayList spelers;
	
	Speler speler1;
	Speler speler2;
	Speler speler3;
	Speler speler4;
	
	Spelbord spelbord = new Spelbord(0,0); // hierin komen de rij/kolom (in volgorde) variabelen ;)
	
	//---------------------------------------------------------------
	
	public String toonBeschikbareKleuren(){
		
		String stringBeschikbareKleuren=new String();
		
		for(int i=0;i<(beschikbareKleuren.size()-1);i++){
			stringBeschikbareKleuren+=beschikbareKleuren.get(i) +", ";
		}
		return stringBeschikbareKleuren;
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
		
		beschikbareKleuren.add(0, "Zwart");
		beschikbareKleuren.add(1, "Geel");
		beschikbareKleuren.add(2, "Rood");
		beschikbareKleuren.add(3, "Groen");
		
	}
	//---------------------------------------------------------------
	public void voegSpelerToe(String naam, int kleur){
		if(speler1.getNaam()==""){
			speler1 = new Speler(naam/*,kleur*/); // na naam moet de kleurcode nog komen, uit debugblabla heb ik ze er nog niet bij gezet
		}else
		if(speler2.getNaam()==""){
			speler2 = new Speler(naam/*,kleur*/); 
		}else
		if(speler3.getNaam()==""){
			speler3 = new Speler(naam/*,kleur*/);
		}else
		if(speler4.getNaam()==""){
			speler4 = new Speler(naam/*,kleur*/); 
		}
		
		
	}
	
	//---------------------------------------------------------------
	
	public int[] startPositieBepalen(){
				
		int[] posReturn = new int[2];
		int midden=((spelbord.bord.length-1)/2);
		int midden2=midden*2;
		/*
		 * midden en midden2 wordt aangemaakt om minder rekenwerk uit te voeren
		 * 
		 * 123		midden= 	index 1	->4
		 * 456		midden2=	index 2 ->7
		 * 789
		 * */
		
			//String.valueOf(spelbord.bord[0][1]);
		
		if(spelbord.bord[0][midden] !=0){			//NOORD
			posReturn[0]=0;
			posReturn[1]=midden;
		}else 
			if(spelbord.bord[midden2][midden] !=0){	//ZUID
			posReturn[0]=midden2;
			posReturn[1]=midden;
		}else 
			if(spelbord.bord[midden][0] !=0){		//WEST
			posReturn[0]=midden;
			posReturn[1]=0;
		}else 
			if(spelbord.bord[midden][midden2] !=0){	//OOST   laatste if is overbodig maar zal gebruikt worden voor tijdens het debuggen
			posReturn[0]=midden;
			posReturn[1]=midden2;
		}
		
		return posReturn;
		
	}
	//---------------------------------------------------------------
	
	public void startSpel(){
		
	}
	
	public int[][] toonBord(){
		return spelbord.bord;
	}
	

}	

