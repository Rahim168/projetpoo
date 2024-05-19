import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize a Scanner object to read input from the console
        Scanner lire = new Scanner(System.in);

        // Create a Date object with user-provided values for day, month, and year
        Date date = new Date(2024, 07, 17,16,0);

        // Create an instance of the AgenceImmo class
        AgenceImmo agence = new AgenceImmo();

        Logement logement1 = new Logement(001, "Appartement", 7, 80, " neuf", "location", 100000, null,null, null, null, null,null);
        Logement logement2 = new Logement(002, "Maison", 5 ,100, "neuf", "vente", 200000, null, null, null, null, null, null);
        Logement logement3 = new Logement(003, "villa", 9 ,200, "neuf", "location", 300000, null, null, null, null, null, null);

        // Add the logement1 and logement2 objects to the agence instance
        agence.ajouterLogement(logement1);
        agence.ajouterLogement(logement2);
        // afficher logement
        agence.afficherLogements();
        agence.modifierLogement(002, logement3);
        agence.afficherLogements();
        agence.supprimerLogement(1);
        agence.afficherLogements();
        agence.ajouterLogement(logement1);
        agence.ajouterLogement(logement2);
        

       

        // Create 3 Client object with the following properties:
        AchteurLocataire client1 = new AchteurLocataire("benbelkacem","buchra",01,76,"alger");
        AchteurLocataire client2 = new AchteurLocataire("lokkal","sarah",02,16,"alger");
        AchteurLocataire client3 = new AchteurLocataire("mamado","dialo",3,89,"dakar");



        // Add the client1 object to the agence instance
        agence.ajouterClient(client1);
        agence.ajouterClient(client2);
        agence.afficherClients();
        agence.modifierClient("benbelkacem", client3);
        agence.afficherClients();
       



        
        // Create a CriteresRecherche object with the following property:
        // - Prix max: 150000
        CriteresRecherche criteres = new CriteresRecherche("Appartement",5000000,4,60,"location");

        // Search for logements that match the criteres object
        List<Logement> resultats = agence.rechercherLogements(criteres);

        // Print the logements that match the criteres object
        System.out.println("Logements correspondants aux critères de recherche : ");
        for (Logement logement : resultats) {
           logement.afficher();
           System.out.println("------------------------");
        }
        

        AgentImmobilier agent1 = new AgentImmobilier(1, "sellami", "rahim");
        AgentImmobilier agent2 = new AgentImmobilier(2, "sellami","cerine");

        agence.affecterAgentImmobilier(1, agent2);
        agence.affecterAgentImmobilier(2, agent1);
        agence.ajouteragent(agent1);
        agence.ajouteragent(agent2);
        agence.afficherAgents();
        agent1.afficherLogements();
        agent2.afficherLogements();





        // Manage the client1 object's demands using the criteresClient1 list
        List<CriteresRecherche> criteresClient1 = new ArrayList<>();
        criteresClient1.add(criteres);
        agence.gererDemandes(client1, criteresClient1);


        // Create a Transactions_Immobiliere object
        Transactions_Immobiliere transaction1 = new Transactions_Immobiliere(1,12,client1.getId(),date,100,5000,"location",date,2000);
        Transactions_Immobiliere transaction2 = new Transactions_Immobiliere(2,12,client1.getId(),date,100,5000,"vente");
        Transactions_Immobiliere transaction3 = new Transactions_Immobiliere(3,12,client2.getId(),date,100,5000,"location",date,1000);
        agence.ajoutertransaction(transaction1);
        agence.ajoutertransaction(transaction2);
        agence.ajoutertransaction(transaction3);
        agence.affichagetransaction();

        List<Transactions_Immobiliere> a = agence.historoqueclient(client1.getId());
        System.out.println("------------------------");
        System.out.println("------------------------");

        for (Transactions_Immobiliere t : a) {
            t.afficher();
            System.out.println("------------------------");
        }





        // Generate a ContratVente object using the transaction1 object
        ContratVente contratVente = agence.genererContratVente(transaction2);

        // afficher contrat de vente 
        contratVente.afficher();

        ContratLocation contratLocation = agence.genererContratLocation(transaction1);

        contratLocation.afficher();
        

        // Create a RendezVous object with the following properties:
        RendezVous rendezVous1 = new RendezVous(001,date,001,001,agent1.getId());

        // afficher le rendezvous
        rendezVous1.afficher();
        
        

        // Plan a visit using the rendezVous1 object
        agence.planifierVisite(rendezVous1);

        // Close the Scanner object
        lire.close();
    }
}