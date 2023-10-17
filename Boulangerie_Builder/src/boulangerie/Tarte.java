package boulangerie;

public class Tarte implements Gateau {
    private String type;

    public Tarte(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return "Tarte aux" + type;
    }

    @Override
    public double getPrix() {
        return 2.50; // prix de base
    }
}