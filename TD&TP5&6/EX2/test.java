package EX2;

public class test {
    public static void main(String[] args) {
        ObjetGraphique [] obj = new ObjetGraphique[10];
        obj[0] = new Cercle(1,2,3);
        obj[1] = new Cercle(2,3,4);
        obj[2] = new Cercle((Cercle) obj[1]);
        obj[3] = new Rectangle(5,6,7,8);
        obj[4] = new Rectangle(6,7,8,9);
        obj[5] = new Rectangle((Rectangle) obj[3]);
        obj[6] = new Bouton(0,2,5,6,"b1");
        obj[7] = new Bouton(0,3,6,7,"b2");
        obj[8] = new Bouton((Bouton) obj[7]);
        obj[9] = new Rectangle((Bouton) obj[8]); //ceci exprime le downcasting

        for (ObjetGraphique afficheobj : obj) {
            afficheobj.affiche();
        }
    }
}
