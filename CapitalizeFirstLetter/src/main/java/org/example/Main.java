package org.example;

public class Main {
    public static String toJadenCase(String phrase) {

        if(phrase == null  || phrase == "")
            return null;
        String output = "";
        String[] splitted = phrase.split(" ");
        for(String element: splitted){
            char letter = element.charAt(0);
            letter = Character.toUpperCase(letter);
            output += letter + element.substring(1)+ " ";
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println(toJadenCase("first Try[]"));
    }
}

