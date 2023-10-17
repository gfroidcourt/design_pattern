package boulangerie;

import java.util.Scanner;

public class Boulangerie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez un gâteau de base: ");
        System.out.println("1. Choux");
        System.out.println("2. Tarte aux pommes");
        System.out.println("3. Tarte aux abricots");
        int choix = scanner.nextInt();

        Gateau gateau;
        if (choix == 1) {
            gateau = new Choux();
        } else if (choix == 2) {
            gateau = new Tarte(" pommes");
        } else if (choix == 3) {
            gateau = new Tarte(" abricots");
        } else {
            System.out.println("Choix non valide. Veuillez réessayer.");
            scanner.close();
            return;
        }

        while (true)

        {
            System.out.println("Ajoutez un ingrédient (ou tapez 'fin' pour terminer): ");
            System.out.println("1. Crème Vanille");
            System.out.println("2. Crème Chocolat");
            System.out.println("3. Chantilly");
            System.out.println("4. Noisettes grillées");
            System.out.println("5. Amandes grillées");
            System.out.println("6. Meringue");

            String input = scanner.next();

            if ("fin".equalsIgnoreCase(input)) {
                break;
            }

            switch (input) {
                case "1":
                    gateau = new Creme(gateau, "Vanille");
                    break;
                case "2":
                    gateau = new Creme(gateau, "Chocolat");
                    break;
                case "3":
                    gateau = new Chantilly(gateau);
                    break;
                case "4":
                    gateau = new Noisettes(gateau);
                    break;
                case "5":
                    gateau = new Amandes(gateau);
                    break;
                case "6":
                    gateau = new Meringue(gateau);
                    break;
                default:
                    System.out.println("Choix non valide. Veuillez réessayer.");
            }
        }

        System.out.println("Votre gâteau: " + gateau.getDescription() + " coûte " + gateau.getPrix());
        scanner.close();
    }
}
