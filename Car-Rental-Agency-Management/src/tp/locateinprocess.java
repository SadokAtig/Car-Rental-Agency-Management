package tp;
import java.util.ArrayList;
public class locateinprocess {

	   private ArrayList<location> tablelocation;
	    public locateinprocess() {
	    	tablelocation =new  ArrayList<location>();
        
	    }
	    public void ajoutloc(vehicule v,client c) {

	        location la=new location();
	        la.cree(v, c);

	        if((v.getEtat().equals("disponible"))&&(la.getAvance()>0)){
	            v.setEtat("loue");

	            tablelocation.add(la);}
	        else 
	            System.out.println("location n'est pas effectuee.");
	        }
	    public void afficher() {
	    	int i=0;
	    	
	    	if(tablelocation.isEmpty()) {
	    		System.out.println("il n'existe pas un location en cours");
	    	}else {
	    	for(i=0;i<tablelocation.size();i++) {
	    		System.out.println("la location numero :"+i);
	    		tablelocation.get(i).afficherloc();
	    	}
	    }
	    	}
	    public void afficherparclient(int cin) {
	    	boolean trouve=false;
	              if(tablelocation.size()>0) {
	            	  
	            	  for(int i=0;i<tablelocation.size();i++) {
	          			if(tablelocation.get(i).getClt().getCin()==cin) {
	          				tablelocation.get(i).afficherloc();
	          				trouve=true;
	          			}
	          			       
	          			}
	            	  
	            	if(trouve==false)  
	            		System.out.println("ce client c'a pas de location .");
	            		
	            	  
	              }
	              else  System.out.println("table de location est vide.");
	    }
	    
	    public void supp(int o) {
	    	for(int i =0 ; i<tablelocation.size();i++) {
	    		if(tablelocation.get(i).getClt().getCin()==o)
	    			tablelocation.remove(i);
	    }
	    	}
	    
}
