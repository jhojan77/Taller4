
package Exercise1;

/**
 *
 * @author jhojan hoyos
 */
    public class PlanetarySystem {
    /**
     * atributo que corresponde al identificador unico por planeta
     */
    private int id;
    /**
     * atributo que corresponde al nombre del planeta
     */
    private String name;
    /**
     * atributo que corresponde al valor de la masa del planeta
     */
    private double mass;
    /**
     * atributo que corresponde al valor de la densidad del planeta
     */
    private double density;
    /**
     * atributo que corresponde al diametro del planeta
     */
    private int diameter;
    /**
     * atributo que corresponde a la distancia que tiene un planeta al sol
     */
    private int distance ;

    public PlanetarySystem(int id, String name, double mass,double density, int diameter, int distance) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distance = distance;
    }

    /**
     * metodos set y get 
     */
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
    public String showPlanet(){
         return this.getId()+ "    " +this.getName() ;
    }
       
    /**
     * metodo que lista los planetas del sistema
     * @return 
     */
    public String show(){
         return this.getId()+ "    " +this.getName()
               + "     " +this.getMass()+ "kg" +"       "+this.getDensity()
                  + " gr/cm"+ "       "+this.getDiameter()+ "km "+"      "+this.getDistance()+ "Km " ;
    }
                      
}
