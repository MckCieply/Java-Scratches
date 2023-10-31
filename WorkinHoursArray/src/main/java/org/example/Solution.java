package org.example;

public class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int metTarget= 0;
        for (int employee: hours){
            if (employee >= target)
                metTarget++;
        }
        return metTarget;
    }
}
