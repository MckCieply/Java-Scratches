package writenreadfromfile;
import java.util.Scanner;
import java.io.*;
public class WritenReadfromFile {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        
        int[] input = new int[5];
        for(int i=0; i<=input.length;i++){
            System.out.print(">>>");
            int num = scann.nextInt();
            input[i] = num;
        }
    }
    
}
