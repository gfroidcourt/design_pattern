package boulangerie;

public abstract class IngredientComponent implements Gateau {
    // Cette classe reste principalement une interface pour les feuilles et les
    // composites.
    // Elle n'a pas besoin de méthodes add(), remove() ou getChild() car elles ne
    // sont pas pertinentes pour les feuilles.
}
