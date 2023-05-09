package org.example;

public class Main {
    public static String rgb(int r, int g, int b) {
        StringBuilder output = new StringBuilder();
        for(int color: new int[]{r,g,b}) {
            if(color < 0)
                color = 0;
            else if(color > 255)
                color = 255;
            output.append(String.format("%02X", color));
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(rgb(255,255,255));
    }
}