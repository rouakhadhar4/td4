package td4;


public class libiraire {
	
	private livre Livre_liste[];
	private int capacite;
	private int nb;
	libiraire(int capacite)
	{
	  Livre_liste=new livre[capacite];
	   this.capacite=capacite;
	   this.nb=0;
	}
	public int getnb() {
		return nb;}
	public void inventaire()
	{
		for(int i=0;i<nb;i++)
		{
			System.out.println("la listes des livre"+ Livre_liste[i].titre+"son prix:"+ Livre_liste[i].calculePrix());
			}
	}
	void inventaire(String categ)
	{
		for(int i=0;i<nb;i++)
		{
			if(Livre_liste[i].getClass().getSimpleName().equals(categ))
			{
				System.out.println("la listes des livre"+ Livre_liste[i].titre+"son prix:"+ Livre_liste[i].calculePrix());
			}
				
			}
				
		
	}
	void ajoutLiv(livre liv)
	{
		if(this.nb<capacite)
		 {
			Livre_liste[nb]=liv;
			 nb++;
		 }
		 else
		 {
			 System.out.println("il n'ya pas de place pour un autre livre");
		 }
	
		
	}
	public void suppLiv(int num) {
	    for (int i = 0; i < nb; i++) {
	        if (Livre_liste[i].identifiant == num) {
	            for (int j = i; j < nb-1 ; j++) {
	            	Livre_liste[j] = Livre_liste[j + 1];
	            }
	            Livre_liste[nb - 1] = null;
	            nb--; 
	            break;
	        }
	    }
	}
     
     
}

	
	
	
		
	
		
		
	
	
	
	


