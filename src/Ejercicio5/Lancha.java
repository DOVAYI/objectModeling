package Ejercicio5;
import Ejercicio4.Vehiculo;

public class Lancha extends Vehiculo {

    private String pushType;

    public Lancha(String pushType, int numberOfPassengers, String enrollmentDate) {
        this.pushType = pushType;
        super.setNumberOfPassengers(numberOfPassengers);
        super.setCrew(true);
        super.setNumberOfWheels(0);
        super.setEnrollmentDate(enrollmentDate);
        super.setTypeVehicle("ACUATICO");
    }

    public String getPushType() {
        return pushType;
    }

    @Override
    public String toString() {
        return "Lancha [Vehiculo tipo: " + super.getTypeVehicle() +
                ", Empuje tipo = " + getPushType() + ",\n Numero de Pasajeros = " +
                super.getNumberOfPassengers() + ",Fecha de matricula = "+super.getEnrollmentDate()+" ]";
    }

}
