package boulangerie;

public class EclairBuilder extends GateauBuilder {

    private String baseChoice;
    private String topingChoice;

    public EclairBuilder(String _baseChoice, String _topingChoice) {
        gateau = new Eclair();
        baseChoice = _baseChoice;
        topingChoice = _topingChoice;
    }

    @Override
    void addBase() {
        if (baseChoice == "Café")
            gateau = new Creme(gateau, "Café");
        else if (baseChoice == "Chocolat")
            gateau = new Creme(gateau, "Chocolat");
        else
            return;
    }

    @Override
    void addToping() {
        if (topingChoice == "Amandes")
            gateau = new Amandes(gateau);
        else
            return;
    }
}
