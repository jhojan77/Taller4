
package Exercise5;

/**
 *
 * @author jhojan hoyos
 */
public class Car extends Vehicle{
    /**
     * corresponde al numero de puertas del carro
     */
     private int numDoor;

    public int getNumDoor() {
        return numDoor;
    }

    public void setNumDoor(int numDoor) {
        this.numDoor = numDoor;
    }

    public Car(int numDoor, String NameBoss, String TypeVehicle, String OwnerVecicle,
                  String registrationvehicle, String routeDestination, int id) {
        super(NameBoss, TypeVehicle, OwnerVecicle, registrationvehicle, routeDestination, id);
        this.numDoor = numDoor;
    }
 

    @Override
    public void registerVehicle() {
       
    }
     
}
