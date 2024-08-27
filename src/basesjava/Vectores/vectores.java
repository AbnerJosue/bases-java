package basesjava.Vectores;

import java.util.Scanner;

public class vectores {
    void vectores () {
       
        int vector [] = new int [ 4 ];

        
        Scanner teclado = new Scanner(System.in);


        for( int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor: " + i);
            vector[i] = teclado.nextInt();
        }


        for(int i= 0; i< vector.length; i++) {
            System.out.println("Estoy en el indice " + i);
            System.out.println("Tengo guardado un  " + vector[i]);
            System.out.println("----------------------");
        }



    }
}   
