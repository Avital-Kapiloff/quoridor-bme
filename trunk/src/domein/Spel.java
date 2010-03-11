package domein;

import java.util.*;

public class Spel {
	

	
	private int aantalSpelers;
	private List<String> beschikbareKleuren= new ArrayList<String>();
	private Speler huidigeSpeler;
	private List<Speler> spelers;
	
	/*Speler speler1= new Speler();
	Speler speler2= new Speler();
	Speler speler3= new Speler();
	Speler speler4= new Speler();
	*/
	private Spelbord spelbord;
	private final int GROOTTE_BORD = 17;
	
	public Spel(int aantalSpelers){
		setKleuren();
		spelbord = new Spelbord(GROOTTE_BORD,GROOTTE_BORD); // hierin komen de rij/kolom (in volgorde) variabelen ;)
	}
	
	//---------------------------------------------------------------
	
	public String toonBeschikbareKleuren()
	{	
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
		
		if(speler1.getNaam()==""){
			speler1 = new Speler(naam,kleur); // na naam moet de kleurcode nog komen, uit debugblabla heb ik ze er nog niet bij gezet
			spelbord.setPositie(startPositieBepalen()[0],startPositieBepalen()[1],1);
		}else
		if(speler2.getNaam()==""){
			speler2 = new Speler(naam,kleur); 
			spelbord.setPositie(startPositieBepalen()[0],startPositieBepalen()[1],1);
		}else
		if(speler3.getNaam()==""){
			speler3 = new Speler(naam,kleur);
		}else
		if(speler4.getNaam()==""){
			speler4 = new Speler(naam,kleur); 
		}
		
		
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

