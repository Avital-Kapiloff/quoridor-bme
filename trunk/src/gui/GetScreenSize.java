package gui;

import java.awt.*;

public class GetScreenSize{
	
	private Dimension scrnsize;
	private Toolkit toolkit;
	
	public GetScreenSize(){ // gevonden op http://www.javacoffeebreak.com/faq/faq0015.html
		toolkit = Toolkit.getDefaultToolkit();
		scrnsize = toolkit.getScreenSize();
	}
	
	public int getWidth(){
		return scrnsize.width;
	}
	
	public int getHeight(){
		return scrnsize.height;
	}
}