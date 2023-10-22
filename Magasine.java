package td4;

public class Magasine extends livre {
	private int mois_parution;
	
	Magasine(String titre,int identifiant,double TVA,String domaine,int nb_pages,int mois_parution)
	{
		super(titre,identifiant,TVA,domaine,nb_pages);
		this.mois_parution=mois_parution;
		
	}
	@Override
    public String toString() {
        return super.toString()+"mois_parution"+mois_parution;
	}
	public void  affichier()
	{
		System.out.println(toString()+this.getClass().getSimpleName());
		
	}
	public double calculPrix(int bonus)
	{
		double prix=0;
		return prix = (0.35 * nb_pages)*(1+TVA)+bonus;
	}
	
	

}
