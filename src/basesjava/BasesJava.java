/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basesjava;

import basesjava.EjercicioDespensa.Ejercicio_despensa;
import basesjava.OperadorTernario.*;
/**
 *
 * @author josue
 */
public class BasesJava {

    public static void main(String[] args) {

        // // Declaracion de Instancias
        // // TIpoVariables variables = new TIpoVariables();
        
        // // Ejercicio1 ejercicio1 = new Ejercicio1();
        // // EjercicioSwitch ejercicioSwitch = new EjercicioSwitch();

        // // variables.variables();
        // // ejercicio1.numero();
        // // ejercicio.saludar();
        // // ejercicioSwitch.StructureOfSwitch();


        // // Llamando al método obtenerSaludo
        MetodosEjemplos ejercicio = new MetodosEjemplos();
       
        String saludo = ejercicio.obtenerSaludo("Josue");
        System.out.println(saludo);

        // // Llamando al método sumar
        int resultado2 = ejercicio.sumar(5, 7);
        System.out.println("Resultado de la suma: " + resultado2);

        // // desde otra carpeta

        Ejercicio_despensa ejercicio_despensa = new Ejercicio_despensa();
        ejercicio_despensa.despensa();

        // operador Ternario

        TernarioOperador ternario = new TernarioOperador(); 
        ternario.operador();


        // While 

        int contador = 0;

        while( contador <= 10) {

            System.out.println("Estoy en la vuelta: "+ contador);
            contador++;
        }


        // While infinitos con estructuras repetitivas

        boolean centinela = true;

        while( centinela == true) {
            System.out.println("Estoy en la vuelta: "+ centinela);
            centinela = false;
        }

        // Ciclo For 

        for( int cont = 0; cont <= 10; cont++){

            System.out.println("El valor es el siguiente " + cont);

        }


        // Declararion de Vectores 

        int vector [] = new int [4];
        // int vector []; sin asignar el tamaño

        // Asignaciond ( manual )
        vector[0] = 2; 
        vector[1] = 50; 
        vector[2] = 1223; 
        vector[3] = 44; 
        // vector[4] = 44;  Esto genera un error ya que no es del mismo tamaño Index 4 out of bounds for length 4

        System.out.println(vector);

        // Recorrido 

        for( int i = 0; i < vector.length; i ++ ){
            System.out.println(vector[i]);
        }

        // Matriz 

        int matriz [][] = new int [3][3];   // 3 filas , 3 columnas
        
        // matriz = [
        //         [0, 0, 0],  # Fila 0
        //         [0, 0, 0],  # Fila 1
        //         [0, 0, 0]   # Fila 2
        // ]

        // Asignacion Manual

        matriz[0][0] = 20;
        matriz[0][1] = 30;
        matriz[1][1] = 1900;
        matriz[1][2] = 50;


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
