
package Exercise3;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author jhojan hoyos
 */
public class Main {

        public static void main(String[] args) {
            /**
             * objeto para crear numeros aleatorios
             */
            Random r = new Random();
            int random = r.nextInt(20) + 1; // Guardamos un numero aleatorio de datos 1 al 20
            int arrayRandom [] = new int [random];  //Asignamos tamaño al array con dicho numero aleatorio  
            
            
            
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
                       System.out.print("El array contara con: " + random + " posiciones.\n");
                       System.out.println("\nLos valores del array son: ");
                        for (int i = 0; i < arrayRandom.length; i++) {
                              arrayRandom[i] = r.nextInt(100) + 1; //Asignamos a cada posición del array un numero aleatorio del 1 al 100
                              System.out.println(arrayRandom[i]);
                        }
                        break;
                        
                   case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        int[] arrayOrderQuickSort = Number.orderQuickSort(arrayRandom, 0, arrayRandom.length - 1);
                        System.out.println("\nMetodo Quick Sort...:");
                        System.out.println("\nLos valores del array ordenados son:"); 
                        
                        for(int i = 0; i < arrayOrderQuickSort.length;i++)
                            System.out.println(arrayOrderQuickSort[i]);
                       break;
                       
                   case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        int[] arrayOrderBurbuja = Number.orderBurbuja(arrayRandom);
                            System.out.println("\nMetodo Burbuja...:");
                            System.out.println("\nLos valores del array ordenados son:");          
                        for(int i = 0; i < arrayOrderBurbuja.length; i++) {
                            System.out.println(arrayOrderBurbuja[i]);
                        }

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


    

        
  
