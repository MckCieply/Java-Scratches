package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static boolean isAnagram(String test, String original) {
            original = original.toLowerCase();
            test = test.toLowerCase();
            ArrayList<String> originalChars = new ArrayList<>(Arrays.asList(original.split("")));
            ArrayList<String> testChars = new ArrayList<>(Arrays.asList(test.split("")));
            Collections.sort(originalChars);
            Collections.sort(testChars);
        return originalChars.equals(testChars);
    }
    public static void main(String[] args) {

        System.out.println(isAnagram("toffee", "foefets"));
    }
}