package boulangerie;

import java.util.ArrayList;
import java.util.List;

public class GateauComposite extends IngredientComponent {
    private List<Gateau> gateauxComponents = new ArrayList<>();
    private String description;
    private double prix;

    public GateauComposite(String description, double prix) {
        this.description = description;
        this.prix = prix;
    }

    public void add(IngredientComponent ingredientComponent) {
        gateauxComponents.add(ingredientComponent);
    }

    @Override
    public String getDescription() {
        StringBuilder result = new StringBuilder(description);
        for (Gateau gateau : gateauxComponents) {
            result.append(", ").append(gateau.getDescription());
        }
        return result.toString();
    }

    @Override
    public double getPrix() {
        double totalPrix = prix;
        for (Gateau gateau : gateauxComponents) {
            totalPrix += gateau.getPrix();
        }
        return totalPrix;
    }
}
