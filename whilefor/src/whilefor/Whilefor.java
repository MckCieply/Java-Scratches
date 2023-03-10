
package whilefor;
import java.util.Random;

public class Whilefor {
    public static void main(String[] args) {
        Random rand = new Random();
        int iloczyn = 1;
        //for(int i = 0; iloczyn < 10000; i++){
        //    int x = rand.nextInt(10);
        //    System.out.println("Wylosowane "+x);
        //    if(x%2 == 0 && x != 0){
        //        iloczyn = iloczyn * x;
        //        System.out.println("Iloczyn "+iloczyn);
        //    }
        while (iloczyn < 10000){
            int x = rand.nextInt(10);
            System.out.println("Wylosowane "+x);
            if(x%2 == 0 && x != 0){
                iloczyn = iloczyn * x;
                System.out.println("Iloczyn "+iloczyn);
      
            }
    }
    } 
}
