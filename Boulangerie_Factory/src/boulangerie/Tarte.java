package boulangerie;

public class Tarte implements Gateau {
    @Override
    public String getDescription() {
        return "Tarte";
    }

    @Override
    public double getPrix() {
        return 2.50; // prix de base
    }
}