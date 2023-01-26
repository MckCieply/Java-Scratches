
package replacerafile;
import java.io.*;

public class ReplaceRAFile {

    public static void main(String[] args) throws IOException{
        RandomAccessFile raf = new RandomAccessFile("innit.txt","rw");
        int lookin = 0;
        boolean flag = false;
        while(true){
            try{
                String line = raf.readLine();
                String elements[] = line.split(" +");
                for(String element: elements){
                    try{
                        lookin = Integer.parseInt(element);
                        flag = true;
                        break;
                    }
                    catch(NumberFormatException e){
                        
                    }
                    if (flag == true)
                        break;
                }
            }
            catch(NullPointerException e){
                        break;
                    }
            }
        
        if (lookin != 0)
            System.out.print(lookin);
    }
    
}
