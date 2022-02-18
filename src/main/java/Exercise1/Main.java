
package Exercise1;


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
            System.out.println("2. Calcular fuerza gravitatoria:");
            System.out.println("Ingrese 3 u otro valor para finalizar.");
            System.out.println("Introduzca su respuesta: ");
            Scanner answer = new Scanner(System.in);
            String inputKeyboard = answer.nextLine();

             if (isNumeric(String.valueOf(inputKeyboard))) {
                 int ship = Integer.parseInt(String.valueOf(inputKeyboard));
                    
              if (ship == 1) {
                    System.out.println( "Id" + "    " + "Nombre");
                       for(PlanetarySystem ps : planet.getPlanetList()){
                       System.out.println(ps.showPlanet());
                }
                System.out.println("\n");
                menu(planet);

            } else if (ship == 2) {
                System.out.println( "Id" + "    " + "Nombre" + "       " + "Masa" + "       " + 
                               "Densidad" + "        " + "Diametro" + "     " + "Distancia al sol");
                for(PlanetarySystem ps : planet.getPlanetList()){
                    System.out.println(ps.show());
                }
                System.out.println("Digite el id del planeta #1: ");
                    int idP1 = answer.nextInt();
                System.out.println("Digite el id del planeta #2: ");
                    int idP2 = answer.nextInt();
                
                PlanetarySystem p1 = planet.fingPlanetaForID(idP1);
                PlanetarySystem p2 = planet.fingPlanetaForID(idP2);
                    
                if(p1 == null || p2 == null) {
                    System.out.println("Uno de los id del planeta es incorrecto");
                } else {
                    double fg = planet.calculateAttractionGravitational(p1, p2);
                    System.out.println("La fuerza gravitacional entre " + p1.getName() + " y " + p2.getName() + "es: " + fg);
                }
                System.out.println("\n");
                menu(planet);
                
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
   
    



    
