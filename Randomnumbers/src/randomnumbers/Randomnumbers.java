// Calculating multipication result on random numbers
package randomnumbers;
import java.util.Random;
public class Randomnumbers {

    public static void main(String[] args) {
        Random rand = new Random();
        int result = 1;
        for(int i=0;result < 10000; i++){
            int x = rand.nextInt(100);
            if (x % 2 ==0 ){
                result *= x;
            }
        }
        System.out.println(result);
    }
    
}
