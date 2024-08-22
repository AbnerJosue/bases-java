/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basesjava.Ejercicio_Practico;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Ejercicio_despensa {
    
        public void despensa(){
            
           double sueldo = 0;
           int categoria;
           
           System.out.println(" Ingrese el tipo de categoria que desea calcular el sueldo ");
           
           Scanner teclado = new Scanner (System.in);
           
           categoria = teclado.nextInt();
           
           if ( categoria == 1 ) {
            sueldo = 15890 + (15890 * 0.10);
           } else if ( categoria == 2) {
            sueldo = 25630.89;
           } else if ( categoria == 3) {
            sueldo = 35560.20 + (35560.20 * 0.11);
           } else {
               System.out.println("Debe ingresar un numero de categoria valida");
               return;
           }
            
           System.out.println("El sueldo de :" + categoria + "Es de :" + sueldo );
           
        }
    
}
