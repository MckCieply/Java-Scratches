
package chartable;
import java.io.*;
public class CharTable {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = null;
        RandomAccessFile raf = null;
        try{
            reader = new BufferedReader(new FileReader("dane.txt"));
            raf = new RandomAccessFile( "out.bin", "rw" );
            String row;
            while((row = reader.readLine()) != null){
                char x = row.charAt(0);
                raf.writeChar(x);
            }
        }
        finally{
            if (reader != null) reader.close();
            if (raf != null) raf.close();
            
        }
        RandomAccessFile raf1= null;
        try{
            raf1 = new RandomAccessFile("out.bin", "rw");
            while(true){
                System.out.println(raf1.readChar());
            }
        }
        catch(EOFException e){
            System.out.println("KONIEC PLIKU");
            if (raf1 != null){
                raf1.close();
            }
        }
        
    }
    
}
