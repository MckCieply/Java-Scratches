package org.example;

public class Main {
    public static String explode(String digits) {
        String[] digitsArray = digits.split("");
        String output = "";
        for(String element: digitsArray){
            int num = Integer.parseInt(element);
            for(int i = 0; i < num; i++){
                output += element;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println(explode("321"));
    }
}