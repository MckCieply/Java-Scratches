
package stringsagain;
import java.util.Scanner;

public class StringsAgain {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String input = scann.nextLine();
        int length = input.length();
        boolean flag = false;
        for(int i=0; i < length/2; i++){
            if(input.charAt(i) != input.charAt(length-1-i))
                flag = true;
        }
        if (flag == true)
            System.out.print("Slowo "+input+ " nie jest palindromem");
        else
            System.out.print("Slowo "+input+ " jest palindromem");
    }
    
}
