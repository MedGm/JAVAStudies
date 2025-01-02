public class facturation {
    private static final double TVA = 0.186;

    public facturation(){}

    public void facture(double prix) {
        if(prix<0){throw new IllegalArgumentException("Prix invalide");
        }

        double TTC = prix * (1+TVA);
        System.out.println("Prix TTC (avant remise) :" + TTC + "DH");

        double remise = 0.0;
        if (prix < 1000) {
            remise = 0.0; // Pas de remise
        } else if (prix < 2000) {
            remise = 0.01; // 1 % de remise
        } else if (prix < 5000) {
            remise = 0.03; // 3 % de remise
        } else {
            remise = 0.05; // 5 % de remise
        }

        double PrixFinale = TTC * (1-remise);
        System.out.println("Prix final (après remise) :" + PrixFinale + "DH");
    }
}
