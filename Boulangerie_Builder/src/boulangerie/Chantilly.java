package boulangerie;

public class Chantilly extends DecorateurGateaux {
    public Chantilly(Gateau gateau) {
        super(gateau, new Ingredient("Chantilly", 0.50));
    }
}