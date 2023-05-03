package org.example;

public class Main {
    public static boolean solution(String str, String ending) {
        int strLength = str.length();
        int endingLength = ending.length();
        if (strLength >= endingLength) {
            String actuallEnding = str.substring(strLength - endingLength, strLength);
            if (actuallEnding.equals(ending))
                return true;
        }
            return false;
    }
    public static void main(String[] args) {
        System.out.print(solution("Input", "ut"));
    }
}