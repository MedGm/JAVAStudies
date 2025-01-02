package EX1;

public class TestPersonne {
    public static void main(String[] args) {

        Secretaire S = new Secretaire("Said","Abidi","Rue Elamal","Casablanca","A123");

        S.ecrirePersonne();

        Enseignant E = new Enseignant("Ahmed","Sbihi","Rue Bel Air","Fes","Informatique");

        E.ecrirePersonne();

        Etudiant E1 = new Etudiant("Samir","Merras","rue saules", "Oujda","licence informatique");
        Etudiant E2 = new Etudiant("Hamid","Nissani","rue d'olivier","Taza","DUT informatique");

        E1.ecrirePersonne();
        E2.ecrirePersonne();

        E.modifierPersonne("rue du grenadier","Rabat");
        S.modifierPersonne("rue taounat","Safi");

        Personne.nbPersonnes();
        System.out.println("Il y a "+Secretaire.nbSecretaires()+" Secretaires"
            +","+Enseignant.nbEnseignants()+" Enseignants"
            +","+Etudiant.nbEtudiants()+" Etudiants");

        E.ecrirePersonne();
        S.ecrirePersonne();

        //possible d'ajouter d'autre objets et tester differents methodes
    }
}