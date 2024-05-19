public class Adresse {
    private int Numero_de_rue;
    private String Ville ;

    public Adresse( int Numero_de_rue , String Ville ){

        this.Numero_de_rue=Numero_de_rue;
        this.Ville=Ville;
}

public int getNumero_de_rue() {
    return Numero_de_rue ; }

public void setNumero_de_rue(int Numero_de_rue) {
    this.Numero_de_rue = Numero_de_rue;
}

    public String getVille() {
        return Ville ; }
    
    public void setVille(String Ville) {
        this.Ville=Ville;
}
}