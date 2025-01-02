package Interface;

public class ArticlePrimeur extends Article implements Produit.VendableKilo {
    private double stock;
    private Magasin magasin;

    public ArticlePrimeur(double prixAchat, double prixVente, String nom, String fournisseur, Magasin magasin) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.stock = 0;
        this.magasin = magasin;
    }

    public void remplirStock(double quantite) {
        this.stock += quantite;
        magasin.ajouterDepense(quantite * prixAchat);
    }

    @Override
    public double vendre(double quantite) {
        if (quantite <= stock) {
            stock -= quantite;
            double revenu = quantite * prixVente;
            magasin.ajouterRevenu(revenu);
            return revenu;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") + ", stock=" + stock + " kg}";
    }
}