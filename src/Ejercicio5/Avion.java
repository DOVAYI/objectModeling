package Ejercicio5;

import Ejercicio4.Vehiculo;

public class Avion extends Vehiculo{

    private double maximumHeight;

    public Avion(double maximumHeight, int numberOfPassengers,
            String enrollmentDate) {
        this.maximumHeight = maximumHeight;
        super.setNumberOfPassengers(numberOfPassengers);
        super.setCrew(true);
        super.setNumberOfWheels(10);
        super.setEnrollmentDate(enrollmentDate);
        super.setTypeVehicle("AEREO");
    }

    public double getMaximumHeight() {
        return maximumHeight;
    }

    @Override
    public String toString() {
        return "Avión [Vehiculo tipo: " + super.getTypeVehicle() +
                ", Altura maxima alcanzada = " + getMaximumHeight() +
                "Kilometros,\n Numero de Pasajeros = " +
                super.getNumberOfPassengers() + ",Fecha de matricula = "
                + super.getEnrollmentDate() + " ]";
    }

    
    
}
