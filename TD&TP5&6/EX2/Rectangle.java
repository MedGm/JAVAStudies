package EX2;

public class Rectangle extends ObjetGraphique{

    private double largeur, hauteur;

    Rectangle(){};
    Rectangle(int x,int y,double largeur, double hauteur){
        super(x,y);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    Rectangle(Rectangle r){
        super(r);
        this.largeur = r.largeur;
        this.hauteur = r.hauteur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    void setObjetGraphique(int x , int y , double largeur, double hauteur){
        Rectangle r = new Rectangle(x,y,largeur,hauteur);
    }

    @Override
    void affiche() {
        System.out.println("Rectangle de largeur = "+largeur
        +", hauteur = "+hauteur
        +" et son position : x= "+getX()
        +", y= "+getY());
    }

}
