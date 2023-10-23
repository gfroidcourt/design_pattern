package boulangerie;

public class Choux implements Gateau {
    @Override
    public String getDescription() {
        return "Choux";
    }

    @Override
    public double getPrix() {
        return 1.50; // prix de base
    }
}
