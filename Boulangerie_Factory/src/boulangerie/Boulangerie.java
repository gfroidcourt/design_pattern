package boulangerie;

import java.util.Scanner;

public class Boulangerie {

    private static Gateau gateauBuilder(Scanner scanner, String type) {
        int choix = -1;
        String baseChoice = "";
        String topingChoice = "";
        String otherIngredient = "";

        switch (type) {
            case "Choux":
                System.out.println("Base");
                System.out.println("1. Vanille");
                System.out.println("2. Chocolat");

                choix = scanner.nextInt();

                if (choix == 1)
                    baseChoice = "Vanille";
                if (choix == 2)
                    baseChoice = "Chocolat";

                System.out.println("Autre ingrédient");
                System.out.println("1. Rien");
                System.out.println("2. Chantilly");
                choix = scanner.nextInt();

                if (choix == 2)
                    otherIngredient = "Chantilly";

                System.out.println("Toping");
                System.out.println("1. Rien");
                System.out.println("2. Ammandes");
                System.out.println("3. Noisettes");

                choix = scanner.nextInt();

                if (choix == 2)
                    topingChoice = "Amandes";
                if (choix == 3)
                    topingChoice = "Noisettes";
                break;

            case "Tarte":
                System.out.println("Base");
                System.out.println("1. Pommes");
                System.out.println("2. Abricots");

                choix = scanner.nextInt();

                if (choix == 1)
                    baseChoice = "Pommes";
                if (choix == 2)
                    baseChoice = "Abricots";

                System.out.println("Autre ingrédient");
                System.out.println("1. Rien");
                System.out.println("2. Meringue");
                choix = scanner.nextInt();

                if (choix == 2)
                    otherIngredient = "Meringue";

                System.out.println("Toping");
                System.out.println("1. Rien");
                System.out.println("2. Ammandes");
                System.out.println("3. Noisettes");

                choix = scanner.nextInt();

                if (choix == 2)
                    topingChoice = "Amandes";
                if (choix == 3)
                    topingChoice = "Noisettes";
                break;
        }

        GateauFactory factoryGateau = GateauFactory.getFactory(type);
        return factoryGateau.AddBase(baseChoice).AddOtherIngredient(otherIngredient).AddToping(topingChoice).getGateau();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez un gâteau de base: ");
        System.out.println("1. Choux");
        System.out.println("2. Tarte");
        int choix = scanner.nextInt();

        String type = "";
        if (choix == 1)
            type = "Choux";
        if (choix == 2)
            type = "Tarte";

        Gateau gateau = gateauBuilder(scanner, type);

        if(gateau != null){
            System.out.println("Votre gâteau: " + gateau.getDescription() + " coûte " + gateau.getPrix());
        }

        scanner.close();
    }
}
