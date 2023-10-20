package tp;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Date;
	public class location {
		private vehicule vl;
		private client clt;
		private LocalDate debut;
		private LocalDate fin;
		private int prix;private int avance;
		//private int retard;
	
	   public location() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    

	    public vehicule getVl() {
	        return vl;
	    }
	    public void setV(vehicule vl) {
	        this.vl = vl;
	    }
	    public client getClt() {
	        return clt;
	    }
	    public void setClt(client clt) {
	        this.clt = clt;
	    }
	    public int getPrix() {
	        return prix;
	    }
	    public void setPrix(int prix) {
	        this.prix = prix;
	    }
	    public int getAvance() {
	        return avance;
	    }
	    public void setAvance(int avance) {
	        this.avance = avance;
	    }
	    public  void afficherloc() {
	    	vl.affichervehicule();
			clt.afficherclient();
			System.out.println("Date de debut de location:"+debut);
			System.out.println("Date de fin de location:"+fin);
			System.out.println("Prix de location:"+prix);
			System.out.println("Le montant d'avance:"+avance);
	        
	    }   
	    public void cree(vehicule vl, client clt) {;
			
			this.vl=vl;
			this.clt=clt;
			Scanner s  = new Scanner(System.in);
			 System.out.println("date de debut de location");
		   	 int year;
		   	System.out.println("year:");
		   	year=s.nextInt();
		   	int month ;
		   		System.out.println("month:");
		   		month=s.nextInt();
		   		int day;
		   		System.out.println("day");
		   	    day=s.nextInt();
		  	 this.debut= LocalDate.of(year,month,day);  
		    
		   	 System.out.println(" date de fin de location:");
		  	System.out.println("year:");
		   	year=s.nextInt();
		   	
		   		System.out.println("month:");
		   		month=s.nextInt();
		   System.out.println("day");
		   	  day=s.nextInt();
		   	  this.fin= LocalDate.of(year, month, day); 
		   
		   	 System.out.println("entrer le prix:");
		   	 prix=s.nextInt();
		   	 System.out.println("entrer l'avance:) :");
		   	 avance=s.nextInt();
		    
			
		}
/*
		public void copierloc(location l , vehicule v ) {
			v.copiervehicule(l.getV());
			this.c.copierclient(l.getC());
			this.debut=l.debut;
			this.fin=l.fin;
			this.prix=l.prix;
			this.avance=l.avance;
			
			
		}*/
	 	
	}
