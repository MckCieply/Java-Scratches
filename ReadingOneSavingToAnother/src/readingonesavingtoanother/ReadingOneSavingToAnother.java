// Reading from .txt file saving to raf file
package readingonesavingtoanother;
import java.io.*;
public class ReadingOneSavingToAnother {
    public static void fromTXTtoRAF()throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        RandomAccessFile raf = new RandomAccessFile("final.bin", "rw");
        String row;
        while( (row = reader.readLine()) != null){
            String[] elements = row.split(" +");
            int num = (Integer.parseInt(elements[3]))*2;
            elements[3] = Integer.toString(num);
            String output = "";
            for (String element: elements)
                output += (element+" ");
            raf.writeUTF(output);
        }
        reader.close();
        raf.close();
    }
    public static void readRAF() throws IOException{
        RandomAccessFile raf = null;
        try{
            raf = new RandomAccessFile("final.bin", "rw");
            while(true){
                System.out.print(raf.readUTF()+"\n");
            }
        }
        catch (EOFException e){
            if(raf != null)
                raf.close();
        }
        
    }
    public static void main(String[] args) throws IOException{
        fromTXTtoRAF();
        readRAF();
    }
    
}
