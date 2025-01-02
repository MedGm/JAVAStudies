package EX2;

public class Bouton extends Rectangle{
    private String text;

    Bouton(){};
    Bouton(int x, int y, double l,double h, String text){
        super(x,y,l,h);
        this.text = text;
    }

    Bouton(Bouton b){
        super(b);
        this.text = b.text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void affiche() {
        System.out.println("Bouton : " + text
        +", x ="+super.getX()+", y ="+super.getY()
        +", largeur ="+super.getLargeur()+", hauteur ="+super.getHauteur());
    }

}
