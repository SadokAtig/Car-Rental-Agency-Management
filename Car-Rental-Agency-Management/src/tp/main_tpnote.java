package tp;
import java.util.Scanner;
import tp.vehicule;
import tp.client;
import tp.location;
import tp.parc;
import tp.locateinprocess;
public class main_tpnote {
	

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int userselection;
			vehicule b;
			b = new vehicule();
			parc p;
			p = new parc();
			client g;
			g= new client();
		    location  m ;
			 m = new location();
			 locateinprocess bu = new  locateinprocess() ;
	         	do {
	         		userselection=menudata();
	         		switch(userselection) {
	         		case 1 : 
	         			     b.vehiculecree();
	         		break;
	         		       
	         		case 2 :   b.SetEtat();	
	         		break;
	         		case 3 : int w;
	         		         System.out.println("donner la matricule du vehicule a supprimer dans le park ");
	         		         w = s.nextInt();
	         			     p.supp(w);
	         			
	         		break;
	         		case 4 : p.afficher();//p.ajouter();
	         		         
	         		break;
	         		case 5 : p.afficherencours();
	         		break;
	         		case 6 : p.afficherencours();
	         		break;
	         		case 7 : p.afficherencours();
	                
	         		break;
	         		case 8 : g.creerclient();
    			             bu.ajoutloc(b,g);
	         	    break;
	         		case 9 : int clt ;
	         			     System.out.println("donner la CIN du client qui vous voudrez supprimé son location ");
    		                 clt = s.nextInt();
	         			     bu.supp(clt);
	         		break;
	         		case 10 : bu.afficher();
	         		break;
	         		case 11 : int k  ;
	         		          System.out.println("donner la CIN du client qui vous voudrez affihcer son location ");
	         		          k = s.nextInt();
	         			      bu.afficherparclient(k);
	         		break;
	         		case 12 : System.out.println("NOT FOUND ");
	         		break;
	         		case 13 : System.out.println("NOT FOUND");
	         		break;
	         		case 14 : System.out.println("NOT FOUND");
	         		break;
	         		default : System.out.println("NOT FOUND ");
	         		break;
	         		}
	         		
	         	}while (userselection<14) ;
		}
		public static int menudata() {
			Scanner s = new Scanner(System.in);
	         int  h;
	         
	        System.out.println("welcome to our project ENJOYYYYYYYYYYYY !!!!!!");
	        System.out.println("  **     **  **   **   **    ** Gestion du Parc de l’Agence : **     **  **   **   **    **");
	        System.out.println("/----------------*******-----------********-----*******-------------***---***-**");
	        System.out.println("1. Nouvelle acquisition (Ajout d’un vehicule)");
	        System.out.println("2. Modification de l’Etat d’un Vehicule ");
	        System.out.println("3. Suppression d’un Vehicule");
	        System.out.println("4. Consultation Parc (tous les vehicules)");
	        System.out.println("5. Liste des véhicules loues ");
	        System.out.println("6. Liste des véhicules en cours de reparation");
	        System.out.println("7. Liste des véhicules disponibles");
	        System.out.println("/-//-/-/-/--/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
	        System.out.println("/-//-/-/-/--/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
	        System.out.println("  **     **  **   **   **    **  Gestion Locations : **     **  **   **   **    **");
	        System.out.println("/----------------*******-----------********-----*******-------------***---***-**");
	        System.out.println("8. Nouvelle Location (Ajout d’une location) ");
	        System.out.println("9. Fin de Location (Suppression)");
	        System.out.println("10. Consultation des locations en cours ");
	        System.out.println("11. Consultation des Vehicules Loues par un client");
	        System.out.println("  **     **  **   **   **    ** Statistiques :  : **     **  **   **   **    **");
	        System.out.println("/----------------*******-----------********-----*******-------------***---***-**");
	        System.out.println("12. Nombre de locations pour une periode déterminee");
	        System.out.println("13. Total des revenus pour une période déterminee");
	        System.out.println("14. Liste des clients a risque (Retard / mauvais etat de vehicules rendus)");
	         System.out.println("your choice est : ");
	        h=s.nextInt();
	        return h;
	        
		}

}


