import java.util.List;

public class AchteurLocataire extends Client {

    private List<CriteresRecherche> criteresRecherche;

    // Constructeur
    public AchteurLocataire(String nom, String prenom,int id ,int rue ,String ville ) {
        super(nom, prenom,id,rue,ville);
    }
    
    public List<CriteresRecherche> getCriteresRecherche() {
        return criteresRecherche;
    }

    public void setCriteresRecherche(List<CriteresRecherche> criteresRecherche) {
        this.criteresRecherche = criteresRecherche;
    }
}