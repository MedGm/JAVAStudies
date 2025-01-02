import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);  // pour avoir "." comme un separateur

        System.out.print("Entrer le Prix: ");

        double prix = sc.nextDouble();

        facturation f = new facturation();
        f.facture(prix);

    }
}