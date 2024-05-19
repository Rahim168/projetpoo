import java.util.Date;

public class Logement {
    private int code;
    private String type;
    private int nbPieces;
    private float surface;
    private String etat;
    private String objectif;
    private float prix;
    private String disponibilite;
    private Date dateDispo;
    private Adresse adresse;
    private proprietaire proprietaire;
    private String description;
    private AgentImmobilier agent;

    // Constructeur
    public Logement(){}
    public Logement(int code, String type, int nbPieces, float surface, String etat, String objectif, float prix, String disponibilite, Date dateDispo, Adresse adresse, proprietaire proprietaire, String description, AgentImmobilier agent) {
        this.code = code;
        this.type = type;
        this.nbPieces = nbPieces;
        this.surface = surface;
        this.etat = etat;
        this.objectif = objectif;
        this.prix = prix;
        this.disponibilite = disponibilite;
        this.dateDispo = dateDispo;
        this.adresse = adresse;
        this.proprietaire = proprietaire;
        this.description = description;
        this.agent = agent;
    }

    public void afficher (){
        System.out.println("Code : " + code);
        System.out.println("Type : " + type);
        System.out.println("Nb de pièces : " + this.nbPieces);
        System.out.println("surface: "+surface);
        System.out.println("etat:" +etat );
        System.out.println("objectif:" + objectif);
        System.out.println("prix:" + prix);
        System.out.println("disponibilite:" + disponibilite);
        System.out.println("dateDispo:" + dateDispo);
        System.out.println("adresse:" + adresse);
        System.out.println("description:"+description);
    }

    // Getters et Setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(String disponibilite) {
        this.disponibilite = disponibilite;
    }

    public Date getDateDispo() {
        return dateDispo;
    }

    public void setDateDispo(Date dateDispo) {
        this.dateDispo = dateDispo;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public AgentImmobilier getAgent() {
        return agent;
    }

    public void setAgent(AgentImmobilier agent) {
        this.agent = agent;
    }


}
