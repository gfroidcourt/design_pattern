package boulangerie;

public class ChouxFactory extends GateauFactory{

    ChouxFactory(){
        gateau = new Choux();
    }

    @Override
    public GateauFactory AddBase(String type) {
        if (type == "Vanille")
            gateau = new Creme(gateau, "Vanille");
        else if (type == "Chocolat")
            gateau = new Creme(gateau, "Chocolat");
        return this;
    }

    @Override
    public GateauFactory AddOtherIngredient(String type) {
        if (type == "Chantilly")
            gateau = new Chantilly(gateau);
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
