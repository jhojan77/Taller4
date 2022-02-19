
package Exercise5;

/**
 *
 * @author jhojan hoyos
 */
public class Bicycle extends Vehicle{
    /**
     * corresponde al color de la bibicleta
     */    
    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Bicycle(String colour, String NameBoss, String TypeVehicle, 
            String OwnerVecicle, String registrationvehicle, String routeDestination, int id) {
        super(NameBoss, TypeVehicle, OwnerVecicle, registrationvehicle, routeDestination, id);
        this.colour = colour;
    }

    @Override
    public void registerVehicle() {
        
    }
    
    
    
}
