package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.WindowConstants;
import javax.swing.JFrame;

public class SpelBordPanel extends javax.swing.JPanel {

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new SpelBordPanel());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public SpelBordPanel() {
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
			this.setLayout(thisLayout);
			this.setPreferredSize(new java.awt.Dimension(900, 900));
			this.setSize(1000,1000);
			
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
					this.add(test[i][j]);
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
	
	
}
