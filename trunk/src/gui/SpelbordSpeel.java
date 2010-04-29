package gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
public class SpelbordSpeel extends javax.swing.JFrame {
	//Cirkel cc =new Cirkel("roze");
	SpelBordPion[] speler = new SpelBordPion[2];
	GUIController gc = new GUIController();
	SpelBordVak[][] spelbord = new SpelBordVak[gc.dc.toonBord().length][gc.dc.toonBord().length];
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SpelbordSpeel inst = new SpelbordSpeel();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public SpelbordSpeel() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			setSize(800, 685);
			setVisible(true);
			{
					int xPos=0;
					int yPos=0;
					
					for(int i=0;i<gc.dc.toonBord().length;++i){
						for(int j=0;j<gc.dc.toonBord().length;++j){
							spelbord[i][j] = new SpelBordVak();
							if(i%2==0 && j%2==0){spelbord[i][j].pionVak(xPos, yPos);}
							if(i%2==0 && j%2!=0){spelbord[i][j].muurVakVert(xPos, yPos);}
							if(i%2!=0 && j%2==0){spelbord[i][j].muurVakHori(xPos, yPos);}
							if(i%2!=0 && j%2!=0){spelbord[i][j].muurVakMid(xPos, yPos);}
							spelbord[i][j].setVakNr(i+j+(16*i));
							xPos+=spelbord[i][j].vak().getWidth();
							spelbord[i][j].plaatsVak(getContentPane());
							spelbord[i][j].vak().setName(String.valueOf(spelbord[i][j].getVakNr()));
							spelbord[i][j].vak().addMouseListener(new MouseAdapter() {
								public void mouseClicked(MouseEvent evt) {
									System.out.println(evt.getComponent().getName());
								}
							});
							//System.out.println(spelbord[i][j].getVakNr() + "-" + xPos +"|" + yPos);
						}
						xPos=0;
						yPos+=spelbord[i][0].vak().getHeight();	
					}
				
			}	
			
			speler[0]= new SpelBordPion("Haroun", "groen");
			speler[1]= new SpelBordPion("Mogly", "cyan");
			
			//Cirkel Cv = new Cirkel("blauw");
			
			getContentPane().add(speler[0].getPion(),0);
			getContentPane().add(speler[1].getPion(),0);
			//getContentPane().add(Cv,0);
			//System.out.println("-"+ko);
			
			//getContentPane().add(speler[0].getPion(),0);getContentPane().add(speler[1].getPion(),1);
			
			
			System.out.println(speler[1].getPion());
			
			speler[0].getPion().moveTo(spelbord[16][8].getVakPos()[0], spelbord[16][8].getVakPos()[1]);
			speler[1].getPion().moveTo(spelbord[0][8].getVakPos()[0], spelbord[0][8].getVakPos()[1]);
			//getContentPane().add(cc,0);
			//cc.moveTo(spelbord[16][16].getVakPos()[0], spelbord[16][16].getVakPos()[1]);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
