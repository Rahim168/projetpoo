import java.util.Date;

public class RendezVous {
    private int idRendezVous;
    private Date date;
    private int idClient;
    private int idLogement;
    private int id_agent;

    // Constructeur
    public RendezVous(){}
    public RendezVous(int idRendezVous, Date date,  int idClient, int idLogement, int id_agent) {
        this.idRendezVous = idRendezVous;
        this.date = date;
        this.idClient = idClient;
        this.idLogement = idLogement;
        this.id_agent = id_agent;
    }
    public void afficher(){
        System.out.println("La date:"+date+  "numero de client:"+idClient+" numero de logement:"+idLogement+"   acev l'agent : "+id_agent);


    }

    // Getters et Setters
    public int getIdRendezVous() {
        return idRendezVous;
    }

    public void setIdRendezVous(int idRendezVous) {
        this.idRendezVous = idRendezVous;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdLogement() {
        return idLogement;
    }

    public void setIdLogement(int idLogement) {
        this.idLogement = idLogement;
    }
}
