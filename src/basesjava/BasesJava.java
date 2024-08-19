/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basesjava;
import basesjava.Ejercicio;
/**
 *
 * @author josue
 */
public class BasesJava {

    public static void main(String[] args) {
        // Tipos de variables
        int numero =  20;
        String nombre = "Libra";
        char letra = 'a';
        double temperatura = 20.30;
        Boolean siONo = false;
        long largo = 1234324;

        System.out.println(numero);
        System.out.println(nombre);
        System.out.println(letra);
        System.out.println(temperatura);
        System.out.println(siONo);        
        System.out.println(largo);
        
        // Tipos de Numericos
           
        int num1, num2, resultado;
        
        num1 = 5;
        
        num2 = 10;
        
        resultado = num1 + num2;
        
        System.out.println("El resultado es " + resultado );
        
        
        // CONDICIONALES
        
        if( num1 > num2 ){
            System.out.println(" Num1 es mayor num2");
        } else {
            System.out.println("No es");
        }
        
        
        Ejercicio ejercicio = new Ejercicio();

        // Llamando al método saludar
        ejercicio.saludar();

        // Llamando al método sumar
        int resultado2 = ejercicio.sumar(5, 7);
        System.out.println("Resultado de la suma: " + resultado2);

        // Llamando al método obtenerSaludo
        String saludo = ejercicio.obtenerSaludo("Josue");
        System.out.println(saludo); 
        
        
    }
    
}
