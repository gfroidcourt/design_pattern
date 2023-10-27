package boulangerie;

public abstract class GateauFactory {

    protected Gateau gateau;
    
    public static GateauFactory getFactory(TypeGateau type){
        switch(type){
            case CHOUX:
                return new ChouxFactory();
            case TARTE:
                return new TarteFactory();
            default:
                break;
        }
        return null;
    }

    public abstract GateauFactory AddBase(String type);
    public abstract GateauFactory AddOtherIngredient(String type);
    public abstract GateauFactory AddToping(String type);

    public Gateau getGateau(){
        return gateau;
    }

    public static enum TypeGateau{
        CHOUX,
        TARTE
    };
}