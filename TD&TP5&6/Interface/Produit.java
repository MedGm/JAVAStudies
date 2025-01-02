package Interface;

public class Produit {
    interface VendableKilo {
        double vendre(double quantite);
    }

    interface VendablePiece {
        double vendre(int quantite);
    }

    interface Solde {
        void lanceSolde(double pourcentage);
        void termineSolde(double pourcentage);
    }
}
