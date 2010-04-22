package domein;

public class Vak {
	private String vakType= new String();
	private Boolean heeftPion = false;
	private Boolean heeftMuur =false;
	
	public Vak(/*String vakType*/){
		/*if(vakType.toLowerCase().equals("muur")){
			zetTypeMuurVak();
		}
			else
		{
			zetTypePionVak();
		}*/
	}
	
	public Boolean isLeeg(){
		return (heeftMuur)?true:(heeftPion)?true:false;
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
