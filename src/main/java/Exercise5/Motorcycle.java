package Exercise5;

/**
 *
 * @author jhojan hoyos
 */
public class Motorcycle extends Vehicle {
    /**
     * corresponde a la marca de la moto
     */
     private int brand;

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public Motorcycle(int brand, String NameBoss, String TypeVehicle, String OwnerVecicle, 
              String registrationvehicle, String routeDestination, int id) {
        super(NameBoss, TypeVehicle, OwnerVecicle, registrationvehicle, routeDestination, id);
        this.brand = brand;
    }

    @Override
    public void registerVehicle() {
        
    }
    
    
}
