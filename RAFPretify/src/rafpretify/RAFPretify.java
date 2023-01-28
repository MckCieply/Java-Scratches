
package rafpretify;
import java.io.*;
public class RAFPretify {

    public static void main(String[] args) throws IOException{
        RandomAccessFile raf = new RandomAccessFile("oldfile.txt", "r");
        BufferedWriter writer = new BufferedWriter(new FileWriter("newfile.txt"));
        String row;
        int counter = 0;
        while( (row = raf.readLine()) != null){
            String[] elements = row.trim().split(" +");
            for(String element:elements){
                if (counter != 4){
                    writer.write(element.trim()+ " ");
                    counter += 1;
                }
                else{
                    writer.write("\n"+element.trim()+ " ");
                    counter = 1;
                }
            } 
        }
        raf.close();
        writer.close();
    }   
}
