package ui;
import domein.Domeincontroller;
import java.util.*;

public class TestSpel{
	
public static void main(String args[]){
	System.out.println("console gestart");
	Scanner sc = new Scanner(System.in);
	Domeincontroller dc = new Domeincontroller();
	int stop=0;
	while (stop != 1){
	toonMenu("wat wil je doen?\n 1:startNieuwSpel\n 2:toonBeschikbareKleuren\n 3:VoegSpelerToe\n 4:StartSpel\n 5:toonBord");

	switch (sc.nextInt()){
	case 1: System.out.println("geef het aantal spelers");dc.startNieuwSpel(sc.nextInt());break;
	case 2: dc.toonBeschikbareKleuren();break;
	case 3: System.out.println("geef de spelernaam in");String naam = sc.next(); System.out.println("geef het nummer van het kleur");int kleur = sc.nextInt();dc.voegSpelerToe(kleur, naam);
	case 4: dc.startSpel();break;
	case 5: dc.toonBord();break;
	}
	System.out.println("stoppen? 1 voor ja, 0 voor nee");
	stop = sc.nextInt();
}
		

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
