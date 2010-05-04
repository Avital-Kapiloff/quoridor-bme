package domein;

public class Pion
{
private int kleur;
private int[] cord;


	public Pion(int kleur, int[] cord)
	{
		setKleur(kleur);
		setCord(cord);
	}
		
		public int getKleur() 
		{
			return kleur;
		}


		public void setKleur(int kleur) 
		{
			this.kleur = kleur;
		}


		public int[] getCord() 
		{
			return cord;
		}


		public void setCord(int[] cord) 
		{
			this.cord = cord;
		}
	}
	

