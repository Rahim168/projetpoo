import java.util.Date;

public class ContratVente {
    private int codeContrat;
    private int idLogement;
    private int idachteur;
    private Date dateVente;
    private float montantVente;
    private float commission;
    private static int cpt =0;

    // Constructeur
    public ContratVente( int id, int idachteur, Date dateVente, float montantVente, float commission) {
        cpt++;
        this.codeContrat = cpt;
        this.idLogement = id;
        this.idachteur = idachteur;
        this.dateVente = dateVente;
        this.montantVente = montantVente;
        this.commission = commission;
    }

    public ContratVente(Transactions_Immobiliere transaction) {
        this.codeContrat = ++cpt;
        this.idLogement = transaction.getCodeLogement();
        this.idachteur = transaction.getidClient();
        this.dateVente = transaction.getDate();
        this.montantVente = transaction.getMontant();
        this.commission =transaction.getCommission();
        
    }

    public void afficher(){
        System.out.println("Code du contrat : "+this.codeContrat);
        System.out.println("Code du logement : "+this.idLogement);
        System.out.println("ID de l'achteur est :"+this.idachteur);
        System.out.println("Date de vente : "+this.dateVente);
        System.out.println("Montant de la vente : "+this.montantVente);
        System.out.println("Commission : "+this.commission);

    }

    // Getters et setters pour chaque attribut
    public int getCodeContrat() {
        return codeContrat;
    }

    public void setCodeContrat(int codeContrat) {
        this.codeContrat = codeContrat;
    }

    public int getidLogement() {
        return idLogement;
    }

    public void setLogement(int id) {
        this.idLogement = id;
    }

    public int getAcheteur() {
        return idachteur;
    }

    public void setAcheteur(int Idclient) {
        this.idachteur = Idclient;
    }

    public Date getDateVente() {
        return dateVente;
    }

    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }

    public float getMontantVente() {
        return montantVente;
    }

    public void setMontantVente(float montantVente) {
        this.montantVente = montantVente;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }
}
