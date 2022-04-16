/**
 * Esta clase permite crear un planeta.
 *
 * ej.:
 * 
 * EstaClase clase = new EstaClase(arg1,arg2,arg3,arg4);
 * 4 atributos se inicializan en el constructor y 2 con los setters;
 * los getters para tomar los valores
 *
 * @version 1.0.0 2022-04-15
 
 * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
 *
 * @since 1.0.1 2022-04-15
 *
 */

package Ejercicio1;

public class PlanetarySystem {

    private double dough = 0;
    private double density;
    private double diameter;
    private double distanceToSun;
    private int id;
    private String name;
    /*Esta constante No es un valor Real,Utilizado para facilitar calculos */
    private final double gravitationalConstant = 0.5;

    public PlanetarySystem(double dough, double density, double diameter,
            double distanceToSun) {
        this.dough = dough;
        this.density = density;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;

    }

    /**
     * 
     * metodos setters
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * metodos Getters
     */

    public double getDough() {
        return dough;
    }

    public double getDensity() {
        return density;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGravitationalConstant() {
        return gravitationalConstant;
    }

    /**
     * Este metodo su utiliza para calcular fuerza de atraccion entre 2 planetas
     *
     * ejemplo de como usar.:
     *
     * nombre_clase.list();
     *
     * @return retorna valor double Atracción gravitacional
     * 
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.1 2022-04-15
     
     */
    public double attractionGravitational(double dough1, double dough2,
            double distance) {
        double result = (getGravitationalConstant() * (dough1 * dough2))
                / (distance * distance);
        return result;
    }

}
