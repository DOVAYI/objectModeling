/**
 * Esta clase permite  validar y 
 * tomar valores para respectiva creación de objetos
 * tipo vehiculo.
 * ej.:
 * 
 * EstaClase clase = new EstaClase();
 * 
 * @version 1.0.0 2022-04-16
 * 
 * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
 *
 * @since 1.0.0 2022-04-16
 *
 */

package Ejercicio4;
import java.util.ArrayList;
import java.util.Scanner;
import Validadores.Validator;

public class CreateVehicle {

    private Vehiculo vehicle;
    private Scanner read = new Scanner(System.in);
    private ArrayList<Vehiculo> objects = new ArrayList<Vehiculo>();
    private int numberOfPassengers;
    private boolean crew;
    private int numberOfWheels;
    private String enrollmentDate;
    private String typeVehicle;

    /**
     * Este metodo privado captura datos ingresados por el usuario
     *
     * ejemplo de como usar.:
     * Solo se puede usar dentro de esta clase
     * 
     * 
     * 
     * @return retorna Lista de obtejos tipo vehiculo
     * 
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-16
     *
     *
     * 
     */
    private ArrayList<Vehiculo> captureData() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese información para el vehiculo N°: " +
                    (i + 1));
            vehicle = new Vehiculo();
            numberOfPassengers = validateNumberOfPassengers();
            crew = validateCrew();
            enrollmentDate = validateDate();
            typeVehicle = validateTypeVehicle();
            if (!(typeVehicle.equals("ACUATICO"))) {
                numberOfWheels = validateNumberOfWheels();
            } else {
                numberOfWheels = 0;
            }
            vehicle.setNumberOfPassengers(numberOfPassengers);
            vehicle.setCrew(crew);
            vehicle.setNumberOfWheels(numberOfWheels);
            vehicle.setEnrollmentDate(enrollmentDate);
            vehicle.setTypeVehicle(typeVehicle);

            objects.add(vehicle);
        }

        return objects;
    }
    /**
     * Este metodo muestra todos los vehiculos creados
     *
     * ejemplo de como usar.:
     * despues de instanciar
     * 
     * Estaclase.show()
     
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-16
     *
     *
     * 
     */
    public void show() {
        ArrayList<Vehiculo> obj = captureData();

        for (int j = 0; j < obj.size(); j++) {
            System.out.println("Vehiculo N°: " + (j + 1));
            System.out.println("Tipo de Vehiculo: " +
                    obj.get(j).getTypeVehicle());
            System.out.println("Capacidad de Pasajeros: " +
                    obj.get(j).getNumberOfPassengers());
            System.out.println("tiene tripulación: " +
                    obj.get(j).isCrew());
            System.out.println("Numero de Llantas: " +
                    obj.get(j).getNumberOfWheels());
            System.out.println("Fecha de Matriculación: " +
                    obj.get(j).getEnrollmentDate());

        }
    }
    /**
     * Este metodo privado  valida el tipo de vehiculo
     *
     * ejemplo de como usar.:
     * Solo se puede usar dentro de esta clase
     * 
     * 
     * 
     * @return retorna el tipo de vehiculo
     * 
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-16
     *
     *
     * 
     */
    private String validateTypeVehicle() {
        int aux = 0;
        String aux2 = "";
        while (aux == 0) {
            System.out.println("Elija tipo de Vehiculo : ");
            System.out.println("Presione 1 para: ACUATICO");
            System.out.println("Presione 2 para: AEREO");
            System.out.println("Presione 3: TERRESTRE");
            try {
                aux = Validator.validateNumber(read.nextLine());
                if (aux == 1) {
                    aux2 = "ACUATICO";
                } else if (aux == 2) {
                    aux2 = "AEREO";
                } else {
                    aux2 = "TERRESTRE";
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return aux2;

    }
    /**
     * Este metodo privado  valida el numero 
     * de llantas del vehiculo
     *
     * ejemplo de como usar.:
     * Solo se puede usar dentro de esta clase
     * 
     * 
     * 
     * @return retorna entero indica numero de llantas
     * 
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-16
     *
     *
     * 
     */
    private int validateNumberOfWheels() {

        int aux = 0;

        while (aux == 0) {
            System.out.println("Cuantas llantas tiene el vehiculo");
            try {
                aux = Validator.validateNumber(read.nextLine());

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return aux;

    }
    /**
     * Este metodo privado valida fecha de matriula del vehiculo
     *
     * ejemplo de como usar.:
     * Solo se puede usar dentro de esta clase
     * 
     * 
     * 
     * @return retorna cadena con fecha validada
     * 
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-16
     *
     *
     * 
     */
    private String validateDate() {
        boolean aux2 = false;
        String aux1 = "21-02-2008";

        while (!aux2) {
            System.out.println("Ingrese fecha de matricula: ");
            System.out.println("Los siguientes formato de fecha son validos");
            System.out.println("dia-mes-año");
            System.out.println("dia/mes/año");
            System.out.println("dia.mes.año");

            try {
                aux1 = read.nextLine();
                aux2 = Validator.validateDate(aux1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return aux1;

    }

    /**
     * Este metodo privado  valida si tiene tripulación vehiculo
     *
     * ejemplo de como usar.:
     * Solo se puede usar dentro de esta clase
     * 
     * 
     * 
     * @return retorna boolean Verdadero o falso
     * 
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-16
     *
     *
     * 
     */
    private boolean validateCrew() {
        boolean aux = false;
        System.out.println("Tiene Tripulación?: ");
        System.out.println("Presione 1 si Tiene");
        System.out.println("Cualquier tecla si no lo tiene");
        try {
            if (read.nextLine().equals("1")) {
                aux = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return aux;

    }
    /**
     * Este metodo privado  valida el numero
     * pasajeros permitidos de vehiculo
     *
     * ejemplo de como usar.:
     * Solo se puede usar dentro de esta clase
     * 
     * 
     * 
     * @return retorna entero cantidad de pasajeros
     * 
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-16
     *
     *
     * 
     */
    private int validateNumberOfPassengers() {
        int passengers = 0;
        while ((passengers == 0) || (passengers < 0)) {

            try {
                System.out.println("Ingrese Capacidad maxima de pasajeros");
                passengers = Validator.validateNumber(read.nextLine());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return passengers;
    }
}