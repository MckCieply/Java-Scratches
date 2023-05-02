/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam;
import java.io.*
/**
 *
 * @author mwppl
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
    }
    public static int funkcja(String nazwa1, String nazwa2) throws IOException{
        int counter = 0;
        BufferedReader reader = new BufferedReader(new FileReader(nazwa1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(nazwa2));
        String row;
        while((row = reader.readLine())!= null){
            String[] elements = row.split(" ");
            int size = elements.length;
            if(elements[size].equals("TAK")){
                counter +=1;
                String newrow = "";
                for(String element: elements){
                    if(element.equals("TAK")){
                    newrow+="NIE";
                    }
                    else{
                    newrow+=element;
                    }
                newrow+= " ";
                }
            writer.write(newrow);
            }
            else{
            writer.write(row+"\n");
            }
        }
        reader.close();
        writer.close();
        return counter;
    }
}
