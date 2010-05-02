package gui;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class SpelBordVak {
	private JLabel vak=new JLabel();
	private int vakNr;
	private int[] vakPos = new int[2];
	
	public void setVakPos(int xPos, int yPos){
		vakPos[0]=xPos;
		vakPos[1]=yPos;
	}
	
	public int[] getVakPos(){
		return vakPos;
	}
	
	public void pionVak(int xPos,int yPos){
		vak.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/vak.png")));
		vak.setBounds(xPos, yPos, 50, 50);
		setVakPos(xPos, yPos);
	}
	
	public void muurVakHori(int xPos, int yPos){
		vak.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/muurVakHori.png")));
		vak.setBounds(xPos, yPos, 50, 25);
		setVakPos(xPos, yPos);
	}
	
	public void muurVakVert(int xPos, int yPos){
		vak.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/muurVakVert.png")));
		vak.setBounds(xPos, yPos, 25, 50);
		setVakPos(xPos, yPos);
	}
	
	public void muurVakMid(int xPos, int yPos){
		vak.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/muurVakMid.png")));
		vak.setBounds(xPos, yPos, 25, 25);
		setVakPos(xPos, yPos);
	}
	
	public void vakSelectable(){
		vak.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/pionVakSelecteable.gif")));
		}
	public void vakNOTSelectable(){
		vak.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/vak.png")));
	}
	
	/*public void plaatsBord(Container c){
		c.add(vak);
	}*/ //deze hoort in de controller te zitten?
	
	public void plaatsVak(Container c){
		c.add(vak,0);
	}
	
	public JLabel vak(){
		return vak;
	}
	
	public void setVakNr(int vakNr){
		this.vakNr=vakNr;
	}
	
	public int getVakNr(){
		return vakNr;
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
	v[1].vak().addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent evt) {
			System.out.println("jButton1.mouseClicked, event="+evt);
			//TODO add your code for jButton1.mouseClicked
		}
	});
	
	}*/
}
