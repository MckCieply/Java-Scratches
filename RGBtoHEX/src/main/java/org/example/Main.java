package org.example;

public class Main {
    public static String rgb(int r, int g, int b) {
        String output = "";
        for(int element: new int[]{r,g,b}) {
            output += String.format("%02X", element);
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(rgb(255,255,255));
    }
}