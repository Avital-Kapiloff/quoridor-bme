package gui;

import java.lang.reflect.Constructor;
import java.util.List;

public class ReflectionController {
	private String packageNaam="";
	private Class[] cls;
	private int aantalClasses;
	private int huidigFrame;

	public ReflectionController(String packageNaam){
		setPackageNaam(packageNaam);
	}
	
	public void setClassList(List<String> lstClassList){
		int teller=0;
		
		//System.out.println(lstClassList.size());
		
		cls = new Class[lstClassList.size()];
		try{
		for(String lstCL:lstClassList)
		{
			cls[teller] = Class.forName(packageNaam+"."+lstCL);
			++teller;
		}
		
		}catch(Throwable e){System.err.println(e);}
		
		setAantalClasses(teller);
	}
	
	public void setNextForm(){

		if(huidigFrame!=aantalClasses){
		try {
			Constructor cs = cls[huidigFrame].getConstructor(null);
			Object retobj = cs.newInstance(null);
			++huidigFrame;
			
			//System.out.println("--" + huidigFrame);
			}
			catch (Throwable e) {System.err.println(e);}
		}
	}
	
	
	/*
	 * GETTERS AND SETTERS
	 */
	
	public String getPackageNaam() {
		return packageNaam;
	}

	public void setPackageNaam(String packageNaam) {
		this.packageNaam = packageNaam;
	}
	
	private void setAantalClasses(int aantalClasses) {
		this.aantalClasses = aantalClasses;
	}
	
	public int getAantalClasses(){
		return aantalClasses+1;
	}

	/*
	 * 
	 * */
}