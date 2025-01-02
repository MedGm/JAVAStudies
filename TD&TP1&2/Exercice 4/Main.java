import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entrez le nombre des etudiants :");
        int studentnNum = in.nextInt();
        double [] tab = new double[studentnNum];
        for (int i = 0; i < studentnNum; i++) {
            System.out.println("Etudiant " + (i + 1) + ":");
            tab[i] = in.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < studentnNum; i++) {
            sum += tab[i];
        }
        double Moyenne = sum / studentnNum;

        int cmpt = 0;
        for(int i = 0; i < studentnNum; i++) {
            if(tab[i] > Moyenne) {cmpt ++;}
        }

        System.out.println("le nombre des etudiants ayant une note > au moyenne : " + cmpt);
    }
}