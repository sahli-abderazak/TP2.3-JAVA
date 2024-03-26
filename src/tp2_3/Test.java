package tp2_3;

public class Test {
    public static void main(String[] args) {
        
        DossierPharmacie pharmacie = new DossierPharmacie("Pharmacie");

        
        pharmacie.nouveauPatient("rzouga", new String[]{"x", "y"});
        pharmacie.nouveauPatient("ali", new String[]{"x", "z", "i"});
        pharmacie.nouveauPatient("salah", new String[]{"x", "h", "j"});

        
//        pharmacie.affiche();

       
        pharmacie.ajoutMedicament("rzouga", "Vitamine C");
        pharmacie.ajoutMedicament("ali", "Vitamine D");
        pharmacie.ajoutMedicament("salah", "Vitamine B");

        
        pharmacie.affiche();

    
        pharmacie.affichePatient("salah");

        System.out.println("Patients prenant du Paracetamol : " + pharmacie.affichePatientAvecMedicament("x"));
    }
}
