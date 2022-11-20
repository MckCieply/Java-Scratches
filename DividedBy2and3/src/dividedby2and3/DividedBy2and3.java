
package dividedby2and3;
import java.util.Scanner;
public class DividedBy2and3 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Please enter table range: ");
        int size = scann.nextInt();
        int table[] = new int[size];
        for(int i = 0; i < table.length; i++){
            boolean by3 = false;
            boolean by2 = false;
            table[i] = i + 1;
            if(table[i] % 3 == 0){
                by3 = true;
                }
            if (table[i] % 2 == 0){
                by2 = true;
            }
            if (by2 == true && by3 == true){
                System.out.println("Liczba " +table[i]+ " jest podzielna przez 2 i 3");
            }
            else if(by2 == true || by3 == true){
                System.out.println("Liczba " +table[i]+ " jest podzielna przez 2 lub 3");
        }
        }
    }
    
}
