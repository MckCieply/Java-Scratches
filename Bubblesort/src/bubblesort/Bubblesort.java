
package bubblesort;
import java.util.Scanner;
import java.util.Random;
public class Bubblesort {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scann = new Scanner(System.in);
        System.out.println("Please input table length: ");
        int size = scann.nextInt();
        int array[] = new int[size];
        
        for (int i = 0; i < size; i++){
            array[i] = rand.nextInt(25);
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        
        for(int j= 0; j < size; j++){
            for (int i = 0; i < size - 1; i++){
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            System.out.print(array[i] + ", ");
            }
        System.out.println();
        }
    }
    
}
