package boulangerie;

import java.util.Scanner;

public class Boulangerie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez un gâteau de base: ");
        System.out.println("1. Choux (1.50€)");
        System.out.println("2. Tarte (2.50€)");
        int choix = scanner.nextInt();

        GateauComposite gateau;

        if (choix == 1) {
            gateau = new GateauComposite("Choux", 1.50);
            System.out.println("Choisissez une crème pour le choux: ");
            System.out.println("1. Vanille (0.50€)");
            System.out.println("2. Chocolat (0.70€)");
            int cremeChoix = scanner.nextInt();

            if (cremeChoix == 1)
                gateau.add(new IngredientLeaf("Crème Vanille", 0.50));
            else
                gateau.add(new IngredientLeaf("Chocolat", 0.70));

        } else {
            gateau = new GateauComposite("Tarte", 2.50);
            System.out.println("Choisissez un fruit pour la tarte: ");
            System.out.println("1. Pommes (0€)");
            System.out.println("2. Abricots (0€)");
            int fruitChoix = scanner.nextInt();

            if (fruitChoix == 1)
                gateau.add(new IngredientLeaf("Pommes", 0));
            else
                gateau.add(new IngredientLeaf("Abricots", 0));
        }

        while (true) {
            System.out.println("Souhaiteriez-vous ajouter un nouvel ingrédient? (O/N)");
            String response = scanner.next();

            if (response.equals("N")) {
                System.out.println("Votre gâteau: " + gateau.getDescription() + " coûte " + gateau.getPrix() + "€");
                scanner.close();
                return;
            } else if (response.equals("O")) {
                System.out.println("Quel ingrédient souhaitez-vous ajouter parmi:");
                System.out.println("1. Chantilly (0.50€)");
                System.out.println("2. Amandes grillées (0.20€)");
                System.out.println("3. Noisettes (0.30€)");
                System.out.println("4. Fruits frais (0.50€)");
                int ingredientChoix = scanner.nextInt();

                switch (ingredientChoix) {
                    case 1:
                        gateau.add(new IngredientLeaf("Chantilly", 0.50));
                        break;
                    case 2:
                        gateau.add(new IngredientLeaf("Amandes grillées", 0.20));
                        break;
                    case 3:
                        gateau.add(new IngredientLeaf("Noisettes", 0.30));
                        break;
                    case 4:
                        gateau.add(new IngredientLeaf("Fruits frais", 0.50));
                        break;
                    default:
                        System.out.println("Entrée incorrecte");
                        break;
                }
            } else {
                System.out.println("Entrée incorrecte");
            }
        }
    }
}