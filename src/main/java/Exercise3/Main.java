
package Exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author jhojan hoyos
 */
public class Main {

    public static void main(String[] args) {
      Scanner entry = new Scanner(System.in);
      boolean salir = false;
      int option;
       
        do {
           System.out.println("BIENVENIDO ");
           System.out.println("A continuacion encontrara el menu de opciones");
           System.out.println("1. Generar numeros aleatorios:");
           System.out.println("2. Ordenar por Metodo quick sort");
           System.out.println("3. Ordenar por metodo de burbuja");
           System.out.println(" Si desea SALIR presione la opcion 4");
           
           
           try {
               System.out.println("Por favor, escoja la opcion de su preferencia:");
                   option = entry.nextInt();
           
           /**
            * condicional para evaluar la opcion escogida por el usuario
            * Dependiendo el caso se ejecuta el metodo para ordenar los numeros
            */
           if (option <=4 ){
               switch(option){
               case 1:
                   System.out.println("Has seleccionado la opcion 1");
                   System.out.println("A continuacion se creara el rango:");
                   System.out.println("Ingrese el valor inicial");
                   int min = entry.nextInt();
                    System.out.println("Ingrese el valor final");
                   int max = entry.nextInt();

                    String mathNumbers = IntStream.rangeClosed(min, max)
                            .mapToObj(i -> Integer.toString(Number.getIntMath(min, max)))
                            .collect(Collectors.joining(", "));
                    System.out.printf("Numeros:", mathNumbers);
                    
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   
                   break;
               case 3:
                   System.out.println("Has seleccionado la opcion 3");
                   
                   break;
                case 4:
                   salir=true;
                   break;
               }  
              }else {
               System.out.println("Digite una opcion valida entre 1-4 o pulse 5 para salir");
            }
          }
    
              catch (InputMismatchException e) {
                System.out.println("Debes insertar una opcion valida no alfanumerica");
               entry.next();
       }
      }
           while (!salir);  
        
   }
 }
  
