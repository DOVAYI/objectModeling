package Ejercicio5;

import Ejercicio4.Vehiculo;

public class Coche extends Vehiculo {

    private String typeOfBraking;

    public Coche(String typeOfBraking, int numberOfPassengers,
            String enrollmentDate) {
        this.typeOfBraking = typeOfBraking;
        super.setNumberOfPassengers(numberOfPassengers);
        super.setCrew(true);
        super.setNumberOfWheels(4);
        super.setEnrollmentDate(enrollmentDate);
        super.setTypeVehicle("TERRESTRE");
    }

    public String getTypeOfBraking() {
        return typeOfBraking;
    }

    @Override
    public String toString() {
        return "Coche [Vehiculo tipo: " + super.getTypeVehicle() +
                ", tipo de frenado = " + getTypeOfBraking() +
                ",\n Numero de Pasajeros = " +
                super.getNumberOfPassengers() + ",Fecha de matricula = "
                + super.getEnrollmentDate() + " ]";
    }

}
