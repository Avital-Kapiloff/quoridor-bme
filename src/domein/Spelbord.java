package domein;


public class Spelbord {

	public int[][] bord;
	
	public Spelbord(int rij,int kolom){
		int dimensie=(rij*2)-1;
		bord= new int[dimensie][dimensie];
	}
	

}
