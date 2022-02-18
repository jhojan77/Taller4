package Exercise4;

import java.util.Scanner;

/**
 *
 * @author jhojan hoyos
 */
public class Util {
    
    /**
     * metodo para validar si el valor ingresado es numerico
     * @param msj
     * @return 
     */
    public static int obtenerEntero(String msj) {
        Scanner teclado = new Scanner(System.in);
        
        int numero  = 0;
        boolean esNumerico = false;
        
        do {
            System.out.println(msj);
            String numeroStr = teclado.next();
            try {
                numero = Integer.parseInt(numeroStr);
                esNumerico = true;
            } catch(NumberFormatException e) {
                System.out.println("El valor ingresado no es numerico");
            }
        } while(!esNumerico);
        return numero;
    }
    
}
