package basesjava.OperadorTernario;

import java.util.Scanner;

/**
 * ternario
 */
public class TernarioOperador {

    public void operador(){

        double promedio; 
        String condicionalFinal;

        Scanner teclado = new Scanner( System.in );
        System.out.println("Ingrese el promedio general del alumno en TodoCode");

        promedio = teclado.nextDouble();

        condicionalFinal = ( promedio >= 6 ) ? "Si aprobo el curso": "No aprobo el curso" ;


        System.out.println("El estudiante " + condicionalFinal);

    }

}