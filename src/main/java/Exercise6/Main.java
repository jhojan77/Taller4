
package Exercise6;


import java.util.Scanner;

/**
 *
 * @author jhojan hoyos
 */
public class Main {

    public static void main(String[] args) {
        
        boolean encontro = false;
        Vector vector = new Vector();
        Scanner teclado = new Scanner(System.in);
        do {

            System.out.println("Digite un numero: ");
            int numero = teclado.nextInt();
            encontro = vector.fingElement(numero);
            if(!encontro)
                vector.addElement(numero);
            else {
                System.out.println("Los numeros ingresados son:");
                for(int i=0;i<vector.size(); i++) {
                    System.out.print(+ vector.getElemento(i) + ",");
                }
            }

        } while(!encontro);
       
   }
}
   
    
