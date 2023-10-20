package tp;
import  java.util.ArrayList;
import java.util.Scanner;
public class parc {

	   private ArrayList<vehicule> tablevehicule; 

	   public parc(){
	        tablevehicule=new ArrayList<vehicule>();
	    }
	   public void afficher() {
	       for(int i=0;i<tablevehicule.size();i++) {
	            tablevehicule.get(i).affichervehicule();

	        }
		   }
	    
	 
	   public void ajouter() {
	        vehicule x=new vehicule();
	        x.vehiculecree();
	        tablevehicule.add(x);
	    }

	    public void suppr(int a)  {
	        int i=0 ;boolean test=false;
	        while( (i<tablevehicule.size())&&(test=false) ) {
	        if(    tablevehicule.get(i).getMatricule()== a) {
	            tablevehicule.remove(i);
	            test=true;

	        }
	        else i++;
	        }}

	    public int find(int a) {
	        int i=0,z=-1 ;boolean test=false;
	        while( (i<tablevehicule.size())&&(test=false) ) {
	        if(    tablevehicule.get(i).getMatricule()== a) {

	            test=true;
	        z=i;

	    }else {
	        i++;
	    }}
	        return z;
	}
	    
	    public void afficherdispo() {
	        if(tablevehicule.size()>0) {


	        for(int i=0;i<tablevehicule.size();i++) {
	            if(tablevehicule.get(i).getEtat().equals("dispo"))
	            (tablevehicule.get(i)).affichervehicule();
	        }}



	    }
	    public void afficherloue() {
	        if(tablevehicule.size()>0) {


	        for(int i=0;i<tablevehicule.size();i++) {
	            if(tablevehicule.get(i).getEtat().equals("loue"))
	            (tablevehicule.get(i)).affichervehicule();
	        }}



	    }
	    public void afficherencours() {
	        if(tablevehicule.size()>0) {


	        for(int i=0;i<tablevehicule.size();i++) {
	            if(tablevehicule.get(i).getEtat().equals("encours"))
	            (tablevehicule.get(i)).affichervehicule();
	        }}



	    }
	    public void supp(int x) {
	    	for(int i =0 ; i<tablevehicule.size();i++) {
	    		if(tablevehicule.get(i).getMatricule()==x)
	    	tablevehicule.remove(i);
	    }
	    	}
	    
	    
	    }
	    
	    
	


