import java.util.ArrayList;
import java.util.List;
public class proprietaire extends Client{

    private List<Logement> listeLogements = new ArrayList<>();
    
    public proprietaire(String nom, String prenom,int id ,int rue ,String ville ) {
        super(nom, prenom,id,rue,ville);
    }
    public void ajouterLogement(Logement logement) {

        listeLogements.add(logement);
    }

    public void supprimerLogement(int codeLogement) {
        for (int i = 0; i < listeLogements.size(); i++) {
            Logement logement = listeLogements.get(i);
            if (logement.getCode()==(codeLogement)) {
                listeLogements.remove(i);
                break;
            }
        }
    }



}