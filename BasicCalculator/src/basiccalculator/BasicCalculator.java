// Basic Calculator, housing +/-/*/:

package basiccalculator;
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        // Reading from console a and b
        System.out.print("Input an a: ");
        int a = scann.nextInt();
        
        System.out.print("\n Input b: ");
        int b = scann.nextInt();
        
        int addition, subtraction, multiplication, division;
        
        addition = a + b;
        subtraction = a - b;
        multiplication = a * b;
        division = a / b;
        
        System.out.print("\n a + b = " + addition + "\n a - b = " + subtraction + "\n a * b = " + multiplication + "\n a / b = " + division + "\n");
    }
    
}
