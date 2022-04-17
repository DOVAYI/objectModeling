package Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

import Validadores.Validator;

public class CreateVehicle {

    private Vehiculo vehicle;
    private Scanner read = new Scanner(System.in);
    private ArrayList<Vehiculo> objects = new ArrayList<Vehiculo>();

    private int numberOfPassengers;
    private boolean crew;// tripulacion
    private int numberOfWheels;// numero de ruedas
    private String enrollmentDate;// fecha de matriculas
    private String typeVehicle;

    private ArrayList<Vehiculo> captureData() {
        for (int i = 0; i < 2; i++) {
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

    public void show() {
        ArrayList<Vehiculo> obj = captureData();

        for (int j = 0; j < obj.size(); j++) {
            System.out.println("Vehiculo N°: " + (j + 1));
            System.out.println("Tipo de Vehiculo: " + obj.get(j).getTypeVehicle());
            System.out.println("Capacidad de Pasajeros: " + obj.get(j).getNumberOfPassengers());
            System.out.println("tiene tripulación: " + obj.get(j).isCrew());
            System.out.println("Numero de Llantas: " + obj.get(j).getNumberOfWheels());
            System.out.println("Fecha de Matriculación: " + obj.get(j).getEnrollmentDate());

        }
    }

    private String validateTypeVehicle() {
        int aux = 0;
        String aux2 = "";
        while (aux == 0) {
            System.out.println("Elija tipo de Vehiculo entre los Siguientes: ");
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

    private String validateDate() {
        boolean aux2 = false;
        String aux1 = "21-02-2008";

        while (!aux2) {
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