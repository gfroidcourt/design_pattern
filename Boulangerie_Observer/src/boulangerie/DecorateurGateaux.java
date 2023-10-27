package boulangerie;

public abstract class DecorateurGateaux implements Gateau {
    private Gateau gateau;
    private Ingredient ingredient;

    public DecorateurGateaux(Gateau gateau, Ingredient ingredient) {
        this.gateau = gateau;
        this.ingredient = ingredient;
    }

    @Override
    public String getDescription() {
        return gateau.getDescription() + ", " + ingredient.getNom();
    }

    @Override
    public double getPrix() {
        return gateau.getPrix() + ingredient.getPrix();
    }
}