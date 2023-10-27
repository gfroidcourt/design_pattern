package boulangerie;

public class Patissier implements PatissierObserver {

    @Override
    public void update(Boulangerie boulangerie) {
        while(!boulangerie.needs().isEmpty()){
            EnumRecette recette = boulangerie.needs().iterator().next();

            // Sert à démontrer que le patissier voit bien les besoins demander.
            // A commenter si non besoin
            System.out.println("\nBesoin défini :");
            for(EnumRecette r : boulangerie.needs()){
                System.out.println("-"+r);
            }
            
            switch(recette){
                case CHOUX_VANILLE_CHANTILLY_NOISETTES:
                    boulangerie.addGateau(
                        (new ChouxBuilder(
                            "Vanille",
                            "Chantilly",
                            "Noisettes")
                            ).build());
                    break;
                case CHOUX_VANILLE_CHANTILLY_AMANDES: 
                    boulangerie.addGateau(
                        (new ChouxBuilder(
                            "Vanille",
                            "Chantilly",
                            "Amandes")
                            ).build());
                    break;
                case CHOUX_VANILLE_CHANTILLY:
                    boulangerie.addGateau(
                        (new ChouxBuilder(
                            "Vanille",
                            "Chantilly",
                            "")
                            ).build());
                    break;
                case CHOUX_VANILLE_NOISETTES:
                    boulangerie.addGateau(
                        (new ChouxBuilder(
                            "Vanille",
                            "",
                            "Noisettes")
                            ).build());
                    break;
                case CHOUX_VANILLE_AMANDES:
                    boulangerie.addGateau(
                        (new ChouxBuilder(
                            "Vanille",
                            "",
                            "Amandes")
                            ).build());
                    break;
                case CHOUX_VANILLE:
                    boulangerie.addGateau(
                        (new ChouxBuilder(
                            "Vanille",
                            "",
                            "")
                            ).build());
                    break;
                case CHOUX_CHOCOLAT_CHANTILLY_NOISETTES:
                    boulangerie.addGateau(
                        (new ChouxBuilder(
                            "Chocolat",
                            "Chantilly",
                            "Noisettes")
                            ).build());
                    break;
                case CHOUX_CHOCOLAT_CHANTILLY_AMANDES:
                    boulangerie.addGateau(
                        (new ChouxBuilder(
                            "Chocolat",
                            "Chantilly",
                            "Amandes")
                            ).build());
                    break;
                case CHOUX_CHOCOLAT_CHANTILLY:
                    boulangerie.addGateau(
                        (new ChouxBuilder(
                            "Chocolat",
                            "Chantilly",
                            "")
                            ).build());
                    break;
                case CHOUX_CHOCOLAT_NOISETTES:
                    boulangerie.addGateau(
                        (new ChouxBuilder(
                            "Chocolat",
                            "",
                            "Noisettes")
                            ).build());
                    break;
                case CHOUX_CHOCOLAT_AMANDES:
                    boulangerie.addGateau(
                        (new ChouxBuilder(
                            "Chocolat",
                            "",
                            "Amandes")
                            ).build());
                    break;
                case CHOUX_CHOCOLAT:
                        boulangerie.addGateau(
                        (new ChouxBuilder(
                            "Chocolat",
                            "",
                            "")
                            ).build());
                    break;
            
                case TARTE_POMME_MERINGUE_NOISETTES:
                    boulangerie.addGateau(
                        (new TarteBuilder(
                            "Pommes",
                            "Meringues",
                            "Noisettes")
                            ).build());
                    break;
                case TARTE_POMME_MERINGUE_AMANDES:
                    boulangerie.addGateau(
                        (new TarteBuilder(
                            "Pommes",
                            "Meringues",
                            "Amandes")
                            ).build());
                    break;
                case TARTE_POMME_MERINGUE:
                    boulangerie.addGateau(
                        (new TarteBuilder(
                            "Pommes",
                            "Meringues",
                            "")
                            ).build());
                    break;
                case TARTE_POMME_NOISETTES:
                    boulangerie.addGateau(
                        (new TarteBuilder(
                            "Pommes",
                            "",
                            "Noisettes")
                            ).build());
                    break;
                case TARTE_POMME_AMANDES:
                    boulangerie.addGateau(
                        (new TarteBuilder(
                            "Pommes",
                            "",
                            "Amandes")
                            ).build());
                    break;
                case TARTE_POMME:
                    boulangerie.addGateau(
                        (new TarteBuilder(
                            "Pommes",
                            "",
                            "")
                            ).build());
                    break;
                case TARTE_ABRICOT_MERINGUE_NOISETTES:
                    boulangerie.addGateau(
                        (new TarteBuilder(
                            "Abricots",
                            "Meringues",
                            "Noisettes")
                            ).build());
                    break;
                case TARTE_ABRICOT_MERINGUE_AMANDES:
                    boulangerie.addGateau(
                        (new TarteBuilder(
                            "Abricots",
                            "Meringues",
                            "Amandes")
                            ).build());
                    break;
                case TARTE_ABRICOT_MERINGUE:
                    boulangerie.addGateau(
                        (new TarteBuilder(
                            "Abricots",
                            "Meringues",
                            "")
                            ).build());
                    break;
                case TARTE_ABRICOT_NOISETTES:
                    boulangerie.addGateau(
                        (new TarteBuilder(
                            "Abricots",
                            "",
                            "Noisettes")
                            ).build());
                    break;
                case TARTE_ABRICOT_AMANDES:
                    boulangerie.addGateau(
                        (new TarteBuilder(
                            "Abricots",
                            "",
                            "Amandes")
                            ).build());
                    break;
                case TARTE_ABRICOT:
                    boulangerie.addGateau(
                        (new TarteBuilder(
                            "Abricots",
                            "",
                            "")
                            ).build());
                    break;
            }
        }
    }

}
