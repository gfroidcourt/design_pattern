package boulangerie;

public abstract class GateauBuilder {
    protected Gateau gateau;

    public GateauBuilder() {
        gateau = null;
    }

    void addBase() {

    }

    void addPrincipalIngredient() {

    }

    void addOtherIngredient() {

    }

    void addToping() {

    }

    public Gateau build() {
        addBase();
        addPrincipalIngredient();
        addOtherIngredient();
        addToping();
        return this.gateau;
    }
}
