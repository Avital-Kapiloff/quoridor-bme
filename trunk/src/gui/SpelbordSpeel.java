package gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import domein.Spelbord;
import domein.SpelbordInterface;
import domein.SpelbordVGUI;


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
public class SpelbordSpeel extends javax.swing.JFrame{
	SpelbordInterface sI = new SpelbordVGUI();
	HarounsDebugger d = new HarounsDebugger();
	GUIController gc = new GUIController();
	SpelBordVak[][] spelbord = new SpelBordVak[17][17];//[gc.dc.toonBord().length][gc.dc.toonBord().length];
	
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
		System.out.println(sI.getBord());
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
					
					for(int i=0;i<17;++i){//gc.dc.toonBord().length
						for(int j=0;j<17;++j){ //gc.dc.toonBord().length
							spelbord[i][j] = new SpelBordVak();
							if(i%2==0 && j%2==0){spelbord[i][j].pionVak(xPos, yPos);}
							if(i%2==0 && j%2!=0){spelbord[i][j].muurVakVert(xPos, yPos);}
							if(i%2!=0 && j%2==0){spelbord[i][j].muurVakHori(xPos, yPos);}
							if(i%2!=0 && j%2!=0){spelbord[i][j].muurVakMid(xPos, yPos);}
							spelbord[i][j].plaatsVak(getContentPane());
							spelbord[i][j].setVakNr(i+j+(16*i));
							xPos+=spelbord[i][j].vak().getWidth();
							
							spelbord[i][j].vak().setName(String.valueOf(spelbord[i][j].getVakNr()));
							
							//d.p(spelbord[i][j].getVakNr()+"|"+spelbord[i][j].getVakPos()[0] +"*"+ spelbord[i][j].getVakPos()[1]);
							
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
			
			//speler[0] = new SpelBordPion("Harountje", "Groen");
			
			//speler.verplaatsNaar(spelbord[0][8].getVakPos()[0], spelbord[0][8].getVakPos()[1]);
			
			
		//	speler[0].getPion().addMouseListener(new MouseAdapter() {
		//		public void mouseClicked(MouseEvent evt) {
		//			verplaats(1);
		//		}
		//	});

		//	speler[0].getPion().moveTo(spelbord[0][8].getVakPos()[0], spelbord[0][8].getVakPos()[1]);
		//	speler[0].setVakNr(8);
		//	speler[0].setPos(spelbord[0][8].getVakPos());
			//JLabel dummy = new JLabel();
			//dummy.setLocation(0, 0);
			
			SpelBordPion[] s = new SpelBordPion[9];
			JLabel dummy = new JLabel();
			
			
			s[0] = new SpelBordPion("Her", "rood");
			s[1] = new SpelBordPion("GGer", "blauw");
			s[2] = new SpelBordPion("azerty", "geel");
			s[3] = new SpelBordPion("fdfdf", "cyan");
			s[4] = new SpelBordPion("Her", "magenta");
			s[5] = new SpelBordPion("GGer", "grijs");
			s[6] = new SpelBordPion("azerty", "roze");
			s[7] = new SpelBordPion("fdfdf", "oranje");
			s[8] = new SpelBordPion("fdfdf", "groen");
			
			s[0].verplaatsNaar(0, 0);
			s[1].verplaatsNaar(75, 75);
			s[2].verplaatsNaar(150, 150);
			s[3].verplaatsNaar(225, 225);
			s[4].verplaatsNaar(275, 275);
			s[5].verplaatsNaar(325, 325);
			s[6].verplaatsNaar(400, 400);
			s[7].verplaatsNaar(450, 450);
			s[8].verplaatsNaar(500, 500);
			
			getContentPane().add(s[0].getPion(),0);
			getContentPane().add(s[1].getPion(),0);
			getContentPane().add(s[2].getPion(),0);
			getContentPane().add(s[3].getPion(),0);
			getContentPane().add(s[4].getPion(),0);
			getContentPane().add(s[5].getPion(),0);
			getContentPane().add(s[6].getPion(),0);
			getContentPane().add(s[7].getPion(),0);
			getContentPane().add(s[8].getPion(),0);
			
			getContentPane().add(dummy,0); // deze is voor de bug te overbruggen, moet altijd als het laatste geAdded worden
			setPionPlaats(1);
			
			//s[3].verplaatsNaar(500, 500);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setPionPlaats(int spelerNr){
		
		//System.out.println(spelbord[6][6].vak().getY());
		
		spelbord[0][6].vakSelectable();
		spelbord[2][8].vakSelectable();
		spelbord[0][10].vakSelectable();
		//spelbord[speler[spelerNr-1].getVaknr()+34][speler[spelerNr-1].getVaknr()+2].vakSelectable();
	}
	
	public void verplaats(int spelerNr){
		//speler[spelerNr-1].getPion();
	}
}
