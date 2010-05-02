package gui;
 
import java.awt.Component;

import java.awt.Graphics;  
import java.awt.Color;
import javax.swing.JPanel;
   
 public class Cirkel extends Component  
 {  
	 
	private int x, y;
	private final int SIZE=50;
	private Color c;
	 
 public Cirkel(String kleur)  
 {   
	 	this.x=x;
		this.y=y;
		setC(kleur);
 }  
 public void paint(Graphics g)  
 	{  
	 	super.paint(g);  
  		g.setColor(getC());  
  		g.fillOval(x,y,SIZE,SIZE);
  		
 	}  
	

	public Color getC() {
		return c;
	}

	public void setC(String kleur) {
		
		if(kleur.toLowerCase().equals("blauw")){
     	c=Color.blue;
     }
		if(kleur.toLowerCase().equals("cyan")){
     	c=Color.cyan;
     }
		if(kleur.toLowerCase().equals("geel")){
     	c=Color.yellow;
     }
		if(kleur.toLowerCase().equals("grijs")){
     	c=Color.gray;
     }
		if(kleur.toLowerCase().equals("groen")){
     	c=Color.green;
     }
		if(kleur.toLowerCase().equals("magenta")){
     	c=Color.magenta;
     }
		if(kleur.toLowerCase().equals("oranje")){
     	c=Color.orange;
     }
		if(kleur.toLowerCase().equals("rood")){
     	c=Color.red;
     }
		if(kleur.toLowerCase().equals("roze")){
     	c=Color.pink;
     }

	}

	public void moveTo(int xpos, int ypos){
		x=xpos; y=ypos;
		}
 }  