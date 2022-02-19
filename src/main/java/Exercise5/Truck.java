
package Exercise5;

/**
 *
 * @author jhojan hoyos
 */
public class Truck extends Vehicle{
    /**
     * corresponde al numero de llantas del camion o mula
     */
    private int numTires;

    public int getNumTires() {
        return numTires;
    }

    public void setNumTires(int numTires) {
        this.numTires = numTires;
    }

    public Truck(int numTires, String NameBoss, String TypeVehicle, 
            String OwnerVecicle, String registrationvehicle, String routeDestination, int id) {
        super(NameBoss, TypeVehicle, OwnerVecicle, registrationvehicle, routeDestination, id);
        this.numTires = numTires;
    }

    @Override
    public void registerVehicle() {
       
    }
        
}
