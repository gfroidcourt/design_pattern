package boulangerie;

import java.util.Scanner;

public class Boulangerie {

    private static GateauBuilder gateauBuilder(Scanner scanner, String type) {
        int choix = -1;
        String baseChoice = "";
        String topingChoice = "";
        String otherIngredient = "";

        switch (type) {
            case "Eclair":
                System.out.println("Base");
                System.out.println("1. Café");
                System.out.println("2. Chocolat");
                choix = scanner.nextInt();
                if (choix == 1)
                    baseChoice = "Café";
                if (choix == 2)
                    baseChoice = "Chocolat";
                System.out.println("Toping");
                System.out.println("1. Rien");
                System.out.println("2. Ammandes");
                choix = scanner.nextInt();
                if (choix == 2)
                    topingChoice = "Amandes";
                return new EclairBuilder(baseChoice, topingChoice);

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
                return new ChouxBuilder(baseChoice, otherIngredient, topingChoice);

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
                return new TarteBuilder(baseChoice, otherIngredient, topingChoice);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que voulez-vous acheter ? ");
        System.out.println("1. Choux");
        System.out.println("2. Tarte");
        System.out.println("3. Éclair");
        int choix = scanner.nextInt();
        String type = "";
        if (choix == 1)
            type = "Choux";
        if (choix == 2)
            type = "Tarte";
        if (choix == 3)
            type = "Eclair";

        Gateau gateau = null;
        GateauBuilder recette = gateauBuilder(scanner, type);

        if (recette != null) {
            gateau = recette.build();
        }

        System.out.println("Votre gâteau: " + gateau.getDescription() + " coûte " + gateau.getPrix());
        scanner.close();
    }

}
