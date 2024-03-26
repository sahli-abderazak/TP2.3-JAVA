package tp2_3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Patient {
	private String nom ;
	private Set <String > ordonnance;
	
	public Patient (String n){
		nom = n ;
		ordonnance = new HashSet <String>();
	}
	public String getNom () { return nom ;}
	
	public boolean ordonnanceVide(){
		return this.ordonnance.isEmpty();
			
	}
	
	public void ajoutMedicament (String m) {
		this.ordonnance.add(m);
	}
	
	public void affiche(){
		System.out.println("le nom est "+nom);
		for(String o:ordonnance)
		{
			System.out.println(o);
		}
	}
	public boolean contientMedicament (String m) {
		return this.ordonnance.contains(m);
	}
	
	public void trieOrdonnace() {
		Set<String> s=new TreeSet<>(ordonnance);
		ordonnance.clear();
		ordonnance.addAll(s);
	}
}
