package tp;

import java.util.Scanner;

public class client {
    private int cin;
    private String nom;
    private String prenom;
    private String adr;

    public client() {
        super();
    }
    
public void afficherclient() {

        System.out.println("Num cin:"+cin);
        System.out.println("Nom"+nom);
        System.out.println("Prenom"+prenom);
        System.out.println("Adresse"+adr);


    }
    public int getCin() {
        return cin;
    }
    public void setCin(int cin) {
        this.cin = cin;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getAdresse() {
        return adr;
    }
    public void setAdresse(String adr) {
        this.adr = adr;
    }
    public client(int cin, String nom, String prenom, String adr) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adr = adr;
	}

    public void creerclient() {
    Scanner s  = new Scanner(System.in);

    System.out.println("le numero de cin est ");
    cin=s.nextInt();
    System.out.println("votre nom est ");
    nom=s.next();
    System.out.println("votre prenom est :");
    prenom=s.next();
    System.out.println(" votre adresse est  :");
    adr=s.next();
    }
    
    /*public void copierclient(client x) {
	  	  cin=x.cin;
	  	  nom=x.nom;
	  	  prenom=x.prenom;
	  	  adr=x.adr;
	  	 	}*/
}
