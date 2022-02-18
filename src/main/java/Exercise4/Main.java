
package Exercise4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jhojan hoyos
 */
public class Main {

   
        static ArrayList <Vehicle> vehi = new ArrayList <Vehicle> () ;
        static Scanner entrada = new Scanner(System.in);
        static Scanner Leer = new Scanner (System.in) ; 
        static Scanner Leer0 = new Scanner (System.in) ;    
        static String NameBossTripulation, NameTypeVehicle,  OwnerVecicles, registrationvehicles, routeDestination ; 
        static int idOperation ;
        
        public static void main (String [] args) {        

              System.out.println("*----------Bienvenido-----------*");
              System.out.println("|--------------al---------------|");
              System.out.println("*-----------programa------------*");
              int menu=0;
              
              
               do{
                  System.out.println("+----------Menu del programa-----------+");
                  System.out.println("|--------Seleccione una opción---------|");
                  System.out.println("|--------------------------------------|");
                  System.out.println("|     1-Vehiculos                      |");                    
                  System.out.println("|     2-Salir                          |");
                  System.out.println("+--------------------------------------+");                         
                
                  menu= Util.obtenerEntero("|Digite la opcion:|\n");
                  System.out.println();
                
                  switch(menu){

                    case 1:                    
                         int submenu; // ssmc = SeleccionSubMenuCliente
                             
                            do{ 
                             System.out.println("|----------- Menu Vehiculos -----------|");
                             System.out.println("|--------Seleccione una opción---------|");
                             System.out.println("+--------------------------------------+");
                             System.out.println("|    1-Agregar Vehiculo                 |");  
                             System.out.println("|    2-Mostrar Vehiculos registrados   |");                    
                             System.out.println("|- - - - - - - - - - - - - - - - - - - |"); 
                             System.out.println("|    3-Regresar al menu                |");
                             System.out.println("+--------------------------------------+");
                                            
                             submenu=Util.obtenerEntero("|Digite la opcion:|\n");
                             System.out.println();
                             
                             
                             while(submenu < 1 || submenu > 3);
                              switch(submenu){ 

                                 case 1:                                 
                                     ingresar(); 
                                     break;          
                                 case 2:
                                     System.out.println();
                                     System.out.println("Los vehiculos registrados son:");
                                     mostrar();
                                     System.out.println();
                                     break;

                                 case 3:
                                     System.out.println("A regresado al menu:");
                                     System.out.println();
                                     System.out.println();
                                     break;
                                 default:                                
                                      System.out.println("¡ La selección no es valida !");     
                                      System.out.println("! Ingrese una opción que se encuentre en el sub menu: !");
                                      System.out.println();
                                      System.out.println();                                 
                             }
                         } while(submenu!=3);           

                       break;
                    case 2:
                        System.out.println("Usted a salido del programa");
                        break;
                    default:
                        System.out.println("¡ La selección no es valida !");     
                        System.out.println("! Ingrese una opción que se encuentre en el menu: !");
                        
                } 
                 
            } while(menu!=2);
        }  
        
        /**
         * metodo para pedir los datos  y guardarlos
         */
        private static void ingresar() {
            int a=-1;
                idOperation=Util.obtenerEntero("Digite el ID de transporte:");
                    for(int i=0;i<vehi.size();i++){
                        if(idOperation==vehi.get(i).getid()){
                        a=0;
                     }            
                   }if(a==-1){
                System.out.println (" Digite nombre del jefe del ferry: ") ;
                    NameBossTripulation = Leer.next () ;
                System.out.println (" Digite el typo de vehiculo a transportar : ") ;
                    NameTypeVehicle = Leer0.next () ;
                System.out.println (" Digite el nombre del propietario del vehiculo: ") ;
                    OwnerVecicles = Leer0.next () ;
                System.out.println (" Digite la matricula del vehiculo: ") ;
                    registrationvehicles = Leer0.next () ;
                System.out.println (" Digite la ruta de destino : ") ;
                    routeDestination = Leer0.next () ;

                System.out.println(" Se ha realizado el registro correctamente ");            
                Vehicle ve = new Vehicle (NameBossTripulation,NameTypeVehicle,
                        OwnerVecicles,registrationvehicles,routeDestination,idOperation) ;
                vehi.add (ve) ;
                }else{
                System.out.println(" El id esta repetido ") ;
                ingresar();
               }
            }
        
        /**
         * metodo para listar los datos ingresados
         */
        private static void mostrar() {
            System.out.println("Id transporte " +  "      "  +
                    " Nombre de jefe tripulacion " + " " +  " Tipo-vehiculo " + "      " + 
                       "propietario-vehiculo" + "      " + " placa-vehiculo " + "      " + "ruta/destino");
                        for(int i=0;i<vehi.size();i++){
                         System.out.println(vehi.get(i).getid()+"\t"+vehi.get(i).getNameBoss()+
                            vehi.get(i).getTypeVehicle()+"\t"+vehi.get(i).getOwnerVecicle()+
                             "\t"+vehi.get(i).getregistrationvehicle()+"\t"+vehi.get(i).getrouteDestination());
           }
        }
     }
   
    

