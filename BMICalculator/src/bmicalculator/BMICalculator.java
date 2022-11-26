
package bmicalculator;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Input your height in meters: \n");
        float height = scann.nextFloat();
        
        System.out.print("Input your weight: \n");
        int weight = scann.nextInt();
        
        float bmi = weight / (height * height);
        
        System.out.print("Your BMI is equal to: " + bmi);
    }
    
}
