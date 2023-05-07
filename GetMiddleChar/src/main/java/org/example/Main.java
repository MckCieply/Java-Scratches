package org.example;

import java.util.List;
public class Main {
    public static String getMiddle(String word) {
        List<String> chars = List.of(word.split(""));
        if(chars.size() % 2 == 0){
            String result = "";
            result += chars.get(chars.size()/2 - 1) + chars.get(chars.size()/2);
            return result;
        }
        else{
            return chars.get(chars.size() / 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(getMiddle("middle"));
    }
}