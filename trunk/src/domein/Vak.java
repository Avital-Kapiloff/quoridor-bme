package domein;

public class Vak {
	private String vakType= new String();
	private Boolean heeftPion = false;
	private Boolean heeftMuur =false;
	private int vakNr;
	
	public Vak(){}
	
	public Vak(int vakNr){
		
		setVakNr(vakNr);
	}
	
	public int getVakNr() {
		return vakNr;
	}

	public void setVakNr(int vakNr) {
		this.vakNr = vakNr;
	}

	public Boolean isLeeg(){
		return (heeftMuur)?false:(heeftPion)?false:true;
	}
	public void maakLeeg(){
		heeftPion = false;
		heeftMuur =false;
	}
	
	public void zetTypeMuurVak(){
		vakType="muur";
	}
	public void zetTypePionVak(){
		vakType="pion";
	}
	
	public String getVakType(){
		return vakType;
	}
}
