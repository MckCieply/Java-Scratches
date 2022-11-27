package multidimarray;
import java.util.Scanner;
public class Multidimarray {
    static void printTable(int rows, int mainArray[][]){
        //Wypisywanie tablicy do konsoli
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < mainArray[i].length; j++){
                System.out.print(mainArray[i][j]+ " ");
            }
        System.out.println();
        }
    }

    static void fillTable(int rows, int mainArray[][]){
        //Wypelnianie tablicy indeksami komorki
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < mainArray[i].length; j++){
                mainArray[i][j] = j;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Please input how much rows?: ");
        int rows = scann.nextInt();
        System.out.println("------------------");
        int mainArray[][] = new int[rows][];
        
        
        // if okresla czy jest parzysta czy nieparzysta ilosc wierszy,
        // jesli parzysta to powstaja dwa srodkowe wiersze tak samo dlugie
        // jesli niepatrzysta to srodkowy wiersz jest tylko jeden
        int middle;
        int temp; 
        if (rows % 2 == 0){
            middle = rows/2;
            temp = middle + 1;
        }
        else{
            middle = rows/2 +1;
            temp = middle;
        }
        // tworzenie kolumn dla i-tego wiersza, do wiersza srodkowego
        for(int i = 0; i < middle; i++){
            mainArray[i] = new int[i+1];    
        }
        // tworzenie kolumn dla i-tych wierszy, od wiersza srodkowego
        // temp slzy do przechowywania liczby kolumn
        for(int i = middle; i < rows; i++){
            mainArray[i] = new int[temp-1]; 
            temp--;
        }
        fillTable(rows, mainArray);
        printTable(rows, mainArray);
    }
    
}
