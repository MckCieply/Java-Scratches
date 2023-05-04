package org.example;

public class Main {
    public static String whoLikesIt(String... names) {
        if(names.length == 0)
            return "no one likes this";
        else if(names.length <= 4){
            String output = "";
            for(String name: names){
                output += name + " ";
            }
            if(names.length == 1)
                output += "like it";
            else
                output += "likes it";
            return output;
        }
        else if(names.length > 4){
            String output = "";
            for(String name: names){
                output += name + " ";
            }

        }

        return "";
    }
    public static void main(String[] args) {
        whoLikesIt("Max", "John", "Mark");
        System.out.println("Hello world!");
    }
}