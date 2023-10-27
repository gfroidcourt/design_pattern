package boulangerie;

public class ChouxBuilder extends GateauBuilder {
    private String baseChoice;
    private String otherIngredient;
    private String topingChoice;

    public ChouxBuilder(String _baseChoice, String _otherIngredient, String _topingChoice) {
        gateau = new Choux();
        baseChoice = _baseChoice;
        otherIngredient = _otherIngredient;
        topingChoice = _topingChoice;
    }

    void addBase() {
        if (baseChoice == "Vanille")
            gateau = new Creme(gateau, "Vanille");
        else if (baseChoice == "Chocolat")
            gateau = new Creme(gateau, "Chocolat");
        else
            return;
    }

    void addOtherIngredient() {
        if (otherIngredient == "")
            return;
        gateau = new Chantilly(gateau);
    }

    void addToping() {
        if (topingChoice == "Noisettes")
            gateau = new Noisettes(gateau);
        else if (topingChoice == "Amandes")
            gateau = new Amandes(gateau);
        else
            return;
    }
}
