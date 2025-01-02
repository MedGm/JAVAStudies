package Interface;

public class ArticleElectromenager extends Article implements Produit.VendablePiece, Produit.Solde {
    private int stock;
    private Magasin magasin;

    public ArticleElectromenager(double prixAchat, double prixVente, String nom, String fournisseur, Magasin magasin) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.stock = 0;
        this.magasin = magasin;
    }

    public void remplirStock(int quantite) {
        this.stock += quantite;
        magasin.ajouterDepense(quantite * prixAchat);
    }

    @Override
    public double vendre(int quantite) {
        if (quantite <= stock) {
            stock -= quantite;
            double revenu = quantite * prixVente;
            magasin.ajouterRevenu(revenu);
            return revenu;
        }
        return 0;
    }

    @Override
    public void lanceSolde(double pourcentage) {
        this.prixVente = this.prixVente * (1 - pourcentage / 100);
    }

    @Override
    public void termineSolde(double pourcentage) {
        this.prixVente = this.prixVente / (1 - pourcentage / 100);
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") + ", stock=" + stock + "}";
    }
}
