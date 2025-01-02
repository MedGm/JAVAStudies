package Interface;

public class Article {
    protected double prixAchat;
    protected double prixVente;
    protected String nom;
    protected String fournisseur;

    public Article(double prixAchat, double prixVente, String nom, String fournisseur) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.nom = nom;
        this.fournisseur = fournisseur;
    }

    public double rendement() {
        return ((prixVente - prixAchat) / prixAchat) * 100;
    }

    @Override
    public String toString() {
        return "Article{" +
                "nom='" + nom + '\'' +
                ", fournisseur='" + fournisseur + '\'' +
                ", prix d'achat=" + prixAchat +
                ", prix de vente=" + prixVente +
                ", rendement=" + rendement() + "%" +
                '}';
    }
}
