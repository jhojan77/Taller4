
package Exercise1;

/**
 *
 * @author jhojan hoyos
 */
public class PlanetarySystem {
 private int id;
 private String name;
 private double mass;
 private double density; 
 private int diameter;
 private int distance ;

    public PlanetarySystem(int id, String name, double mass,double density, int diameter, int distance) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    public String show(){
         return this.getId()+ "    " +this.getName()
               + "     " +this.getMass()+ "kg" +"       "+this.getDensity()
                  + " gr/cm"+ "       "+this.getDiameter()+ "km "+"      "+this.getDistance()+ "Km " ;
    }
                      
}
