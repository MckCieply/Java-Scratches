package org.example;

import java.util.LinkedList;

public class Main {
    public static int greedy(int[] dice) {
        // Creating LinkedList based on dice
        LinkedList<Integer> template = new LinkedList<>();
        for(int num: dice)
            template.add(num);

        int score = 0;
        boolean found3 = false;
        // Checking every number in list
        for(int i: template){
            // Creating empty list to store all appearances of number that is being checked
            LinkedList<Integer> temp = new LinkedList<>();
            // In 5 throws we can have only once 3 same digits
            if(!found3){
                // checking list again for all digits equal to i
                for (int j : template) {
                    if (j == i) {
                        temp.add(j);
                    }
                }
            }
            // Checking if we got 3 appearances
            if(temp.size() >= 3) {
                found3 = true;
            }
            // Checking for freestanding 5s n 1s and making sure there is not more than 2 of them
            if((i == 5 || i == 1) && !temp.contains(i)){
                if(i == 5) {
                    score += 50;
                }
                if(i == 1){
                    score += 100;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(greedy(new int[]{1,2,5,1,1}));
    }
}