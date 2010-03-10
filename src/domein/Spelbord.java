
public class Spelbord {

	private int rij;
	private int kolom;
	public int[][] spelbordVeld;
	
	public Spelbord(int rij,int kolom){
		int dimensie=(rij*2)-1;
		spelbordVeld= new int[dimensie][dimensie];
	}
	

}
