package EX1;

public class Etudiant extends Personne {
    private String diplomeEnCours;
    static int nbEtudiants;

    Etudiant(String nom, String prenom, String rue,String ville, String diplomeEnCours) {
        super(nom, prenom, rue, ville);
        this.diplomeEnCours = diplomeEnCours;
        nbEtudiants++;
    }

    @Override
    public String toString() {
        return super.toString() + " " + diplomeEnCours;
    }

    @Override
    void ecrirePersonne(){
        System.out.println(" EX1.Etudiant : "+ this.toString());
    }

    public static int nbEtudiants() {
        return nbEtudiants;
    }
}
