/**
 * Esta clase permite crear los Planetas.
 * No se toma valores Reales de la masa,densidad de planetas y/o 
 * cuerpos espaciales  por motivos practicos.
 * ej.:
 * 
 * EstaClase clase = new EstaClase();
 * clase.show();
 * clase.showAttractionPlanetaryGravitational();
 
 * @version 1.0.0 2022-04-15
 * 
 * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
 *
 * @since 1.0.0 2022-04-15
 *
 */

package Ejercicio1;
import java.util.ArrayList;

public class CreationPlanetarySystem {

    private PlanetarySystem planetarySystem;
    private ArrayList<PlanetarySystem> planetarys;

    /**
     * Este metodo su utiliza para calcular fuerza de atraccion entre 2 planetas
     *
     * ejemplo de como usar.:
     * despues de instanciar esta clase:
     * 
     * clase.listPlanetary();
     * 
     *@return retorna Lista de obtejos tipo PlanetarySystem
     * 
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-15
     *
     *
     * 
     */
    public ArrayList<PlanetarySystem> listPlanetary() {

        planetarys = new ArrayList<>();
        planetarySystem = new PlanetarySystem(1000, 7000, 200, 278);
        planetarySystem.setId(1);
        planetarySystem.setName("VERUS");
        planetarys.add(planetarySystem);

        planetarySystem = new PlanetarySystem(900, 750, 135, 320);
        planetarySystem.setId(2);
        planetarySystem.setName("THOR");
        planetarys.add(planetarySystem);

        planetarySystem = new PlanetarySystem(3500, 280, 345, 500);
        planetarySystem.setId(3);
        planetarySystem.setName("Cyrus");
        planetarys.add(planetarySystem);

        planetarySystem = new PlanetarySystem(2500, 1750, 298, 625);
        planetarySystem.setId(4);
        planetarySystem.setName("Blue");
        planetarys.add(planetarySystem);

        planetarySystem = new PlanetarySystem(7123, 4000, 600, 900);
        planetarySystem.setId(5);
        planetarySystem.setName("Glaxxon");
        planetarys.add(planetarySystem);

        return planetarys;

    }

    /**
     * Este metodo su utiliza para mostrar la fuerza de atraccion gravitacional
     * entre 2 planetas elegidos al azar
     * @param recibe como parametro 2 numeros, estos reprsentan los planetas
     * 
     * ejemplo de como usar.:
     * solo se puede usar dentro de la clase
     * 
     * numbeRandom(param1,param2);
     
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-15
     *
     *
     * 
     */
    private void numbeRandom(int number1, int number2) {

        double result = attractionPlanetaryGravitational(number1, number2);

        System.out.println("La Atracción Gravitacional entre el planeta:  " +
                planetarys.get(number1).getName() + " y el planeta: "
                + planetarys.get(number2).getName() + " es: " + result);

    }
    /**
     * Este metodo su utiliza para calcular la fuerza de atraccion gravitacional
     * entre 2 planetas elegidos al azar
     * @param recibe como prametro 2 numeros, aleatorio 0 y 4  estos representan los planetas
     * 
     * ejemplo de como usar.:
     * solo se puede usar dentro de la clase
     * 
     * attractionPlanetaryGravitational(param1,param2);
     * 
     * @return retorna el valor de la fuerza de atracción gravitacional
     * 
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-15
     *
     *
     * 
     */
    private double attractionPlanetaryGravitational(int num1, int num2) {

        double distanceToSunToplanet = planetarys.get(num1).getDistanceToSun();
        double dough1 = planetarys.get(num1).getDough();
        double distanceToSunToplanet2 = planetarys.get(num2).getDistanceToSun();
        double dough2 = planetarys.get(num2).getDough();
        double distanceTotal = Math.abs(distanceToSunToplanet - distanceToSunToplanet2);

        double attractionplanetary = planetarySystem.attractionGravitational(
                dough1, dough2, distanceTotal);

        return attractionplanetary;

    }
    /**
     * Este metodo su utiliza para acceder a los metodos privados
     *
     * ejemplo de como usar.:
     * despues de instanciar esta clase:
     * 
     * EstaClase clase =new EstaClase();
     * clase.showAttractionPlanetaryGravitational();
     * 
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-15
     *
     *
     * 
     */
    public void showAttractionPlanetaryGravitational() {
        int numero1 = (int) (Math.random() * 5) + 1;
        int numero2 = (int) (Math.random() * 5) + 1;
        while (numero1 == numero2) {
            numero1 = (int) (Math.random() * 5) + 1;
            numero2 = (int) (Math.random() * 5) + 1;
        }
        numbeRandom((numero1 - 1), (numero2 - 1));
    }
    /**
     * Este metodo su utiliza para mostrar todos los planetas
     * de este sistema. 
     *
     * ejemplo de como usar.:
     * despues de instanciar esta clase:
     * 
     * EstaClase clase =new EstaClase();
     * clase.show();
     * 
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-15
     *
     *
     * 
     */
    public void show() {
        for (int i = 0; i < planetarys.size(); i++) {
            System.out.println("El ID de planeta es: " +
                    planetarys.get(i).getId());
            System.out.println("El Nombre de planeta es: " +
                    planetarys.get(i).getName());
            System.out.println("La Masa del planeta es: " +
                    planetarys.get(i).getDough());
            System.out.println("La Densidad del planeta es: " +
                    planetarys.get(i).getDensity());
            System.out.println("El Diametro del planeta es: " +
                    planetarys.get(i).getDiameter());
            System.out.println("La Distancia del planeta al Sol es: " +
                    planetarys.get(i).getDistanceToSun());
            System.out.println("------------------------------------");
        }
    }

}
