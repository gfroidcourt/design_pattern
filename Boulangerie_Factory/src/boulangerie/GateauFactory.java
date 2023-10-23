package boulangerie;

public abstract class GateauFactory {

    protected Gateau gateau;
    
    public static GateauFactory getFactory(String type){
        if(type == "Choux"){
            return new ChouxFactory();
        } else if (type == "Tarte"){
            return new TarteFactory();
        }

        return null;
    }

    public abstract GateauFactory AddBase(String type);
    public abstract GateauFactory AddOtherIngredient(String type);
    public abstract GateauFactory AddToping(String type);

    public Gateau getGateau(){
        return gateau;
    }
}
