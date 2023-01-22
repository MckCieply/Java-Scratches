package bubblesortwithfiles;
import java.io.*;
public class BubbleSortWithFiles {
    public static void sort(int[] tab){
        for(int i: tab){
            for(int j = 1; j<tab.length;j++){
                if(tab[j] < tab[j-1]){
                    int temp = tab[j];
                    tab[j] = tab[j-1];
                    tab[j-1] = temp;
                } 
            }
        }
    }
    public static void main(String[] args) throws IOException{
        int[] tab = new int[6];
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        String row;
        int num;
        int counter = 0;
        while((row = reader.readLine())!= null){
            num = Integer.parseInt(row);
            tab[counter] = num;
            counter += 1;
        }
        reader.close();
        System.out.print("Przed sortowaniem:\n");
        for(int i =0; i<tab.length;i++)
            System.out.print(tab[i]+ " ");
        sort(tab);
        System.out.print("\nPo sortowaniu: \n");
        for(int i:tab)
            System.out.print(i + " ");
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("dataDone.txt"));
        for(int i:tab)
            writer.write(i + "\n");
        writer.close();
    }
    
}
