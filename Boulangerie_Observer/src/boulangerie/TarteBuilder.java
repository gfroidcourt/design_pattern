package boulangerie;

public class TarteBuilder extends GateauBuilder {

    private String baseChoice;
    private String otherIngredient;
    private String topingChoice;

    public TarteBuilder(String _baseChoice, String _otherIngredient, String _topingChoice) {
        baseChoice = _baseChoice;
        otherIngredient = _otherIngredient;
        topingChoice = _topingChoice;
    }

    void addBase() {
        if (baseChoice == "Pommes")
            gateau = new Tarte("Pommes");
        else if (baseChoice == "Abricots")
            gateau = new Tarte("Abricots");
        else
            return;

    }

    void addOtherIngredient() {
        if (otherIngredient == "Meringue") {
            gateau = new Meringue(gateau);
        }
    }

    void addToping() {
        if (topingChoice == "")
            return;
        if (topingChoice == "Noisettes")
            gateau = new Noisettes(gateau);
        else if (topingChoice == "Amandes")
            gateau = new Amandes(gateau);
    }
}
