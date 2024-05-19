public class CriteresRecherche {
    private String type;
    private float prixMax;
    private int nombrePiecesMin;
    private float surfaceMin;
    private String objectif;
    
    

    // Constructeur
    public CriteresRecherche(){}
    public CriteresRecherche(String type, float prixMax, int nombrePiecesMin,float surfaceMin,String objectif) {
        this.type = type;
        this.prixMax = prixMax;
        this.nombrePiecesMin = nombrePiecesMin;
        this.surfaceMin = surfaceMin;
        this.objectif = objectif;
        
    }

    // Getters et setters pour chaque attribut
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getobjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }


    public float getPrixMax() {
        return prixMax;
    }

    public void setPrixMax(float prixMax) {
        this.prixMax = prixMax;
    }

    public int getNombrePiecesMin() {
        return nombrePiecesMin;
    }

    public void setNombrePiecesMin(int nombrePiecesMin) {
        this.nombrePiecesMin = nombrePiecesMin;
    }


    // Méthode pour vérifier si un logement correspond aux critères de recherche
    public boolean correspond(Logement logement) {
        // Logique pour vérifier si le logement correspond aux critères de recherche
        if (type != null && !type.isEmpty() && !logement.getType().equals(type)) {
            return false;
        }
        if ( logement.getPrix() > prixMax) {
            return false;
        }
        if (objectif != null && !objectif.isEmpty() && !logement.getObjectif().equals(objectif)) {
            return false;
        }

        if (logement.getNbPieces() < nombrePiecesMin) {
            return false;
        }
        // Ajoutez d'autres conditions pour les critères supplémentaires
        return true;
    }
    public float getsurfaceMin() {
        return surfaceMin;
    }

    public void setsurfaceMin(float surfaceMin) {
        this.surfaceMin = surfaceMin;
    }
    
}
