import java.util.Date;

public class Transactions_Immobiliere {
    private int id_transaction;
    private int codeLogement;
    private int idproprietaire;
    private int Idclient;
    private Date date;
    private float commission;
    private float montant;
    private String type;
    private Date findelocation;
    private float caution;
    private static int cpt = 0 ;
   


    // Constructeur
    public Transactions_Immobiliere(){}

    public Transactions_Immobiliere(int codeLogement, int idpoprio, int idClient, Date date, float commission, float montant, String type) {
        cpt++;
        this.id_transaction = cpt;
        this.codeLogement = codeLogement;
        this.idproprietaire = idpoprio;
        this.Idclient =idClient;
        this.date = date;
        this.commission = commission;
        this.montant = montant;
        this.type = type;
    
    }
    public Transactions_Immobiliere(int codeLogement,  int idproprietaire,int idClient, Date date, float commission, float montant, String type,Date datefinlocation,float caution) {
        cpt++;
        this.id_transaction = cpt;
        this.codeLogement = codeLogement;
        this.idproprietaire = idproprietaire;
        this.Idclient = idClient;
        this.date = date;
        this.commission = commission;
        this.montant = montant;
        this.type = type;
        this.findelocation = datefinlocation;
        this.caution = caution;
    
    }

    public void afficher(){
        if (type == "location") {
        
        System.out.println("Code Logement : "+codeLogement);
        System.out.println("Id proprietaire : "+idproprietaire);
        System.out.println("Id Client : "+Idclient);
        System.out.println("Date debut de location : "+date);
        System.out.println("Commission : "+commission+"%");
        System.out.println("Montant : "+montant);
        System.out.println("Type : "+type);
        System.out.println("Date de fin de location : "+findelocation);
        System.out.println("Caution : "+caution);

        }else{
        System.out.println("Code Logement : "+codeLogement);
        System.out.println("Id proprietaire : "+idproprietaire);
        System.out.println("Id Client : "+Idclient);
        System.out.println("Date : "+date);
        System.out.println("Commission : "+commission+"%");
        System.out.println("Montant : "+montant);
        System.out.println("Type : "+type);
        

        }
    }




    // Getters et Setters
    public int getid() {
        return id_transaction;
    }

    public int getCodeLogement() {
        return codeLogement;
    }

    public void setCodeLogement(int codeLogement) {
        this.codeLogement = codeLogement;
    }

    public int getIdproprietaire() {
        return idproprietaire;
        
    }


    public void setidproprietaire(int idproprietaire){
        this.idproprietaire = idproprietaire;
    }


    public int getidClient() {
        return Idclient;
    }

    public void setidClient(int idClient) {
        this.Idclient = idClient;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDatefin() {
        return findelocation;
    }

    public void setDateFin(Date date) {
        this.findelocation = date;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void enregistrerPaiement(float montant) {
        // Ajouter le montant au montant total de la transaction
        this.montant += montant;
        
        
        
        System.out.println("Paiement de " + montant + " enregistré pour la transaction : " + this.codeLogement);
    }
    
} 