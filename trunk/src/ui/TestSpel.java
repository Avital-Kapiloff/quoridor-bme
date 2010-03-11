package ui;
import domein.Domeincontroller;
import java.util.*;

public class TestSpel{
	private static int aantalSpelers;
	private static Domeincontroller dc;
public static void main(String args[]){
	System.out.println("console gestart");
	Scanner sc = new Scanner(System.in);
	dc = new Domeincontroller();
	
	int stop=0;
	while (stop != 1){
	toonMenu("wat wil je doen?\n 1:startNieuwSpel\n 2:toonBeschikbareKleuren\n 3:VoegSpelerToe\n 4:StartSpel\n 5:toonBord");

	switch (sc.nextInt()){
	case 1: System.out.println("geef het aantal spelers");aantalSpelers = sc.nextInt();dc.startNieuwSpel(aantalSpelers);break;
	case 2: toon(dc.toonBeschikbareKleuren());break;
	case 3: voegToe();break;
	case 4: dc.startSpel();break;
	case 5: dc.toonBord();break;
	}
	System.out.println("stoppen? 1 voor ja, 0 voor nee");
	stop = sc.nextInt();
	}
}
		
public static void voegToe(){
	Scanner sc = new Scanner(System.in);

	for (int x=1;x<=aantalSpelers;x++){
		System.out.println("geef de spelernaam in");
		String naam = sc.next(); 
		System.out.println("geef het nummer van het kleur");
		int kleur = sc.nextInt();
		dc.voegSpelerToe(naam,kleur);
		//dc.verwijderKleur(kleur);
		System.out.println("speler toegevoegd en kleur verwijderd");
}
}
public static void toonBord(int[][] bord){
	String stringbord="";
	for (int x=0;x<17;x++){
		for (int y=0;y<17;y++){
			if (bord[x][y]==1)
				stringbord= stringbord + "+";	
			else
				stringbord= stringbord + "_";	
		}
	stringbord = stringbord + "\n";
	}
	System.out.println(stringbord);
}
public static void toon(String text){
	System.out.println(text);
}
public static void toonMenu(String items){
	String menu="#####################menu#######################\n";
	menu += String.format("##    %s   \n",items);
	menu += "################################################";
	System.out.println(menu);
}

}
