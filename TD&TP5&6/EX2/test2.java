package EX2;

public class test2 {
    public static void main(String[] args) {
        ListeObjetGraphique liste = new ListeObjetGraphique(10);
        ObjetGraphique obj1 = new Cercle(1,2,3);
        ObjetGraphique obj2 = new Rectangle(2,5,3,6);
        ObjetGraphique obj3 = new Bouton(0,1,2,3,"b1");
        liste.ajouter(obj1);
        liste.ajouter(obj2);
        liste.ajouter(obj3);
        liste.ajouter(obj2);
        liste.ajouter(obj3);
        liste.ajouter(obj1);
        liste.ajouter(obj3);
        liste.ajouter(obj2);
        liste.ajouter(obj1);
        liste.ajouter(obj3);
        liste.afficheObjetsGraphique();

        liste.ajouter(obj3); //throw exception
    }
}
