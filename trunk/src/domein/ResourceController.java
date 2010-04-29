package domein;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

public class ResourceController {
	private ResourceBundle messages;
	public ResourceController(int keuze){
		setMessages(keuze);
	}

	public ResourceController(){
		/*int keuze;

		do
		{
			keuze = Integer.parseInt(JOptionPane.showInputDialog("To continue in english, press 1; Pour continuer en Français, puissez 2; Om verder te gaan in het nederlands, druk 3."));
		}while (keuze < 0 || keuze > 3);
		setMessages(keuze);*/
	}
	public void setMessages(int keuze){
	    String language;
	    String country;
		switch(keuze)
	    {
			  case 1:language = new String("en");
	               country = new String("US");
	               break;
			  case 2:language = new String("fr");
	               country = new String("FR");
	               break;
			  default:language = new String("nl");
	               country = new String("BE");
	               break;
		  }

	    Locale currentLocale = new Locale(language, country);

	    messages = ResourceBundle.getBundle("MessagesBundle",currentLocale);
		
	}
	public ResourceBundle getMessages(){
	    return messages;
		
	}

}
