package tp;

import java.util.Scanner;

public class vehicule {

	private int matricule;
    private String constructeur;
    private String marqueCommerciale;
    private String etat;
    private int bn;


    public vehicule() {
        matricule=0;
        constructeur="";
        marqueCommerciale="";
        etat="";
    }
    public void vehiculecree() {
    	
        Scanner s = new Scanner(System.in);
        System.out.println("combien de vehicule ajouter vous ! ");
        bn = s.nextInt();
        for(int i =0 ; i<bn; i++) {
        System.out.println("donner matricule");
        matricule=s.nextInt();
        System.out.println("donner constructeur");
        constructeur =s.next();
        System.out.println("donner marque commerciale");
        marqueCommerciale =s.next();
        SetEtat();
        }
    }
    public int getMatricule() {
       return matricule;
   }
   public void setMatricule(int matricule) {
       this.matricule = matricule;
   }
   public String getConstructeur() {
       return constructeur;
   }
   public void setConstructeur(String constructeur) {
       this.constructeur = constructeur;
   }
   public String getMarqueCommerciale() {
       return marqueCommerciale;
   }
   public void setMarqueCommerciale(String marqueCommerciale) {
       this.marqueCommerciale = marqueCommerciale;
   }
   public String getEtat() {
       return etat;
   }
   public void SetEtat() {
       String x;
       Scanner s=  new Scanner(System.in);
       do {
       System.out.println("donner eTAT");
       x=s.next();
       }while((!(x.equals("disponible")) && !(x.equals("loue")) && !(x.equals("encours"))));
       this.etat = x;
   }
   public void setEtat(String  s) {

       this.etat = s;
   }
   public  void affichervehicule() {
	   for(int i = 0 ;i<bn ;i++) {
        System.out.println("le Matricule est:"+matricule);
        System.out.println("le Constructeur :"+constructeur);
        System.out.println("Marque commerciale :"+marqueCommerciale);
        System.out.println("l'Etat du vehicule:"+etat);
        }
       
        
        
    }
     public void copiervehicule(vehicule v) {
         matricule=v.matricule;
         constructeur=v.constructeur;
         marqueCommerciale=v.marqueCommerciale;
         etat=v.etat;
           }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
