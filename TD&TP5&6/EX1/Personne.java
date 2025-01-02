package EX1;

public abstract class Personne {
    private String nom;
    private String prenom;
    private String rue;
    private String ville;
    static int nbPersonnes;

    Personne(String nom, String prenom, String rue, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.ville = ville;
        nbPersonnes++;
    }

    public String toString(){
        return nom + " " + prenom + " " + rue + " " + ville;
    }

    abstract void ecrirePersonne();

    public static void nbPersonnes(){
        System.out.println("il y a " + nbPersonnes + " nombre de Personnes");
    }

    public void modifierPersonne(String rue, String ville){
        this.rue = rue;
        this.ville = ville;
    }
}
