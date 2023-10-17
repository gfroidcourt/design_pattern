package boulangerie;

public class Meringue extends DecorateurGateaux {
    public Meringue(Gateau gateau) {
        super(gateau, new Ingredient("Meringues", 0.50));
    }
}
