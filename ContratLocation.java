import java.util.Date;

public class ContratLocation {
    private int codeContrat;
    private int idpropietaire;
    private int idlogement;
    private int idlocataire;
    private Date dateDebut;
    private Date dateFin;
    private float montant;
    private float caution;
    private static int cpt = 0;

    // Constructeur
    public ContratLocation( int idlogement, int idlocataire,int idpropietaire, Date dateDebut, Date dateFin, float montant, float caution) {
        this.codeContrat = ++cpt;
        this.idlogement = idlogement;
        this.idlocataire = idlocataire;
        this.idpropietaire = idlocataire;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.montant = montant;
        this.caution = caution;

    }

    public ContratLocation(Transactions_Immobiliere transaction) {
        this.codeContrat = ++cpt;
        this.idlogement = transaction.getCodeLogement();
        this.idlocataire = transaction.getidClient();
        this.idpropietaire = transaction.getIdproprietaire();
        this.dateDebut = transaction.getDate();
        this.dateFin = transaction.getDatefin();
        this.montant = transaction.getMontant();
        this.caution = transaction.getCaution();

       
    }
    public void afficher(){
        
        System.out.println("codeContrat : "+this.codeContrat);
        System.out.println("idlogement : "+this.idlogement);
        System.out.println("idlocataire : "+this.idlocataire);
        System.out.println("idpropietaire : "+this.idpropietaire);
        System.out.println("dateDebut : "+this.dateDebut);
        System.out.println("dateFin : "+this.dateFin);
        System.out.println("montant : "+this.montant);
        System.out.println("caution : "+this.caution);

    }
    

    // Getters et setters pour chaque attribut
    public int getCodeContrat() {
        return codeContrat;
    }

    public void setCodeContrat(int codeContrat) {
        this.codeContrat = codeContrat;
    }

    public int getidLogement() {
        return idlogement;
    }

    public void setidLogement(int idlogement) {
        this.idlogement = idlogement;
    }

    public int getLocataire() {
        return idlocataire;
    }

    public void setLocataire(int idlocataire) {
        this.idlocataire = idlocataire;
    }

    public int getProprietaire() {
        return idpropietaire;
    }

    public void setProprietaire(int idpropietaire) {
        this.idpropietaire = idpropietaire;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public float getCaution() {
        return caution;
    }

    public void setCaution(float caution) {
        this.caution = caution;
    }
}
