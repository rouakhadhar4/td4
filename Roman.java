package td4;

public class Roman extends livre {
	private String auteur;
	private String editeur;
	Roman(String titre,int identifiant,double TVA,String domaine,int nb_pages,String auteur,String editeur)
	{
		super(titre,identifiant,TVA,domaine,nb_pages);
		this.auteur=auteur;
		this.editeur=editeur;
		
	}
	@Override
    public String toString() {
        return super.toString()+"auteur:"+auteur+"editeur:"+editeur;
	}
	public void  affichier()
	{
		System.out.println(toString()+this.getClass().getSimpleName());
		
	}
	public double calculePrix()
	{
		double prix=0;
	
		return  prix = (0.05 * nb_pages)*(1+TVA);
	}
	
	
	
	

}
