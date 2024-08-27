package basesjava;

public class EjercicioNumeros {
    
  void numero() {
     
    int numero1 = 35;
    int numero2 = 20;
    int aux;
    
    System.out.println("----Antes------");        
    System.out.println("Num1" + numero1);        
    System.out.println("Num1" + numero2);
    
    aux = numero1;
    numero1 = numero2;
    numero2 = aux;

    System.out.println("----Despues------");
    System.out.println("Num1" + numero1);        
    System.out.println("Num1" + numero2);
  }

}
