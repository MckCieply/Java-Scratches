/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examin;
import java.io.*;
/**
 *
 * @author mwppl
 */
public class Examin {

    String[] tablica;
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public int czytaj(String plik)throws Exception{
        BufferedReader reader = new BufferedReader( new FileReader(plik));
        String row;
        int counter = 0;
        while((row = reader.readLine())!= null){
            counter +=1 ;
        }
        this.tablica = new String[counter];
        reader.close();
        BufferedReader reader2 = new BufferedReader( new FileReader(plik));
        counter = 0;
        while((row = reader2.readLine())!= null){
            this.tablica[0] = row;
            counter +=1 ;
        }
        reader2.close();
        return counter;
    }
    
    public boolean zamien(String obecny, String nowy){
        boolean flaga = false;
        for(int i=0;i<this.tablica.length; i++){
            String element = this.tablica[i];
            if(element.equals(obecny)){
                this.tablica[i] = nowy;
                flaga = true;
            }
        }
        return flaga;
    }
    public String[] rozszerz(String nowy){
        String[] nowatablica = new String[(this.tablica.length)+1];
        for(int i=0; i<this.tablica.length; i++){
            nowatablica[i] = this.tablica[i];
        }
        nowatablica[nowatablica.length -1] = nowy;
        return nowatablica;
    }
    public int srednia(){
        int wynik = 0;
        for(String element: this.tablica){
            wynik += element.length();
        }
        wynik /= this.tablica.length;
        return wynik;
    }
}
