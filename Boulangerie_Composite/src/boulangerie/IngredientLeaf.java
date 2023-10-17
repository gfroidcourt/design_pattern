package boulangerie;

public class IngredientLeaf extends IngredientComponent {
    String description;
    double prix;

    public IngredientLeaf(String description, double prix) {
        this.description = description;
        this.prix = prix;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrix() {
        return prix;
    }
}
