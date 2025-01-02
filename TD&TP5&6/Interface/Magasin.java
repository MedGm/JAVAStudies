package Interface;

public class Magasin {
    private double depense;
    private double revenu;
    private ArticleElectromenager[] articlesElectro;
    private ArticlePrimeur[] articlesPrimeur;

    public Magasin(int maxElectro, int maxPrimeur) {
        this.depense = 0;
        this.revenu = 0;
        this.articlesElectro = new ArticleElectromenager[maxElectro];
        this.articlesPrimeur = new ArticlePrimeur[maxPrimeur];
    }

    public void ajouterArticleElectro(ArticleElectromenager article, int index) {
        if (index < articlesElectro.length) {
            articlesElectro[index] = article;
        }
    }

    public void ajouterArticlePrimeur(ArticlePrimeur article, int index) {
        if (index < articlesPrimeur.length) {
            articlesPrimeur[index] = article;
        }
    }

    public void ajouterDepense(double montant) {
        this.depense += montant;
    }

    public void ajouterRevenu(double montant) {
        this.revenu += montant;
    }

    public double rendement() {
        if (depense == 0) return 0;
        return ((revenu - depense) / depense) * 100;
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "depense=" + depense +
                ", revenu=" + revenu +
                ", rendement=" + rendement() + "%" +
                '}';
    }
}
