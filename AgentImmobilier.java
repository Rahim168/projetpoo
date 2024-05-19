import java.util.List;
import java.util.ArrayList;
public class AgentImmobilier {
    private int id;
    private String nom;
    private String prenom;
    private List<Logement> logementagt = new ArrayList<>() ;

    // Constructeur
    public AgentImmobilier(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    // affichage 
    public void afficher() {
        
        String output = String.format("Nom : %-20s | Prenom : %s", nom, prenom);
        System.out.println(output);
    }


    public void ajouterLogement(Logement logement) {

        logementagt.add(logement);
    }


    public void supprimerLogement(int idLogement){
        for (int i = 0; i < logementagt.size(); i++){
            if (logementagt.get(i).getCode() == idLogement){
                logementagt.remove(i);
            }
        }

    }

    public void afficherLogements(){
        System.out.println("les logement de l'agent   " +nom +"  "+prenom+"     sont :");
        for (Logement logement : logementagt) {
            logement.afficher();
            System.out.println("---------------------------------------------------");
        }
        }

    // Getters et setters pour chaque attribut
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
