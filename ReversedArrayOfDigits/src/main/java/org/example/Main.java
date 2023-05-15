package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static int[] digitize(long n) {
        ArrayList<String> nums = new ArrayList<>();
        Collections.addAll(nums, Long.toString(n).split(""));
        Collections.reverse(nums);
        System.out.println(nums);

        int[] output = new int[nums.size()];
        for(String element: nums){
            int i = nums.indexOf(element);
            output[i] = Integer.parseInt(element);
        }
        return output;
    }

    public static void main(String[] args) {

        System.out.println(digitize(35231));
    }
}