
package fromtxttoraf;
import java.io.*;
public class FromTXTtoRAF {
    public static int change(String file) throws IOException{
        RandomAccessFile raf = null;
        int changes = 0;
        try{
            raf = new RandomAccessFile(file, "rw");
            while (true){
                String data = raf.readUTF();
                String[] splited = data.split(" +");
                String title = "";
                for(int i = 2; i < splited.length-2;i++){
                    title = title + splited[i]+" ";
                }
                double cost = Double.parseDouble(splited[splited.length-1]);
                cost *= 1.25;
                if(splited[1].charAt(0) > (char)'a' && splited[1].charAt(0) > (char)'z'){
                    changes += 1;
                }
                raf.writeUTF(splited[0] +" "+ splited[1] +" "+ title + splited[splited.length-2] + " " + cost + "\n");
            }
        }
        catch(EOFException e){
            if(raf != null)
                raf.close();
        }
        return changes;
    }
    public static void main(String[] args) throws IOException{
        RandomAccessFile raf = new RandomAccessFile("output.bin", "rw");
        BufferedReader reader = new BufferedReader (new FileReader("Dane.txt"));
        String row;
        while((row = reader.readLine()) != null){
            raf.writeUTF(row);
        }
        raf.close();
        reader.close();
        int changes = change("output.bin");
        RandomAccessFile raf2 = null;
        try{
            raf2 = new RandomAccessFile("output.bin", "rw");
            while(true){
                System.out.print(raf2.readUTF());
            }
        }
        catch(EOFException e){
            if (raf2 != null)
                raf2.close();
        }
        System.out.print(changes);
    }
    
}
