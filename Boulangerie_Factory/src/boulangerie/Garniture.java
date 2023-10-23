package boulangerie;

public class Garniture extends DecorateurGateaux {
    String type;

    public Garniture(Gateau gateau, String type) {
        super(gateau, new Ingredient("Garniture à " + type, 0.50));
    }
}
