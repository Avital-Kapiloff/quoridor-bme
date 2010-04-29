package gui;
 
import java.awt.Component;

import java.awt.Graphics;  
import java.awt.Color;  
   
 public class DrawCircleInJFrame extends Component  
 {  
	 
	private int x, y;
	private final int SIZE=40;
	private Color c;
	 
 public DrawCircleInJFrame(String kleur)  
 {   
	 	this.x=x;
		this.y=y;
		setC(kleur);
 }  
   
 public void paint(Graphics g)  
 {  
	 	super.paint(g);  
  		g.setColor(c);  
  		g.fillOval(x,y,SIZE,SIZE);
 	}  
	

	public Color getC() {
		return c;
	}

	public void setC(String kleur) {
		
		
		if(kleur.equals("Blauw")){
     	c=Color.blue;
     }
		if(kleur.equals("Cyan")){
     	c=Color.cyan;
     }
		if(kleur.equals("Geel")){
     	c=Color.yellow;
     }
		if(kleur.equals("Grijs")){
     	c=Color.gray;
     }
		if(kleur.equals("Groen")){
     	c=Color.green;
     }
		if(kleur.equals("Magenta")){
     	c=Color.magenta;
     }
		if(kleur.equals("Oranje")){
     	c=Color.orange;
     }
		if(kleur.equals("Rood")){
     	c=Color.red;
     }
		if(kleur.equals("Roze")){
     	c=Color.pink;
     }

	}

	public void moveTo(int xpos, int ypos){
		x=xpos; y=ypos;
		}
 }  