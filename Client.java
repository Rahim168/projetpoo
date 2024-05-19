public class Client {
    private String nom;
    private String prenom;
    private int id;
    private Adresse adresse;

    public Client(String nom, String prenom, int id,int rue, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.adresse = new Adresse(rue, adresse);
    }
    public void afficher() {
        
        String output = String.format("Nom : %-20s | Prenom : %-20s  |  %d ", nom, prenom , id);
        System.out.println(output);
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

    public int getId() {
        return id;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

   
}