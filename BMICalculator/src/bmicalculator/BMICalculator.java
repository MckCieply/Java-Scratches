
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
        System.out.println("Your BMI is equal to: " + bmi);
        
        if (bmi < 18.5){
            //Underweight
            System.out.println("Underweight");
        }
        
        if (bmi >= 18.5 && bmi < 25){
            //Normal
            System.out.println("Normal");
        }
        if(bmi >= 25 && bmi < 30){
            //Overweight
            System.out.println("Overweight");
        }
        if(bmi >= 30){
            //Obese
            System.out.println("Obese");
        }
    }
    
}
