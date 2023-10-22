package td4;



public class test {

	public static void main(String[] args) {
		libiraire lib  = new libiraire(4);
		livre l  = new livre("le petit prince",4,0.1,"histoire",30);
		Roman R=new Roman("L'Étranger",2,0.1,"philosophie",140,"Albert Camus","Gallimard");
		Magasine M=new Magasine("1984",3,0.1,"Dystopie",350,6);
		
		 lib.ajoutLiv(l);
		 lib.ajoutLiv(R);
         lib.ajoutLiv(M);
         lib.inventaire();
         Roman newRoman = new Roman("Romannouveau", 2, 0.1, "philosophie", 180, "Nouveau Auteur", "Nouveau Éditeur");
         lib.ajoutLiv(newRoman);
         lib.inventaire("Roman");
        System.out.println("le montant du  du roman = :"+ (R.calculePrix()+newRoman.calculePrix()));
        Magasine n = new Magasine("Nouveau Magasine", 3, 0.1, "Actualités", 250, 12);
        //lib.ajoutLiv(n);
        
        // il n'ya pas de place pour l'ajouter on  doit supprimer l'un des livres pour le remédier
        lib.suppLiv(2);
        lib.ajoutLiv(n);
        lib.inventaire();
        
        
        
        
        
        
        
        
        
		 
		 
			 
			 
	}

}
