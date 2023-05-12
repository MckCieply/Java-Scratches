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
        boolean scored = false;
        // Creating empty list to store all appearances of number that is being checked
        LinkedList<Integer> temp = new LinkedList<>();

        // Checking every number in list
        for(int i: template){
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
            if(temp.size() >= 3 && !scored) {
                found3 = true;
                scored = true;
                score += addScoreWhen3(temp.get(0));

                // Covering if there is more than 3 appearances
                if(temp.size() > 3){
                    for(int k = 0; k < temp.size() -3; k++){
                        score = addScoreWhen1(score, temp.get(0));
                    }
                }

            }
            // Restarting linked list if we haven't found 3
            if(!found3)
                temp = new LinkedList<>();

            // Checking for freestanding 5s n 1s and making sure there is not more than 2 of them
            if((i == 5 || i == 1) && !temp.contains(i)){
                if(i == 5) {
                    score =addScoreWhen1(score, 5);
                }
                if(i == 1){
                    score = addScoreWhen1(score, 1);
                }
            }
        }
        return score;
    }
    public static int addScoreWhen3(int num){
        if(num == 1)
            return num * 1000;
        else
            return num * 100;
    }
    public static int addScoreWhen1(int score, int num){
        if(num == 1)
            return score + 100;
        else
            return score + 50;
    }
    public static void main(String[] args) {
        System.out.println(greedy(new int[]{1,1,1,3,1}));
    }
}