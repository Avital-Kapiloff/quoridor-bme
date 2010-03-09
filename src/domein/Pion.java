package domein;


public class Pion
{
private int kleur;
private int startPosX;
private int startPosY;
private String zijde;



	public Pion(int kleur,int startPosX, int startPosY, String zijde)
	{
		setKleur(kleur);
		setStartPosX(startPosX);
		setStartPosY(startPosY);
		setZijde(zijde);
	}
	
	public void setKleur(int kleur)
	{
		this.kleur = kleur;
	}
	
	public void setStartPosX(int startPosX)
	{
		this.startPosX = startPosX;
	}

	public void setStartPosY(int startPosY) 
	{
		this.startPosY = startPosY;
	}

	public void setZijde(String zijde) 
	{
		this.zijde = zijde;
	}

	public int getKleur() 
	{
		return kleur;
	}

	public int getStartPosX() 
	{
		return startPosX;
	}
	
	public int getStartPosY() 
	{
		return startPosY;
	}

	public String getZijde() 
	{
		return zijde;
	}


}

