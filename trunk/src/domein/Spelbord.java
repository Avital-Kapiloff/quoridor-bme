package domein;

public class Spelbord{


	private int size;
	private Vak[][] spelBord;
	
	public Spelbord(int size){
		setSize(size);
		spelBord = new Vak[getSize()][getSize()];
		//System.out.println(getBord());
	}

	public Spelbord() {
	}

	public void genereerBord(){
		
		for(int i=0;i<getSize();++i){
			for(int j=0;j<getSize();++j){
				spelBord[i][j]= new Vak(i+j+(10*i)+(6*i));
				if(i%2==0 && j%2==0){spelBord[i][j].zetTypePionVak();}
				if(i%2==0 && j%2!=0 || i%2!=0 && j%2==0 || i%2!=0 && j%2!=0){spelBord[i][j].zetTypeMuurVak();}
				spelBord[i][j].setVakNr(i+j+((getSize()-1)*i));//10 6
			}
		}
		
		/*int xPos=0;
		int yPos=0;
		
		for(int i=0;i<getSize();++i){
			for(int j=0;j<getSize();++j){
				spelBord[i][j]= new Vak();
				if(i%2==0 && j%2==0){spelBord[i][j].pionVak(xPos, yPos);spelBord[i][j].zetTypePionVak();}
				if(i%2==0 && j%2!=0){spelBord[i][j].muurVakVert(xPos, yPos);spelBord[i][j].zetTypeMuurVak();}
				if(i%2!=0 && j%2==0){spelBord[i][j].muurVakHori(xPos, yPos);spelBord[i][j].zetTypeMuurVak();}
				if(i%2!=0 && j%2!=0){spelBord[i][j].muurVakMid(xPos, yPos);spelBord[i][j].zetTypeMuurVak();}
				spelBord[i][j].setVakNr(i+j+(10*i)+(6*i));
				xPos+=spelBord[i][j].vak().getWidth();
			}
			xPos=0;
			yPos+=spelBord[i][0].vak().getHeight();
		}*/
	}
	
	public int getSize() {
		return size;
	}

	private void setSize(int size) {
		if(size>0 && size%2!=0){this.size = size;}else{this.size=17;}
	}
	
	public Vak[][] getBord(){
		return spelBord;
	}
	
	/*
	private int[][] bord;
	
	public Spelbord(int rij,int kolom){
		//int dimensie=(rij*2)-1;
		bord= new int[rij][kolom];
	}

	public int[][] getBord() {
		return bord;
	}

	public void setBord(int[][] bord) {
		this.bord = bord;
	}
	
	public void setPositie(int posx, int posy,int type){
		bord[posx][posy]=type;
	}
	*/
}