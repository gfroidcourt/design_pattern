package boulangerie;

public class GateauBuilder {
    private Gateau gateau;

    public GateauBuilder(Gateau gateau) {
        this.gateau = gateau;
    }

    public GateauBuilder addCremeVanille() {
        gateau = new CremeVanille(gateau);
        return this;
    }

    public GateauBuilder addChocolat() {
        gateau = new Chocolat(gateau);
        return this;
    }

    public GateauBuilder addChantilly() {
        gateau = new Chantilly(gateau);
        return this;
    }

    public GateauBuilder addNoisettes() {
        gateau = new Noisettes(gateau);
        return this;
    }

    public GateauBuilder addAmandes() {
        gateau = new Amandes(gateau);
        return this;
    }

    public GateauBuilder addMeringue() {
        gateau = new Meringue(gateau);
        return this;
    }

    public Gateau build() {
        return gateau;
    }
}
