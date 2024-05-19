import java.util.ArrayList;
import java.util.List;


public class AgenceImmo {
    private List<Logement> listeLogements;
    private List<Client> listeClients;
    private List<Transactions_Immobiliere> listeTransactions;
    private List<RendezVous> listeRendezVous;
    private List<AgentImmobilier> listeAgentImmobiliers;

    public AgenceImmo() {
        listeLogements = new ArrayList<>();
        listeClients = new ArrayList<>();
        listeTransactions = new ArrayList<>();
        listeRendezVous = new ArrayList<>();
        listeAgentImmobiliers = new ArrayList<>();
    }

    public void ajoutertransaction(Transactions_Immobiliere transaction){
        listeTransactions.add(transaction);
    }



    public void ajouteragent(AgentImmobilier agent){
        listeAgentImmobiliers.add(agent);
    }



    
    public void supprimeragent(String nomagent){
        for (int i = 0; i < listeAgentImmobiliers.size(); i++) {
            if (listeAgentImmobiliers.get(i).getNom().equals(nomagent)) {
                listeAgentImmobiliers.remove(i);
            }
        }
    }
    
    public void afficherAgents(){
        System.out.println("la liste d'agent immobiler : ");
        for (AgentImmobilier agent : listeAgentImmobiliers) {
            agent.afficher();
            System.out.println("---------------------------------------------------------------------------");
        }
    }



    // Méthodes pour la gestion des biens immobiliers
    public void ajouterLogement(Logement logement) {
        listeLogements.add(logement);
    }
    public void afficherLogements() {
        System.out.println("la liste des logement :");
        for (Logement logement : listeLogements) {
            logement.afficher();
            System.out.println("----------------------------------------");
        }
    }

    public void modifierLogement(int codeLogement, Logement nouveauLogement) {
        for (int i = 0; i < listeLogements.size(); i++) {
            Logement logement = listeLogements.get(i);
            if (logement.getCode()==(codeLogement)) {
                listeLogements.set(i, nouveauLogement);
                break;
            }
        }
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

    public void ajouterDescription(int codeLogement, String description) {
        for (Logement logement : listeLogements) {
            if (logement.getCode()==(codeLogement)) {
                logement.setDescription(description);
                break;
            }
        }
    }

    public List<Logement> rechercherLogements(CriteresRecherche criteres) {
        List<Logement> resultats = new ArrayList<>();
        for (Logement logement : listeLogements) {
            if (criteres.correspond(logement)) {
                resultats.add(logement);
            }
        }
        return resultats;
    }

    public void affecterAgentImmobilier(int codeLogement, AgentImmobilier agent) {
        for (Logement logement : listeLogements) {
            if (logement.getCode()==(codeLogement)) {
                logement.setAgent(agent);
                agent.ajouterLogement(logement);
                break;
            }
        }
    }

    // Méthodes pour la gestion des clients
    public void ajouterClient(AchteurLocataire client) {
        listeClients.add(client);
    }
    public void afficherClients() {
        System.out.println("la liste des Client :");
        for (Client client : listeClients) {
            client.afficher();
            System.out.println("-----------------------------------------------------------------");
        }
    }

    public void modifierClient(String nomClient, AchteurLocataire nouveauClient) {
        for (int i = 0; i < listeClients.size(); i++) {
            Client client = listeClients.get(i);
            if (client.getNom().equals(nomClient)) {
                listeClients.set(i, nouveauClient);
                break;
            }
        }
    }

    public void supprimerClient(String nomClient) {
        for (int i = 0; i < listeClients.size(); i++) {
            Client client = listeClients.get(i);
            if (client.getNom().equals(nomClient)) {
                listeClients.remove(i);
                break;
            }
        }
    }

    public void gererDemandes(AchteurLocataire client, List<CriteresRecherche> criteres) {
        client.setCriteresRecherche(criteres);
    }

    // Méthodes pour la gestion des transactions
    public void creerTransaction(Transactions_Immobiliere transaction) {
        listeTransactions.add(transaction);
    }

    public ContratLocation genererContratLocation(Transactions_Immobiliere transaction) {
        ContratLocation contratLocation = new ContratLocation(transaction);
        System.out.println("Contrat de location généré pour la transaction : " + transaction.getCodeLogement());
        return contratLocation;
    }
    

    public ContratVente genererContratVente(Transactions_Immobiliere transaction) {
        ContratVente contratVente = new ContratVente(transaction);
        System.out.println("Contrat de vente généré pour la transaction : " + transaction.getCodeLogement());
        return contratVente;
    }
    

    public void enregistrerPaiement(Transactions_Immobiliere transaction, float montant) {
        transaction.enregistrerPaiement(montant);
       
    }

    // Méthodes pour les rendez-vous de visite
    public void planifierVisite(RendezVous rendezVous) {
        listeRendezVous.add(rendezVous);
        System.out.println("Rendez-vous de visite planifié pour le logement : " + rendezVous.getIdLogement() + " à la date : " + rendezVous.getDate());
    }


    public List<Transactions_Immobiliere> historoqueclient(int idClient){


        List<Transactions_Immobiliere> historique = new ArrayList<>();
        for (int i = 0; i < listeTransactions.size(); i++) {
            Transactions_Immobiliere transaction = listeTransactions.get(i);
            if (transaction.getidClient()==idClient) {
                historique.add(transaction);
            }
        }
        return historique;
    }
    public void affichagetransaction(){
        System.out.println("les trasaction sont : ");
        for (int i = 0; i < listeTransactions.size(); i++) {
            Transactions_Immobiliere transaction = listeTransactions.get(i);
            transaction.afficher();
            System.out.println("------------------------");
        }
    }


    

}




