
package writetofile;
import java.io.*;

public class WriteToFile {

    public static void main(String[] args) throws IOException{
        int[] data = {12,48,35,19,102,315,9};
        BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
        for(int element:data){
            try{
                    writer.write(element +"\n");
            }
            finally{
            }
        }
        writer.close();
        String row;
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        try{
            while ((row = reader.readLine()) != null){
                System.out.print(row +"\n");
            }
        }
        finally{
            reader.close();
        }
    }
    
}
