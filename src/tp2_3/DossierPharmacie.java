package tp2_3;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DossierPharmacie {
	private String nom ;
	private HashMap <String , Patient > patients  ;
	
	
	public DossierPharmacie (String n){
			nom =n;
			patients = new HashMap <String , Patient >();
	}
	
	void nouveauPatient ( String nom , String [] ord ){
		  String nomLowerCase = nom.toLowerCase();
		  this.patients.put(nomLowerCase, new Patient(nom));
		  for (String medicament : ord) {
	            patients.get(nomLowerCase).ajoutMedicament(medicament);
	        }
	}
	public boolean ajoutMedicament (String nom, String m){
		String nomLowerCase = nom.toLowerCase();
        if (patients.containsKey(nomLowerCase)) {
	           patients.get(nomLowerCase).ajoutMedicament(m);
	           return true;
		}
		return false;
	}
	public void affichePatient (String nom){
		String nomLowerCase = nom.toLowerCase();
        if (patients.containsKey(nomLowerCase)) {
            patients.get(nomLowerCase).affiche();
        } else {
            System.out.println("patient"+nom+" non trouve.");
        }
	}
	
	public void affiche (){
		System.out.println("le nom est "+nom);
		for(Patient p:patients.values())
		{
			p.affiche();
		}
		}

	   public Collection<String> affichePatientAvecMedicament(String m) {
	        Set<String> p = new HashSet<>();
	        for (Patient patient : patients.values()) {
	            if (patient.contientMedicament(m)) {
	                p.add(patient.getNom());
	            }
	        }
	        return p;
	    }


}
