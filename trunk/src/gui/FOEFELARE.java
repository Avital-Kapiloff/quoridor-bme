package gui;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
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

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	GUIController gc = new GUIController();
	private JButton zetMuur;
	private JButton jButton1;
	private JLabel naamspeler;
	private JLabel status;
	Cirkel cc = new Cirkel("Geel");
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
			//Cirkel cl = new Cirkel(50,50,"Groen",getGraphics().create());
		//	System.out.println(cl.getC());
			
			
			setSize(800, 685);
			
			this.setTitle("Spelbord");
			//getContentPane().setBackground(new java.awt.Color(247,247,247));

		//	gc.dc.toonBord()[0][0].getVakType();
		//	SpelBordVak[][] spelbord = new SpelBordVak[gc.dc.toonBord().length][gc.dc.toonBord().length];
		/*	
			int xPos=0;
			int yPos=0;
			
			for(int i=0;i<gc.dc.toonBord().length;++i){
				for(int j=0;j<gc.dc.toonBord().length;++j){
					spelbord[i][j] = new SpelBordVak();
					if(i%2==0 && j%2==0){spelbord[i][j].pionVak(xPos, yPos);}
					if(i%2==0 && j%2!=0){spelbord[i][j].muurVakVert(xPos, yPos);}
					if(i%2!=0 && j%2==0){spelbord[i][j].muurVakHori(xPos, yPos);}
					if(i%2!=0 && j%2!=0){spelbord[i][j].muurVakMid(xPos, yPos);}
					spelbord[i][j].setVakNr(i+j+(10*i)+(6*i));
					xPos+=spelbord[i][j].vak().getWidth();
					spelbord[i][j].plaatsVak(getContentPane());
				}
				xPos=0;
				yPos+=spelbord[i][0].vak().getHeight();
				
					//sb.getBord()[i][j].plaatsVak(getContentPane());
					//sb.getBord()[i][j].vak().setName(String.valueOf(sb.getBord()[i][j].getVakNr()));
					//sb.getBord()[i][j].vak().addMouseListener(new MouseAdapter() {
						//public void mouseClicked(MouseEvent evt) {
						//	System.out.println(evt.getComponent().getName());
						//}
					//});
				
				
			}
			*/
			{
				SpelBordPion p = new SpelBordPion("blal", "rood");
			getContentPane().add(p.getPion());
				p.verplaatsNaar(500, 50);
			
				//System.out.println(spelbord[0][8].getVakPos()[0]);
			}
			//this.setLocation(new java.awt.Point(gc.getMiddelWidth(this.getWidth()), gc.getMiddelHeight(this.getHeight())));
			//this.setVisible(true);
			
			
			
			
			/*SpelBordPion sp = new SpelBordPion("Haroun", "Blauw");
				//getContentPane().add(sp.getPion());
				
				this.getContentPane().add(sp.getPion());
				
				
				
				sp.getPion().moveTo(700,700);
				
				getContentPane().add(cc);
				cc.moveTo(300, 300);
				cc.setSize(50, 50);
				cc.setBounds(50, 50, 50, 50);
				cc.setForeground(Color.blue);
				cc.setC("Blauw");
				cc.setLocation(new java.awt.Point(50, 50));
				System.out.println(cc);
				*/
			//	System.out.println(spelbord[0][8].getVakPos()[0]);
			//	sp.setPos(spelbord[0][8].getVakPos());
			/*
			{
				zetMuur = new JButton();
				getContentPane().add(zetMuur);
				zetMuur.setText("Plaats muur");
				zetMuur.setBounds(655, 28, 118, 40);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Stop spel");
				jButton1.setBounds(656, 79, 118, 40);
				jButton1.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						dispose();
					}
				});
			}
			{
				status = new JLabel();
				getContentPane().add(status);
				status.setText("Het is de beurt");
				status.setBounds(656, 138, 86, 21);
				status.setAlignmentY(0.0f);
			}
			{
				naamspeler = new JLabel();
				getContentPane().add(naamspeler);
				naamspeler.setText("aan de speler Jeffrey!");
				naamspeler.setBounds(656, 156, 117, 14);
			}*/
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
