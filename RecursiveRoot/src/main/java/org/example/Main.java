package org.example;

public class Main {
    public static int digital_root(int n) {
        String[] digitsString = Integer.toString(n).split("");
        int[] digits = new int[digitsString.length];
        int sum = 0;
        if(digitsString.length > 1){
            int i = 0;
            for (String element :digitsString){
                int digit = Integer.parseInt(element);
                digits[i] = digit;
                i += 1;
            }
            for(int element: digits){
                sum += element;
            }
            if (sum > 9){
                digital_root(sum);
            }
            else{
                return sum;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(digital_root(16));
    }
}