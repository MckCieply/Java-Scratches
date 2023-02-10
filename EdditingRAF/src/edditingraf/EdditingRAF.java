
package edditingraf;
import java.io.*;
public class EdditingRAF {
    public static double[] readRAF() throws IOException{
        double[] results = new double[21];
        RandomAccessFile raf = null;
        try{
        raf = new RandomAccessFile("plik.bin", "r");
        int i = 0;
        while( i < 21){
            results[i] = raf.readDouble();
            i+=1;
        }
        }
        catch(EOFException e){
            if(raf != null)
                raf.close();
        }
        return results;
    }
    public static void writeRAF1() throws IOException{
        RandomAccessFile raf = new RandomAccessFile("plik.bin", "rw");
        for (double i=0; i <= 10; i+=0.5){
            raf.writeDouble(i);
        }
        raf.close();
    }
    public static void change(double[] before) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("plik.bin", "rw");
        for(double element: before){
            if((int) element == element){
                element /= 2;
            }
            raf.writeDouble(element);
        }
        raf.close();
    }      
    public static void main(String[] args) throws IOException {
        writeRAF1();
        System.out.println("Before change: ");
        double[] results = readRAF();
        for(double element: results)
            System.out.print(element+ " ");
        System.out.println("\nAfter change: ");
        change( results );
        double[] finaled = readRAF();
        for(double element: finaled)
            System.out.print(element+ " ");
    }
    
}
