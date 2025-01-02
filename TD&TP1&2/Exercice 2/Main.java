
public class Main {
    public static void main(String[] args) {
        int somme = 0;
        for(int i=0;i<=10;i++){
            somme += i;
        }
        System.out.println("la somme de 1 a 10 avec la boucle for : " + somme);
        somme = 0;
        int i = 0;
        do {
            somme += i;
            i++;
        }while(i<=10);
        System.out.println("la somme de 1 a 10 avec la boucle do..while : " + somme);
        somme = 0;
        i = 0;
        while (i<=10) {
            somme += i;
            i = i+1;
        }
        System.out.println("la somme de 1 a 10 avec la boucle while : " + somme);
    }
}