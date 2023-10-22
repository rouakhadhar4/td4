package td4;

public class livre {
	protected String titre;
	protected int identifiant;
	protected final double TVA=0.1;
	protected String domaine;
	protected int nb_pages;
	livre(String titre,int identifiant,double TVA,String domaine,int nb_pages)
	{
		this.titre=titre;
		this.identifiant=identifiant;
		//this.TVA=TVA;
		this.domaine=domaine;
		this.nb_pages=nb_pages;
		
		
	}
	
	
	@Override
    public String toString() {
        return "le titre:  " + titre + " son identifiant:  " + identifiant + "son domaines:  " +domaine+"nb de pages :"+nb_pages+"pages";
    }
	public double calculePrix()
	{
		double prix=0;
	
		return prix = (0.075 * nb_pages)*(1+TVA);
	}


	
	
	

	
	
	

}
