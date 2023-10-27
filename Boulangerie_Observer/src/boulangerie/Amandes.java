package boulangerie;

public class Amandes extends DecorateurGateaux {
    public Amandes(Gateau gateau) {
        super(gateau, new Ingredient("Amandes grillées", 0.50));
    }
}
