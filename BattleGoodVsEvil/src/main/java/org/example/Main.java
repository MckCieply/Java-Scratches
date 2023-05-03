package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String battle(String goodAmounts, String evilAmounts) {
        String[] good = goodAmounts.split(" ");
        String[] evil = evilAmounts.split(" ");
        int[] goodStrengths = {1, 2, 3, 3, 4, 10};
        int[] evilStrengths = {1, 2, 2, 2, 3, 5, 10};
        int goodStrength = 0;
        int evilStrength = 0;
        for(String element: good){
            int strength = Integer.parseInt(element);

        }
        return "";
    }
    public static void main(String[] args) {

    }
}