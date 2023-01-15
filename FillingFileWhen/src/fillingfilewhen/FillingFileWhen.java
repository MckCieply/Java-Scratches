
package fillingfilewhen;
import java.util.Random;
import java.io.*;
public class FillingFileWhen {

    public static void main(String[] args) throws IOException {
        int num = 0;
        Random rand = new Random();

    BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
    int counter = 0;
    while (counter < 300){
        num = rand.nextInt(300);
        if (num % 13 == 0){
            writer.write(num + "\n");
            counter += 1;
        }
    }
    writer.close();
    BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
    String row;
    while((row = reader.readLine())!= null){
        System.out.print(row +" "+ (Integer.parseInt(row) % 13)+"\n");
    }
    reader.close();
    }
    
}
