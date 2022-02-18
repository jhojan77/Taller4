
package Exercise3;
/**
 * clase numeros 
 * @author jhojan hoyos
 */
public class Number {
     
    /**
     * Metodo burbuja para ordenar de manera descendente los numeros aleatorios generados
     * @param arrayRandom
     * @return 
     */
    public static int[] orderBurbuja(int[] arrayRandom) {
        for (int i = 1; i < arrayRandom.length; i++) {
            for (int j = 0; j < arrayRandom.length - i; j++) {
                if (arrayRandom[j] > arrayRandom[j + 1]) {
                   int aux = arrayRandom[j];
                     arrayRandom[j] = arrayRandom[j + 1];
                       arrayRandom[j + 1] = aux;
                }
            }
        }
        return arrayRandom;
   }
    
    /***
     * Metodo+quick sort para ordenar de manera descendente los numeros aleatorios generados
     * @param arrayRandom
     * @param izq
     * @param der
     * @return 
     */
    public static int[] orderQuickSort(int[] arrayRandom, int izq, int der) {

        int pivote=arrayRandom[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i < j){                          // mientras no se crucen las búsquedas                                   
           while(arrayRandom[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
             while(arrayRandom[j] > pivote) j--;           // busca elemento menor que pivote
                if (i < j) {                        // si no se han cruzado                      
                    aux= arrayRandom[i];                      // los intercambia
                    arrayRandom[i]=arrayRandom[j];
                    arrayRandom[j]=aux;
            }
         }

         arrayRandom[izq]=arrayRandom[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
         arrayRandom[j]=pivote;      // los menores a su izquierda y los mayores a su derecha

         if(izq < j-1)
            orderQuickSort(arrayRandom,izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
            orderQuickSort(arrayRandom,j+1,der);          // ordenamos subarray derecho

        return arrayRandom;
        
      }
        
    }
        
