
package Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jhojan hoyos
 */
public class Main {

    
    public static void main(String[] args) {
        System.out.println("***¡Bienvenido...***");
        Planets planet = new Planets();
        planet.listPlanet();
        menu(planet);
       
    }
    public static boolean isNumeric(String answer) {

        boolean result;

        try {
            Integer.parseInt(answer);
            result = true;
        } catch (NumberFormatException excepcion) {
            result = false;
        }

        return result;
    }

    public static void menu(Planets planet) {

        System.out.println("#### ¿Que acción quieres realizar? ###");

        System.out.println("1. Mostrar lista de planetas.");
        System.out.println("2. calcular fuerza gravitatoria:");
        System.out.println("Ingrese 3 u otro valor para finalizar.");
        System.out.println("Introduzca su respuesta: ");
        Scanner answer = new Scanner(System.in);
        String inputKeyboard = answer.nextLine();

             if (isNumeric(String.valueOf(inputKeyboard))) {

            int ship = Integer.parseInt(String.valueOf(inputKeyboard));

                 if (ship == 1) {
                     System.out.println( "Id" + "    " + "Nombre" + "       " + "Masa" + "       " + 
                               "Densidad" + "        " + "Diametro" + "     " +"Distancia al sol");
                    for(PlanetarySystem ps : planet.getPlanetList()){
                    System.out.println(ps.show());
                }
                System.out.println("\n");
                        
                menu(planet);

            } else if (ship == 2) {

               System.out.println("Digite el planeta #1: ");
                String planet1 = answer.nextLine();
                   if(isNumeric(planet1)){
                    ArrayList<PlanetarySystem> listPlanet = planet.filterplanet(planet1);
                    if(listPlanet.size() == 9) {
                        System.out.println("No existe planeta");
                    } else {
                        for(PlanetarySystem ps :  listPlanet) {
                            System.out.println(ps.show());
                        }
                        System.out.println("Digite el planeta #2: ");
                         String planet2 = answer.nextLine();
                    }
                    System.out.println("\n");
                    menu(planet);

                    }else{
                    System.out.println("Lo siento, no puede ingresar texto");
                    System.out.println("\n");
                    menu(planet);
                }
             
                } else {
                System.out.println("El programa ha finalizado, Valor ingresado -> " + ship);
                System.out.println("\n");
              }


            } else {
            System.out.println("Lo siento, el valor ingresado no es correcto");
            System.out.println("\n");
            menu(planet);
         }

       }
    
    
    }
   
    



    
