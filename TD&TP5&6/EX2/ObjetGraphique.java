package EX2;

abstract public class ObjetGraphique {
    private int x,y;

    ObjetGraphique(){};
    ObjetGraphique(int x,int y){
        this.x = x;
        this.y = y;
    }
    ObjetGraphique(ObjetGraphique o){
        this.x = o.x;
        this.y = o.y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    void setPosition(int x,int y){
        this.x = x;
        this.y = y;
    }

    void deplacer(int x,int y){
        this.x += x;
        this.y += y;
    }

    abstract void affiche();
}

