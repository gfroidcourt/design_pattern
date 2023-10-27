package boulangerie;

public class Fruit extends DecorateurGateaux {
    public Fruit(Gateau gateau) {
        super(gateau, new Ingredient("Fruit", 0.50));
    }
}
