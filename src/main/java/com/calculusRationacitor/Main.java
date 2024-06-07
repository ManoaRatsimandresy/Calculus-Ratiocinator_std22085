package com.calculusRationacitor;

public class Main {
    public static void main(String[] args) {

        CalculusRatiocinatorUse calculusRatiocinator = new CalculusRatiocinatorUse();

        String réponse1 = calculusRatiocinator.calculusDeuxAffirmations("Lou est pauvre.", "et", "Lou est généreux.");
        String réponse2 = calculusRatiocinator.calculusDeuxAffirmations("Lou est beau.", "Donc", "Lou est pauvre.");
        String réponse3 = calculusRatiocinator.calculusDeuxAffirmations("Lou est pauvre.", "et", "Lou est généreux.");
        String réponse4 = calculusRatiocinator.calculusAvecTroisAffirmations("Lou est beau.", "ou", "Lou est généreux.", "Donc", "Lou est pauvre.");
        String réponse5 = calculusRatiocinator.calculusAvecDeuxAffirmationsNonConnecté("Lou est beau.", "ou", "Lou est généreux.", "Donc",
                "Lou est pauvre.", "Lou est pauvre.","ou", "Lou est généreux.");


        System.out.println(réponse1);
        System.out.println(réponse2);
        System.out.println(réponse3);
        System.out.println(réponse4);
        System.out.println(réponse5);
    }
}