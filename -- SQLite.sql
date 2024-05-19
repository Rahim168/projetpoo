-- SQLite
CREATE TABLE IF NOT EXISTS Adresse (
    Id_Adresse INT PRIMARY KEY,
    Numero_de_rue INT,
    Rue VARCHAR(255),
    Ville VARCHAR(255)
);

INSERT INTO Adresse ( Numero_de_rue, Rue, Ville) VALUES ( 123, 'Rue de la Liberté', 'Paris');

CREATE TABLE IF NOT EXISTS Proprietaire(
    ID_Proprietaire INTEGER PRIMARY KEY,
    Nom TEXT,
    Prenom TEXT
);

INSERT INTO Proprietaire ( Nom, Prenom) VALUES ( 'Dupont', 'Jean');
CREATE TABLE IF NOT EXISTS Client (
    ID_Client INTEGER PRIMARY KEY,
     Nom TEXT,
    Prenom TEXT,
    NoRue INTEGER ,
    Rue TEXT,
    Ville TEXT
);

INSERT INTO Client ( Nom, Prenom, NoRue, Rue, Ville) VALUES ( 'Smith', 'Alice', '456', 'Avenue des Roses', 'New York');

CREATE TABLE IF NOT EXISTS CriteresRecherche (
    ID_Criteres INTEGER PRIMARY KEY AUTOINCREMENT,
    Critere TEXT,
    ID_Client INTEGER,
    FOREIGN KEY (ID_Client) REFERENCES Client(ID_Client)
);
INSERT INTO CriteresRecherche (Critere, ID_Client) VALUES ('Appartement', 1);


CREATE TABLE IF NOT EXISTS Logement (
    ID_Logement INTEGER PRIMARY KEY,
    Code TEXT,
    Type TEXT,
    NbPieces INTEGER,
    Surface REAL,
    Etat TEXT,
    Objectif TEXT,
    Prix REAL,
    Disponibilite TEXT,
    DateDispo DATE,
    ID_Adresse INTEGER,
    ID_Proprietaire INTEGER,
    Description TEXT,
    ID_Agent INTEGER,
    FOREIGN KEY (ID_Adresse) REFERENCES Adresse(ID_Adresse),
    FOREIGN KEY (ID_Proprietaire) REFERENCES Proprietaire(ID_Proprietaire),
    FOREIGN KEY (ID_Agent) REFERENCES AgentImmobilier(ID_Agent)
);
INSERT INTO Logement ( Code, Type, NbPieces, Surface, Etat, Objectif, Prix, Disponibilite, DateDispo, ID_Adresse, ID_Proprietaire, Description, ID_Agent)
VALUES ( 'AP001', 'Appartement', 3, 80.5, 'Neuf', 'Vente', 150000, 'Disponible', '2024-05-09', 1, 1, 'Bel appartement avec vue sur la rivière', 1);


CREATE TABLE IF NOT EXISTS Visite (
    ID_Visite INTEGER PRIMARY KEY AUTOINCREMENT,
    Code TEXT,
    NomClient TEXT,
    PrenomClient TEXT,
    NoRueClient TEXT,
    RueClient TEXT,
    VilleClient TEXT,
    DateVisite DATE
);
INSERT INTO Visite (Code, NomClient, PrenomClient, NoRueClient, RueClient, VilleClient, DateVisite)
VALUES ('V001', 'Smith', 'Alice', '456', 'Avenue des Roses', 'New York', '2024-05-10');


CREATE TABLE IF NOT EXISTS Transaction_Immobiliere (
    ID_Transaction INTEGER PRIMARY KEY AUTOINCREMENT,
    CodeLogement TEXT,
    NomProprietaire TEXT,
    PrenomProprietaire TEXT,
    NoRueProprietaire TEXT,
    RueProprietaire TEXT,
    VilleProprietaire TEXT,
    NomClient TEXT,
    PrenomClient TEXT,
    NoRueClient TEXT,
    RueClient TEXT,
    VilleClient TEXT,
    DateTransaction DATE,
    Commission REAL,
    Montant REAL,
    Type TEXT
);
INSERT INTO Transaction_Immobiliere (CodeLogement, NomProprietaire, PrenomProprietaire, NoRueProprietaire, RueProprietaire, VilleProprietaire, NomClient, PrenomClient, NoRueClient, RueClient, VilleClient, DateTransaction, Commission, Montant, Type)
VALUES ('AP001', 'Dupont', 'Jean', NULL, NULL, NULL, 'Smith', 'Alice', '456', 'Avenue des Roses', 'New York', '2024-05-10', 1000, 160000, 'Vente');


CREATE TABLE IF NOT EXISTS RendezVous (
     ID_RendezVous INTEGER PRIMARY KEY AUTOINCREMENT,
    Date DATE,
    Heure TEXT,
    ID_Client INTEGER,
    ID_Logement INTEGER,
    FOREIGN KEY (ID_Client) REFERENCES Client(ID_Client),
    FOREIGN KEY (ID_Logement) REFERENCES Logement(ID_Logement)
);
INSERT INTO RendezVous (Date, Heure, ID_Client, ID_Logement)
VALUES ('2024-05-10', '10:00', 1, 1);


CREATE TABLE IF NOT EXISTS ContratVente (
    CodeContrat TEXT PRIMARY KEY,
    ID_Logement INTEGER,
    ID_Acheteur INTEGER,
    DateVente DATE,
    MontantVente REAL,
    Commission REAL,
    FOREIGN KEY (ID_Logement) REFERENCES Logement(ID_Logement),
    FOREIGN KEY (ID_Acheteur) REFERENCES Client(ID_Client)
);
INSERT INTO ContratVente ( ID_Logement, ID_Acheteur, DateVente, MontantVente, Commission)
VALUES ( 1, 1, '2024-05-10', 160000, 1000);


CREATE TABLE IF NOT EXISTS AgentImmobilier (
    ID_Agent INTEGER PRIMARY KEY AUTOINCREMENT,
    Nom TEXT,
    Prenom TEXT
);
INSERT INTO AgentImmobilier (Nom, Prenom)
VALUES ('Doe', 'John');

CREATE TABLE IF NOT EXISTS ContratLocation (
    CodeContrat TEXT PRIMARY KEY,
    ID_Logement INTEGER,
    ID_Locataire INTEGER,
    DateDebut DATE,
    DateFin DATE,
    Montant REAL,
    Caution REAL,
    FOREIGN KEY (ID_Logement) REFERENCES Logement(ID_Logement),
    FOREIGN KEY (ID_Locataire) REFERENCES Client(ID_Client)
);
INSERT INTO ContratLocation (CodeContrat, ID_Logement, ID_Locataire, DateDebut, DateFin, Montant, Caution)
VALUES ('CL001', 1, 2, '2024-05-10', '2024-07-10', 1200, 1000);