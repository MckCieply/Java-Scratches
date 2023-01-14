package writenreadfromfile;
import java.util.Scanner;
import java.io.*;
public class WritenReadfromFile {

    public static void main(String[] args) throws IOException {
        Scanner scann = new Scanner(System.in);
        
        int[] input = new int[5];
        for(int i=0; i<input.length;i++){
            System.out.print(">>>");
            int num = scann.nextInt();
            input[i] = num;
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
        for(int element:input){
            writer.write(element+"\n");
        }
        writer.close();
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        String row;
        int result = 0;
        while((row = reader.readLine()) != null){
            int temp = Integer.parseInt(row);
            result += temp;
        }
        reader.close();
        System.out.print("Wynik dodawania podanych liczb to: "+ result);
    }
    
}
