
package rafpretify;
import java.io.*;
public class RAFPretify {

    public static void main(String[] args) throws IOException{
        RandomAccessFile raf = new RandomAccessFile("oldfile.txt", "r");
        String row;
        while( (row = raf.readLine()) != null){
            String[] elements = row.split(" +");
        }
        raf.close();
    }   
}
