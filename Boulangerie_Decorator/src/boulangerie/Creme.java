package boulangerie;

public class Creme extends DecorateurGateaux {
    String type;

    public Creme(Gateau gateau, String type) {
        super(gateau, new Ingredient("Crème" + type, 0.50));
    }
}
