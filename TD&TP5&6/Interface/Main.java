package Interface;

public class Main {
    public static void main(String[] args) {
        // creer le magasin
        Magasin magasin = new Magasin(2, 2);

        // creer les produits pour le magasin
        ArticleElectromenager frigo = new ArticleElectromenager(2000, 2500, "Refrigerateur", "Samsung", magasin);
        ArticleElectromenager tv = new ArticleElectromenager(1500, 1800, "TV", "LG", magasin);
        
        ArticlePrimeur pommes = new ArticlePrimeur(2, 3.5, "Pommes", "Ferme locale", magasin);
        ArticlePrimeur oranges = new ArticlePrimeur(1.5, 2.8, "Oranges", "Importateur", magasin);

        // ajouter le produit au magasin
        magasin.ajouterArticleElectro(frigo, 0);
        magasin.ajouterArticleElectro(tv, 1);
        magasin.ajouterArticlePrimeur(pommes, 0);
        magasin.ajouterArticlePrimeur(oranges, 1);

        frigo.remplirStock(5);
        tv.remplirStock(10);
        pommes.remplirStock(100);
        oranges.remplirStock(80);

        System.out.println("Vente de 2 frigos: " + frigo.vendre(2));
        System.out.println("Vente de 10 tv: " + tv.vendre(10));
        System.out.println("Vente de 30kg de pommes: " + pommes.vendre(30));

        frigo.lanceSolde(20);
        System.out.println("Frigo en solde: " + frigo);

        System.out.println("Vente de 2 frigos: " + frigo.vendre(2));

        frigo.termineSolde(20);
        System.out.println("Frigo après solde: " + frigo);

        System.out.println(magasin);
    }
}