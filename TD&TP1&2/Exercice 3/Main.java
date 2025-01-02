import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du client : ");
        String nomClient = sc.nextLine();

        int numero =  (int) (100000 + Math.random() * 900000);

        System.out.print("Entrez le solde initial : ");
        double soldeInitial = sc.nextDouble();

        comptebancaire compte = new comptebancaire(nomClient,numero,soldeInitial);

        // Menu
        int choix;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Versement");
            System.out.println("2. Débit");
            System.out.println("3. Afficher état de compte");
            System.out.println("4. Quitter");
            System.out.print("Entrez votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1 : {
                    System.out.print("Entrez le montant à verser : ");
                    double montantVersement = sc.nextDouble();
                    compte.verser(montantVersement);
                    break;
                }
                case 2 : {
                    System.out.print("Entrez le montant à débiter : ");
                    double montantDebit = sc.nextDouble();
                    compte.debiter(montantDebit);
                    break;
                }
                case 3 : compte.afficherEtatCompte(); break;
                case 4 : System.out.println("Au revoir !"); break;
                default : System.out.println("Choix invalide.");
            }
        } while (choix != 4);
    }
}