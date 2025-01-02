package EX2;

public class ListeObjetGraphique {
    private final ObjetGraphique[] liste;
    private final int taille;
    private int index;

    public ListeObjetGraphique(int taille) {
        this.taille = taille;
        liste = new ObjetGraphique[this.taille];
        this.index = 0;
    }
    public void ajouter(ObjetGraphique f) {
        if (this.index < this.taille) {
            this.liste[this.index] = f;
            this.index++;
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public void afficheObjetsGraphique () {
        for( int i = 0 ; i < this.taille ; i++) {
            liste[i].affiche();
        }
    }


}
