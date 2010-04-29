package gui;
 
import java.awt.Component;

import java.awt.Graphics;  
import java.awt.Color;  

import javax.swing.JLabel;
   
 public class Cirkel extends JLabel  
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
		kleur.toLowerCase();
		if(kleur.equals("blauw")){
     	c=Color.blue;
     }
		if(kleur.equals("cyan")){
     	c=Color.cyan;
     }
		if(kleur.equals("geel")){
     	c=Color.yellow;
     }
		if(kleur.equals("grijs")){
     	c=Color.gray;
     }
		if(kleur.equals("groen")){
     	c=Color.green;
     }
		if(kleur.equals("magenta")){
     	c=Color.magenta;
     }
		if(kleur.equals("oranje")){
     	c=Color.orange;
     }
		if(kleur.equals("rood")){
     	c=Color.red;
     }
		if(kleur.equals("roze")){
     	c=Color.pink;
     }

	}

	public void moveTo(int xpos, int ypos){
		x=xpos; y=ypos;
		}
 }  