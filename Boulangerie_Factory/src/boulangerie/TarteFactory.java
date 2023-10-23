package boulangerie;

public class TarteFactory extends GateauFactory{

    TarteFactory(){
        gateau = new Tarte();
    }

    @Override
    public GateauFactory AddBase(String type) {
        if (type == "Pomme")
            gateau = new Garniture(gateau, "Pomme");
        else if (type == "Abricot")
            gateau = new Garniture(gateau, "Abricot");
        return this;
    }

    @Override
    public GateauFactory AddOtherIngredient(String type) {
        if (type == "Meringue")
            gateau = new Meringue(gateau);
        return this;
    }

    @Override
    public GateauFactory AddToping(String type) {
        if (type == "Noisettes")
            gateau = new Noisettes(gateau);
        else if (type == "Amandes")
            gateau = new Amandes(gateau);
        return this;
    }
    
}
