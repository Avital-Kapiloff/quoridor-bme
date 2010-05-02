package gui;

import java.awt.Color;
import java.awt.Graphics;
import gui.DrawCircleInJFrame;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

public class CirkelTest extends javax.swing.JFrame {

	Cirkel cc =new Cirkel("Roze");
	
	//Circles cc = new Circles();
	
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CirkelTest inst = new CirkelTest();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
		
		
	}
	
	public CirkelTest() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			
			setSize(400, 300);
			
			setVisible(true);

			getContentPane().add(cc);
			
			//cc.moveTo(250, 100);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void drawCircle(Graphics g){
		super.paint(g);
		g.drawOval(80, 80, 200, 200);
	}
}
