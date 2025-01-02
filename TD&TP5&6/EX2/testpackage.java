package EX2;

import java.util.*;

public class testpackage {
    public static void main(String[] args) {
        ArrayList<ObjetGraphique> liste = new ArrayList<>();
        ObjetGraphique obj1 = new Cercle(1,2,3);
        ObjetGraphique obj2 = new Rectangle(2,5,3,6);
        ObjetGraphique obj3 = new Bouton(0,1,2,3,"b1");
        liste.add(obj1);
        liste.add(obj2);
        liste.add(obj3);
        liste.add(obj2);
        liste.add(obj3);
        liste.add(obj1);
        liste.add(obj3);
        liste.add(obj2);
        liste.add(obj1);
        liste.add(obj3);

        ListIterator<ObjetGraphique> listIter = liste.listIterator();

        while (listIter.hasNext()) {
            listIter.next().affiche();
        }


    }
}
