package org.example;

public class Main {
    public static String battle(String goodAmounts, String evilAmounts) {
        String[] good = goodAmounts.split(" ");
        String[] evil = evilAmounts.split(" ");
        int[] goodStrengths = {1, 2, 3, 3, 4, 10};
        int[] evilStrengths = {1, 2, 2, 2, 3, 5, 10};
        int goodStrength = calculateStrength(good, goodStrengths);
        int evilStrength = calculateStrength(evil, evilStrengths);
        if(goodStrength > evilStrength){
            return "Battle Result: Good triumphs over Evil";
        }
        else if(evilStrength > goodStrength){
            return "Battle Result: Evil eradicates all trace of Good";
        }
        else{
            return "Battle Result: No victor on this battle field";
        }
    }
    public static int calculateStrength(String[] forces, int[] power){
        int strength = 0;
        int i = 0;
        for(String element: forces){
            int amount = Integer.parseInt(element);
            strength += amount * power[i];
            i += 1;
        }
        return strength;
    }
    public static void main(String[] args) {

    }
}