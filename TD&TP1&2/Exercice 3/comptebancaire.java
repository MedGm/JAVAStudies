public class comptebancaire {
    private String client;
    private int numero;
    private double solde;

    public comptebancaire() {}

    public comptebancaire(String client, int numero, double soldeInitial) {
        this.client = client;
        this.numero = numero;
        this.solde = soldeInitial;
    }

    public void verser(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Versement de " + montant + " DH effectué pour " + client);
        } else {
            System.out.println("Montant invalide pour un versement.");
        }
    }

    public void debiter(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Débit de " + montant + " DH effectué pour " + client);
        } else {
            System.out.println("Montant invalide ou insuffisant pour un débit.");
        }
    }

    public void afficherEtatCompte() {
        System.out.println("État du compte pour " + client + " :");
        System.out.println("Numero du compte : " + numero);
        System.out.println("Solde actuel : " + solde + " DH");
    }

}
