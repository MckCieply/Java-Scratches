package org.example;

public class Main {
    public static boolean getXO (String str) {
        String[] chars = str.split("");
        int x = 0;
        int o = 0;
        for (String element: chars){
            if(element.equalsIgnoreCase("x")){
                x += 1;
            }
            if(element.equalsIgnoreCase("o")){
                o += 1;
            }
        }
        return x == o;
    }
    public static void main(String[] args) {

        System.out.println(getXO("axo"));
    }
}