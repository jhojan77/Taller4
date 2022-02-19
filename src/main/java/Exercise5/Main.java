
package Exercise5;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author jhojan hoyos
 */
public class Main {
    
       public static void main (String [] args) {        
        
       Scanner entrada = new Scanner(System.in);
       boolean salir = false;
       int option;
       
      
  
       /**
        * menu de opciones 
        */
       do {
           System.out.println("BIENVENIDO ..");
           System.out.println("A continuacion encontrara el menu de opciones");
           System.out.println("1: Agregar vehiculo");
           System.out.println("2: Mostrar lista de carros registrados");
           System.out.println("3: Mostrar lista de motos registrados");
           System.out.println("4: Mostrar lista de bicicletas registrados");
           System.out.println("5: Mostrar lista de camiones registrados:");
           System.out.println(" Si desea SALIR presione la opcion 6");
           
           
           try {
               System.out.println("Por favor, escoja la opcion de su preferencia:");
                   option = entrada.nextInt();
           
           /**
            * condicional para evaluar la opcion escogida por el usuario
            * Dependiendo el caso se ejecuta el metodo CREAR NAVE heredado de la clase NAVE
            */
           if (option <=6 ){
               switch(option){
               case 1:
                   System.out.println("Has seleccionado la opcion 1");
                   
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                  
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
                  
                   break;
                case 4:
                   System.out.println("Has seleccionado la opcion 4");
                   
                   break;
                case 5:
                   System.out.println("Has seleccionado la opcion 5");
                  
                   break;
                case 6:
                   salir=true;
                   break;
                 }
              }else {
               System.out.println("Digite una opcion valida entre 1-5 o pulse 6 para salir");
           }
           }
              catch (InputMismatchException e) {
                System.out.println("Debes insertar una opcion valida no alfanumerica");
                entrada.next();
       }
      }
           while (!salir);  
        
   }
}
        
        
       