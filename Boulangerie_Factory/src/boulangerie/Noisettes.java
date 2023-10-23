package boulangerie;

public class Noisettes extends DecorateurGateaux {
    public Noisettes(Gateau gateau) {
        super(gateau, new Ingredient("Noisettes", 0.50));
    }
}
