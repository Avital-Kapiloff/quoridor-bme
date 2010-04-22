package gui;

import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import domein.Spelbord;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.JButton;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class FOEFELARE extends javax.swing.JFrame {

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FOEFELARE inst = new FOEFELARE();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public FOEFELARE() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			pack();
			Spelbord sb = new Spelbord(17);
			sb.genereerBord();
			
			
			
			
			for(int i=0;i<sb.getSize();++i){
				for(int j=0;j<sb.getSize();++j){
					sb.getBord()[i][j].plaatsVak(getContentPane());
					sb.getBord()[i][j].vak().setName(String.valueOf(sb.getBord()[i][j].getVakNr()));
					sb.getBord()[i][j].vak().addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							System.out.println(evt.getComponent().getName());
						}
					});
				}
				
			}
			{
				JLabel jLabel1;
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("jLabel1");
			}
			{
				
			}

			setSize(800, 800);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void paint(Graphics graphics) {
		super.paintComponents(graphics);
        graphics.setColor(Color.cyan);
        graphics.fillOval(20, 45, 25, 25);
        //graphics.drawOval(25, 25, 40, 40);
    }

}
