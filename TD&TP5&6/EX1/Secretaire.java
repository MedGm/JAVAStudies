package EX1;

public class Secretaire extends Personne {
    private String numeroBureau;
    static int nbSecretaires;

    Secretaire(String nom, String prenom, String rue, String ville, String numeroBureau) {
        super(nom, prenom, rue, ville);
        this.numeroBureau = numeroBureau;
        nbSecretaires ++;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.numeroBureau;
    }

    @Override
    void ecrirePersonne() {
        System.out.println("Secrétaire : " + this.toString());
    }

    static int nbSecretaires() {
        return nbSecretaires;
    }
}
