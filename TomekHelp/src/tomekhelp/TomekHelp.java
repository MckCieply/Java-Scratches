/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tomekhelp;

import java.io.*;
public class TomekHelp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
            
                String [] nazwiska = {"Tomasz", "Jest", "Debilem", "Ale", "Co", "My", "Bez", "Niego", "Zrobimy"};
                String aux;
                int size;
                size = nazwiska.length;
                
                
                for( int nr1 = 0; nr1 < size - 1; nr1++ )
                    for( int nr2 = nr1 + 1; nr2 < size; nr2++ )
                        if( nazwiska[ nr2 ].compareTo( nazwiska[ nr1 ] ) < 0 ){
                            aux = nazwiska[ nr1 ];
                            nazwiska[ nr1 ] = nazwiska[ nr2 ];
                            nazwiska[ nr2 ] = aux;
                        }
                
                
                
                for( int nr1 = 0; nr1 < nazwiska.length; nr1++ )
                System.out.println( nazwiska[ nr1 ] + " " );
                
                
            }
    }
    

