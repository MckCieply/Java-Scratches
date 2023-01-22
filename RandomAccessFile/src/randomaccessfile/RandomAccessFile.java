
package randomaccessfile1;
import java.io.*;
public class RandomAccessFile1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("data.txt", "rw");
        for(float i=0; i<raf.length();i+=0.5){
            raf.writeFloat(i);
            System.out.print(i);  
        }
        raf.close();
    }
    
}
