/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basesjava;

// importar desde otra carpeta 
import basesjava.Ejercicio_Practico.Ejercicio_despensa;
import basesjava.OperadorTernario.*;
/**
 *
 * @author josue
 */
public class BasesJava {

    public static void main(String[] args) {

        // Declaracion de Instancias
        // TIpoVariables variables = new TIpoVariables();
        
        // Ejercicio1 ejercicio1 = new Ejercicio1();
        // EjercicioSwitch ejercicioSwitch = new EjercicioSwitch();

        // variables.variables();
        // ejercicio1.numero();
        // ejercicio.saludar();
        // ejercicioSwitch.StructureOfSwitch();


        // Llamando al método obtenerSaludo
        Ejercicio ejercicio = new Ejercicio();
       
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

        


    }

}
