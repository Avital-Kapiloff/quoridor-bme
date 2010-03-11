package domein;
public class Spelbord {



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

}