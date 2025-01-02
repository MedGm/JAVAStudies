package EX2;

public class Cercle extends ObjetGraphique{

    private double rayon;

    Cercle(){};

    Cercle(int x, int y, double rayon){
        super(x, y);
        this.rayon = rayon;
    }

    Cercle(Cercle c){
        super(c);
        this.rayon = c.rayon;
    }

    public void setRayon(double rayon){
        this.rayon = rayon;
    }

    public double getRayon(){
        return rayon;
    }

    @Override
    public void affiche() {
        System.out.println("Cercle de rayon = " + rayon
        +", x = " + getX()
        + ", y = " + getY());
    }
}
