
package Exercise5;

/**
 *
 * @author jhojan hoyos
 */
public abstract class Vehicle {
        
        // Atributos:
 /**
 * nombre del jefe de la tripulaicon del ferry
 */
    private String NameBoss ;
 /**
 * tipo de vhiculo a transportar
 */
    private String TypeVehicle ; 
 /**
 * propietario de vehiculo a transpostar
 */
    private String OwnerVecicle ;
 /**
 * hace referencia a la matricula del vehiculo
 */
    private String registrationvehicle ;
 /**
 * hace referencia al destino final del viaje
 */
    private String routeDestination; 
 /**
 *identificador de transporte
 */
    private int id ;

    // Construtor con parametros:

    public Vehicle (String NameBoss, String TypeVehicle , String OwnerVecicle, String registrationvehicle, String routeDestination, int id) {
        this.NameBoss = NameBoss ;    
        this.TypeVehicle = TypeVehicle ;
        this.OwnerVecicle = OwnerVecicle ;
        this.registrationvehicle = registrationvehicle ;
        this.routeDestination = routeDestination ;
        this.id = id ;
    }

    // Constructor sin Parametros:

    public Vehicle(){
       this.NameBoss = "" ;
       this.TypeVehicle = "" ;
       this.OwnerVecicle = "" ;
       this.registrationvehicle = "" ;
       this.routeDestination = "" ;
       this.id = 0 ;
    } 

    
    // Metodos set y get:      

    public String getNameBoss () {
        return NameBoss ;
    }

    public void setNameBoss (String NameBoss) {
        this.NameBoss = NameBoss ;
    }

   public String getTypeVehicle () {
        return TypeVehicle;
   }

   public void setTypeVehicle (String NombreEmpresa) {
        this.TypeVehicle = NombreEmpresa ; 
   }

    public String getOwnerVecicle () {
        return OwnerVecicle ;
    }

    public void setOwnerVecicle (String OwnerVecicle) {
        this.OwnerVecicle =OwnerVecicle ;
    }

    public String getregistrationvehicle() {
        return registrationvehicle;
    }

    public void setCorreoElectronico(String registrationvehicle) {
        this.registrationvehicle = registrationvehicle;
    }

    public String getrouteDestination() {
        return routeDestination ;
    }

    public void setrouteDestination (String routeDestination) {
        this.routeDestination = routeDestination ;
    }  

    public int getid () {
        return id ;
    }

    public void setid (int id) {
        this.id = id ;
    }    
    
    public void registerVehicle() {
        
           System.out.println (" Digite el id del transporte: "+ id);
           System.out.println (" Digite nombre del jefe del ferry: "+ NameBoss);
           System.out.println ("Digite el typo de vehiculo a transportar : "+ TypeVehicle); 
           System.out.println(" Digite el nombre del propietario del vehiculo: "+ OwnerVecicle) ;
           System.out.println(" Digite la matricula del vehiculo: "+registrationvehicle) ;
           System.out.println (" Digite la ruta de destino : "+routeDestination) ;
           
         }
     }


       
