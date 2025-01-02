package EX1;

public class Enseignant extends Personne {
    private String specialite;
    static int nbEnseignants;

    Enseignant(String nom, String prenom, String rue, String ville, String specialite) {
        super(nom, prenom, rue, ville);
        this.specialite = specialite;
        nbEnseignants++;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.specialite;
    }

    @Override
    public void ecrirePersonne(){
        System.out.println("EX1.Enseignant : " + this.toString());
    }

    public static int nbEnseignants(){
        return nbEnseignants;
    }
}
