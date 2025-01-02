import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entrez le nombre des elements de ce tableau :");
        int tabmax = in.nextInt();
        int [] tab = new int[tabmax];
        for (int i = 0; i < tabmax; i++) {
            System.out.println("tab["+i+"]:");
            tab[i] = in.nextInt();
        }

        int max = tab[0];

        for(int i = 0; i < tabmax; i++){
            if(max < tab[i]){
                max = tab[i];
            }
        }

        System.out.println("le maximum des éléments entrée : " + max);
    }
}