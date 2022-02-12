
package Exercise1;

import java.util.ArrayList;

/**
 *
 * @author jhojan hoyos
 */
public class Planets {
    private ArrayList<PlanetarySystem> planetList;

    public Planets(ArrayList<PlanetarySystem> planetList) {
        this.planetList = planetList;
    }

    public Planets() {
    }

    public ArrayList<PlanetarySystem> getPlanetList() {
        return planetList;
    }

    public void setPlanetList(ArrayList<PlanetarySystem> planetList) {
        this.planetList = planetList;
    }

    public void listPlanet(){
        ArrayList<PlanetarySystem> list = new ArrayList<>();
           PlanetarySystem planet1 = new PlanetarySystem(1, "Mercurio ",  3.3  ,   5.42,  4879  ,  58);
           PlanetarySystem planet2 = new PlanetarySystem(2, "Venus   ", 48.7  ,   5.25,  12104, 108);
           PlanetarySystem planet3 = new PlanetarySystem(3, "Tierra  ", 59.7  ,   5.52,  12742, 150);
           PlanetarySystem planet4 = new PlanetarySystem(4, "Marte     ", 6.4 ,   3.94,  6779, 228);
           PlanetarySystem planet5 = new PlanetarySystem(5, "Jupiter", 19000.0, 1.33, 139820, 778);
           PlanetarySystem planet6 = new PlanetarySystem(6, "Saturno",5688, 0.69, 116460, 1429);
           PlanetarySystem planet7 = new PlanetarySystem(7, "Urano   ", 5688, 1.29, 50724, 2871);
           PlanetarySystem planet8 = new PlanetarySystem(8, "Neptuno", 1024, 1.64, 49244, 4504);
           PlanetarySystem planet9 = new PlanetarySystem(9, "Pluton   ", 0.1,   2.05, 2377, 5914);
           
           list.add(planet1);
           list.add(planet2);
           list.add(planet3);
           list.add(planet4);
           list.add(planet5);
           list.add(planet6);
           list.add(planet7);
           list.add(planet8);
           list.add(planet9);
           setPlanetList(list);
    };
    
   public ArrayList<PlanetarySystem> filterplanet(String name) {
        ArrayList<PlanetarySystem> listPlanet = new ArrayList<>();
         for(PlanetarySystem ps: this.planetList) {
            if(ps.getName() == name) {
                listPlanet.add(ps);
            }
        }
        return listPlanet;
    }
    
}
    