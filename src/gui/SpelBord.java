package gui;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

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
public class SpelBord extends javax.swing.JFrame {


	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SpelBord inst = new SpelBord();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public SpelBord() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout(1, 1);
			thisLayout.setColumns(17);
			thisLayout.setRows(17);
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setPreferredSize(new java.awt.Dimension(900, 900));
			{
				
			}
			
				

			pack();
			this.setSize(1200, 902);

			zetBordKnop();
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
}
	public void zetBordKnop()
	{
				JButton[][] test =new JButton[17][17];
				int mip=0;
				for(int i=0;i<17;++i){
					for(int j=0;j<17;++j)
					{
						test[i][j] = new JButton();
					getContentPane().add(test[i][j]);
					//mip=i+j;
					if((i % 2)==0  && (j % 2)==0){ // ||(j % 2)!=0
						test[i][j].setText("O");//"PIONVAK"
						test[i][j].setForeground(Color.red);
						test[i][j].setBackground(Color.orange);
						test[i][j].addMouseListener(null);
					}else
					{
						test[i][j].setText(".");//"MUURVAK"
						test[i][j].setEnabled(true);
						test[i][j].setForeground(Color.BLACK);
						test[i][j].setBackground(Color.BLACK);
					}
					}
				}
	}
	
	
	private void jButton1MouseClicked(MouseEvent evt) {
		System.out.println("jButton1.mouseClicked, event="+evt);
		//TODO add your code for jButton1.mouseClicked
	}

}
