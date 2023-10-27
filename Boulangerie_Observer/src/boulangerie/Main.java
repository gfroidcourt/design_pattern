package boulangerie;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Boulangerie boulangerie;
    
    public static void main(String args[]){
        boulangerie = new Boulangerie();

        Patissier dupontPat = new Patissier();
        Patissier dupontIssier = new Patissier();

        boulangerie.addObserver(dupontPat);
        boulangerie.addObserver(dupontIssier);

        boulangerie.init_Stock();

        Scanner scanner = new Scanner(System.in);
        int choix = -2;

        while (choix != -1){
            List<Gateau> vitrine = boulangerie.getVitrine();
            System.out.println("\n\nVoici ce que nous vous proposons en vitrine.");
            System.out.println("Veuillez rentrer le numéro de votre commande :");
            System.out.println("(Pour quitter taper -1)");

            for(int i=0; i<vitrine.size(); i++){
                System.out.println("    "+i+" - "+vitrine.get(i).getDescription());
            }
            System.out.println("\n");

            choix = scanner.nextInt();
            
            if(choix >= 0 && choix < vitrine.size()){
                System.out.println("Votre gâteau: " + vitrine.get(choix).getDescription() + " coûte " + vitrine.get(choix).getPrix());
                boulangerie.removeGateau(vitrine.get(choix));
            }
        }
        scanner.close();
    }
}
