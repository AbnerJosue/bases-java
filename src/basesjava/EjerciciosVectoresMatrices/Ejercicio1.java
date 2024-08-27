package basesjava.EjerciciosVectoresMatrices;
import java.util.Scanner;


public class Ejercicio1 {
    /* 

     Realizar un programa que permita cargar 15 numeros en un vector.
     Una vez cargados, se necestia que el programa cuente e informe por pantalla cuantas veces se cargo el numero 3

    */ 

    public void manyTimesRepited() {

        int numbers [] = new int [15];
        Scanner teclado = new Scanner(System.in);
    
        for( int i = 0 ; i < numbers.length; i++) {
            System.out.println("Ingrese el valor: " + i );
            numbers[i] = teclado.nextInt();
        }
        
        int counter = 0;

        for( int i = 0; i < numbers.length; i++) {
            
            if( numbers[ i ] == 3){
                counter++;
            }
        }

        System.out.println("En el vector el numeros 3 esta repetido: "+ counter);

    }



}
