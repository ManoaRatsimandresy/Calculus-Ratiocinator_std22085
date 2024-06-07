package com.calculusRationacitor;

public class CalculusRatiocinatorUse {
    AllAffirmation affirmation =  new AllAffirmation();
    ConjonctionType allconjonction = new ConjonctionType();


    /*  calcule deux affirmations avec une seule conjonction */

    public String calculusDeuxAffirmations(String Affirmation1, String Conjonction, String Affirmation2) {



        /*  la conjonction 'et' */



        if (Affirmation1 == affirmation.vérité && Conjonction == allconjonction.et && Affirmation2 == affirmation.vérité) {
            return "Vraie";
        } else

            if ((Affirmation1 == affirmation.vérité && Conjonction == allconjonction.et && Affirmation2 == affirmation.mensonge)
                ||
            (Affirmation1 == affirmation.mensonge && Conjonction == allconjonction.et && Affirmation2 == affirmation.vérité)) {
            return "Fausse";
        } else

            if (Affirmation1 == affirmation.mensonge && Conjonction == allconjonction.et && Affirmation2 == affirmation.mensonge) {
            return "Fausse";
        }



        /*   la conjonction 'ou' */

        else

            if (Affirmation1 == affirmation.vérité && Conjonction == allconjonction.ou && Affirmation2 == affirmation.vérité) {
            return "Vraie";
        } else

            if ((Affirmation1 == affirmation.vérité && Conjonction == allconjonction.ou && Affirmation2 == affirmation.mensonge)
                ||
            Affirmation1 == affirmation.mensonge && Conjonction == allconjonction.ou && Affirmation2 == affirmation.vérité) {
            return "Vraie";
        }
            else

                if (Affirmation1 == affirmation.mensonge && Conjonction == allconjonction.ou && Affirmation2 == affirmation.mensonge) {
            return "Fausse";
        }



        /*  conjonction 'Donc' */

        else
        if (Affirmation1 == affirmation.vérité && Conjonction == allconjonction.donc && Affirmation2 == affirmation.mensonge) {
            return "Fausse";
        } else
        if (Affirmation1 == affirmation.mensonge && Conjonction == allconjonction.donc && Affirmation2 == affirmation.vérité) {
            return "Vraie";
        } else
        if (Affirmation1 == affirmation.vérité && Conjonction == allconjonction.donc && Affirmation2 == affirmation.vérité) {
            return "Vraie";
        } else
        if (Affirmation1 == affirmation.mensonge && Conjonction == allconjonction.donc && Affirmation2 == affirmation.mensonge) {
            return "Vraie";
        } else return "jenesaispas";
    }



    /*
    calcul de trois affirmation */


    public String calculusAvecTroisAffirmations(String Affirmation1, String Conjonction1, String Affirmation2,

                                                String Conjonction2, String Affirmation3) {

        if (calculusDeuxAffirmations(Affirmation1, Conjonction1, Affirmation2) == "Vraie"
            || Conjonction2 == allconjonction.donc && Affirmation3 == affirmation.vérité) {
            return "Vraie";
        } else

        if (calculusDeuxAffirmations(Affirmation1, Conjonction1, Affirmation2) == "Vraie"
            || Conjonction2 == allconjonction.donc && Affirmation3 == affirmation.mensonge) {
            return "Fausse";
        } else

        if ((calculusDeuxAffirmations(Affirmation1, Conjonction1, Affirmation2) == "Fausse"
            || Conjonction2 == allconjonction.donc && Affirmation3 == affirmation.mensonge)) {
            return "Vraie";
        } else return "jenesaispas";
    }



    /*  deux affirmations non relié */

    public String calculusAvecDeuxAffirmationsNonConnecté (String Affirmation1, String Conjonction1, String Affirmation2,
                                                           String Conjonction2, String Affirmation3,String Affirmation4,
                                                           String Conjonction3, String Affirmation5) {
        String réponse1 = calculusAvecTroisAffirmations(Affirmation1, Conjonction1, Affirmation2, Conjonction2, Affirmation3);
        String réponse2 = calculusDeuxAffirmations(Affirmation4, Conjonction3, Affirmation5);

        return réponse1 + " et " + réponse2;
    }
}
