package gui;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DebugGraphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;

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
public class KiesAantalSpelersFancyPants extends javax.swing.JFrame {
	//private JLabel layout;
	//private JButton btn4Spelers;
	private JLabel flayout;
	private JLabel lblS4;
	private JLabel lblS2;
	//private JLabel lblKiesAantalSpelers;
	//private JButton btn2Spelers;
	private GUIController gc = new GUIController();
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				KiesAantalSpelersFancyPants inst = new KiesAantalSpelersFancyPants();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public KiesAantalSpelersFancyPants() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			setTitle("Kies aantal spelers");
			
			/*{
				btn2Spelers = new JButton();
				getContentPane().add(btn2Spelers);
				btn2Spelers.setBounds(234, 164, 50, 50);
				btn2Spelers.setText("2");
				btn2Spelers.setFont(new java.awt.Font("Segoe UI",0,28));
				//btn2Spelers.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
				//btn2Spelers.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/layoutKiesaantalSpelers-2.png")));
				btn2Spelers.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						btn2SpelersMouseClicked(evt);
					}
					/*public void mouseExited(MouseEvent evt) {
						btn2SpelersMouseExited(evt);
					}
					public void mouseEntered(MouseEvent evt) {
						btn2SpelersMouseEntered(evt);
					}
				});
			}*/
			/*{
				btn4Spelers = new JButton();
				getContentPane().add(btn4Spelers);
				btn4Spelers.setBounds(234, 214, 50, 50);
				btn4Spelers.setFont(new java.awt.Font("Segoe UI",0,28));
				btn4Spelers.setText("4");
				//btn4Spelers.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/layoutKiesaantalSpelers-4.png")));
				btn4Spelers.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						btn4SpelersMouseClicked(evt);
					}
					/*public void mouseExited(MouseEvent evt) {
						btn4SpelersMouseExited(evt);
					}
					public void mouseEntered(MouseEvent evt) {
						btn4SpelersMouseEntered(evt);
					}
				});
			*/
			
			/*{
				lblKiesAantalSpelers = new JLabel();
				getContentPane().add(lblKiesAantalSpelers);
				lblKiesAantalSpelers.setText("Kies de gewenste aantal spelers");
				lblKiesAantalSpelers.setBounds(0, 231, 228, 25);
				lblKiesAantalSpelers.setFont(new java.awt.Font("Segoe UI",0,16));
			}*/
			{
				flayout = new JLabel();
				getContentPane().add(flayout);
				flayout.setBounds(69, 26, 236, 208);
				flayout.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/layoutKiesaantalSpelers.png")));
			}
			{
				lblS2 = new JLabel();
				getContentPane().add(lblS2);
				lblS2.setBounds(224, 49, 55, 52);
				lblS2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/layoutKiesaantalSpelers-2.png")));
				lblS2.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						gc.dc.startNieuwSpel(2);
						gc.setAllKleurenVanSpel(gc.dc.toonBeschikbareKleuren());
						gc.rc.setNextForm();
						dispose();
					}
					public void mouseExited(MouseEvent evt) {
						lblS2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/layoutKiesaantalSpelers-2.png")));
					}
					public void mouseEntered(MouseEvent evt) {
						lblS2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/layoutKiesaantalSpelers-2-rollover.png")));
					}
				});
			}
			{
				lblS4 = new JLabel();
				getContentPane().add(lblS4);
				lblS4.setBounds(223, 109, 57, 49);
				lblS4.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/layoutKiesaantalSpelers-4.png")));
				lblS4.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						gc.dc.startNieuwSpel(4);
						gc.setAllKleurenVanSpel(gc.dc.toonBeschikbareKleuren());
						gc.rc.setNextForm();
						dispose();
					}
					public void mouseExited(MouseEvent evt) {
						lblS4.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/layoutKiesaantalSpelers-4.png")));
					}
					public void mouseEntered(MouseEvent evt) {
						lblS4.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/layoutKiesaantalSpelers-4-rollover.png")));
					}
				});
			}

			/*{
				SpelBordVak[] v = new SpelBordVak[2];
				v[0] = new SpelBordVak();
				v[1] = new SpelBordVak();
				v[0].zetTypeMuurVak();
				v[0].muurVakVert(5, 5);
				v[0].plaatsVak(getContentPane());
				v[1].zetTypePionVak();
				v[1].pionVak(30, 5);
				v[1].plaatsVak(getContentPane());
				
				v[0].vak().setName("vak 0");
				v[1].vak().setName("vak 1");
				
				v[0].vak().addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						
						System.out.println(evt.toString());
						//TODO add your code for jButton1.mouseClicked
					}
				});
				
				v[1].vak().addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						System.out.println(evt.getID());
						//System.out.println("jButton1.mouseClicked, event="+evt);
						//TODO add your code for jButton1.mouseClicked
					}
				});
				
				
				}*/
			
			
			pack();
			
			this.setBounds(0, 0, 370, 305);
			this.setLocation(new java.awt.Point(gc.getMiddelWidth(this.getWidth()), gc.getMiddelHeight(this.getHeight())));
			this.setVisible(true);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
}

	/*
	private void btn2SpelersMouseEntered(MouseEvent evt) {
		btn2Spelers.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/layoutKiesaantalSpelers-2-rollover.png")));
	}
	
	private void btn2SpelersMouseExited(MouseEvent evt) {
		btn2Spelers.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/layoutKiesaantalSpelers-2.png")));
	}
	
	private void btn4SpelersMouseEntered(MouseEvent evt) {
		btn4Spelers.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/layoutKiesaantalSpelers-4-rollover.png")));
	}
	
	private void btn4SpelersMouseExited(MouseEvent evt) {
		btn4Spelers.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/layoutKiesaantalSpelers-4.png")));
	}
	*/
	private void btn2SpelersMouseClicked(MouseEvent evt) {
		gc.dc.startNieuwSpel(2);
		gc.setAllKleurenVanSpel(gc.dc.toonBeschikbareKleuren());
		gc.rc.setNextForm();
		this.dispose();
	}
	
	private void btn4SpelersMouseClicked(MouseEvent evt) {
		gc.dc.startNieuwSpel(4);
		gc.setAllKleurenVanSpel(gc.dc.toonBeschikbareKleuren());
		gc.rc.setNextForm();
		this.dispose();
	}

}
