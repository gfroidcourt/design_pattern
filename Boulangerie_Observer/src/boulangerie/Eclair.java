package boulangerie;

public class Eclair implements Gateau {
    @Override
    public String getDescription() {
        return "Eclair";
    }

    @Override
    public double getPrix() {
        return 1.50; // prix de base
    }
}