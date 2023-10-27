package boulangerie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Boulangerie {
    private static final int STOCK_MINIMUM = 2;
    private HashMap<EnumRecette, Integer> stock;
    private Set<Gateau> vitrine;
    private List<PatissierObserver> observers;

    public Boulangerie() {
        stock = new HashMap<>();
        observers = new ArrayList<>();
        vitrine = new HashSet<Gateau>();
    }

    /*
     * Méthode lançant une boucle de notification 
     * afin de remplir pour une première fois les stocks
     */
    public void init_Stock(){
        stock.put(EnumRecette.CHOUX_CHOCOLAT, 0);
        stock.put(EnumRecette.CHOUX_CHOCOLAT_CHANTILLY_AMANDES, 0);
        stock.put(EnumRecette.CHOUX_CHOCOLAT_CHANTILLY_NOISETTES, 0);
        stock.put(EnumRecette.CHOUX_CHOCOLAT_CHANTILLY, 0);
        stock.put(EnumRecette.CHOUX_CHOCOLAT_AMANDES, 0);
        stock.put(EnumRecette.CHOUX_CHOCOLAT_NOISETTES, 0);
        stock.put(EnumRecette.CHOUX_VANILLE, 0);
        stock.put(EnumRecette.TARTE_ABRICOT, 0);
        stock.put(EnumRecette.TARTE_POMME, 0);
        notifyObserver();
    }

    public void addObserver(PatissierObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(PatissierObserver obs){
        observers.remove(obs);
    }

    private void notifyObserver() {
        for (PatissierObserver obs : observers) {
            obs.update(this);
        }
    }

    public void addGateau(Gateau gateau) {
        vitrine.add(gateau);
        stock.put(gateauToEnum(gateau),stock.get(gateauToEnum(gateau))+1);
    }

    public void removeGateau(Gateau gateau){
        vitrine.remove(gateau);
        stock.put(gateauToEnum(gateau),stock.get(gateauToEnum(gateau))-1);
        notifyObserver();
    }

    public Set<EnumRecette> needs(){
        Set<EnumRecette> result = new HashSet<>();
        for (EnumRecette recette : stock.keySet()) {
            if (stock.get(recette) < STOCK_MINIMUM) {
                result.add(recette);
            }
        }
        return result;
    }

    public List<Gateau> getVitrine(){
        List<Gateau> result = new ArrayList<Gateau>();
        for (Gateau g : vitrine) {
            result.add(g);
            if(result.size() > 1) {
                for(int i=0; i<result.size()-1; i++){
                    if(g.getDescription().compareTo(result.get(i).getDescription()) == -1){
                        for(int j = result.size()-1; i< j; j--){
                            result.set(j, result.get(j-1));
                        }
                        result.set(i,g);
                    }
                }
            }
        }
        return result;
    }

    private EnumRecette gateauToEnum(Gateau gateau){
        switch (gateau.getDescription()) {
            case "Choux, Crème Vanille, Chantilly, Noisettes":
                return EnumRecette.CHOUX_VANILLE_CHANTILLY_NOISETTES;
            case "Choux, Crème Vanille, Chantilly, Amandes grillées":
                return EnumRecette.CHOUX_VANILLE_CHANTILLY_AMANDES;
            case "Choux, Crème Vanille, Chantilly":
                return EnumRecette.CHOUX_VANILLE_CHANTILLY;
            case "Choux, Crème Vanille, Noisettes":
                return EnumRecette.CHOUX_VANILLE_NOISETTES;
            case "Choux, Crème Vanille, Amandes grillées":
                return EnumRecette.CHOUX_VANILLE_AMANDES;
            case "Choux, Crème Vanille":
                return EnumRecette.CHOUX_VANILLE;

            case "Choux, Crème Chocolat, Chantilly, Noisettes":
                return EnumRecette.CHOUX_CHOCOLAT_CHANTILLY_NOISETTES;
            case "Choux, Crème Chocolat, Chantilly, Amandes grillées":
                return EnumRecette.CHOUX_CHOCOLAT_CHANTILLY_AMANDES;
            case "Choux, Crème Chocolat, Chantilly":
                return EnumRecette.CHOUX_CHOCOLAT_CHANTILLY;
            case "Choux, Crème Chocolat, Noisettes":
                return EnumRecette.CHOUX_CHOCOLAT_NOISETTES;
            case "Choux, Crème Chocolat, Amandes grillées":
                return EnumRecette.CHOUX_CHOCOLAT_AMANDES;
            case "Choux, Crème Chocolat":
                return EnumRecette.CHOUX_CHOCOLAT;


            case "Tarte aux Pommes, Meringues, Noisettes":
                return EnumRecette.TARTE_POMME_MERINGUE_NOISETTES;
            case "Tarte aux Pommes, Meringues, Amandes grillées":
                return EnumRecette.TARTE_POMME_MERINGUE_AMANDES;
            case "Tarte aux Pommes, Meringues":
                return EnumRecette.TARTE_POMME_MERINGUE;
            case "Tarte aux Pommes, Noisettes":
                return EnumRecette.TARTE_POMME_NOISETTES;
            case "Tarte aux Pommes, Amandes grillées":
                return EnumRecette.TARTE_POMME_AMANDES;
            case "Tarte aux Pommes":
                return EnumRecette.TARTE_POMME;

            case "Tarte aux Abricots, Meringues, Noisettes":
                return EnumRecette.TARTE_ABRICOT_MERINGUE_NOISETTES;
            case "Tarte aux Abricots, Meringues, Amandes grillées":
                return EnumRecette.TARTE_ABRICOT_MERINGUE_AMANDES;
            case "Tarte aux Abricots, Meringues":
                return EnumRecette.TARTE_ABRICOT_MERINGUE;
            case "Tarte aux Abricots, Noisettes":
                return EnumRecette.TARTE_ABRICOT_NOISETTES;
            case "Tarte aux Abricots, Amandes grillées":
                return EnumRecette.TARTE_ABRICOT_AMANDES;
            case "Tarte aux Abricots":
                return EnumRecette.TARTE_ABRICOT;
            default:
                return EnumRecette.CHOUX_CHOCOLAT;
        }
    }
}
