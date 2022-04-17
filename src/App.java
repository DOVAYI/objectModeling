
import java.util.Scanner;



import Ejercicio1.CreationPlanetarySystem;
import Ejercicio3.MethodBubbleOrQuicksort;
import Ejercicio4.CreateVehicle;
import Ejercicio4.Vehiculo;
import Ejercicio5.Coche;
import Ejercicio5.Lancha;
import Ejercicio6.UseVectorClass;
import Ejercicio5.Avion;
import Validadores.Validator;

public class App {
    public static void main(String[] args) throws Exception {
        int num = 0; /* esta variable representa la opción que elija el usuario */
        String decision; /* esta variable se utiliza si continua o no ejecutando el programa */

        Scanner read = new Scanner(System.in);

        do {

            decision = "s";

            while ((num == 0) || (num < 0)) {

                System.out.println("Bienvenid@");
                System.out.println("Que desea hacer:  ");
                System.out.println("Presione 1 para ver Ejercicio N° 1");
                System.out.println("Presione 2 para ver Ejercicio N° 2");
                System.out.println("Presione 3 para ver Ejercicio N° 3");
                System.out.println("Presione 4 para ver Ejercicio N° 4");
                System.out.println("Presione 5 para ver Ejercicio N° 5");
                System.out.println("Presione 6 para ver Ejercicio N° 6");
                System.out.println("Presione el numero segun el valor de la Opción");

                try {
                    num = Validator.validateNumber(read.nextLine());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                if (num > 6) {
                    num = 0;
                }

            }

            switch (num) {
                case 1:
                    CreationPlanetarySystem creation = new CreationPlanetarySystem();
                    creation.listPlanetary();
                    creation.show();
                    creation.showAttractionPlanetaryGravitational();
                    creation.showAttractionPlanetaryGravitational();
                    break;
                case 2:
                    System.out.println("Desde mi experiencia un App si puede tener varias clases,cada una");
                    System.out.println("con su metodo 'main', en mi caso utilizando el IDE netbeans 8.2,se");
                    System.out.println("configura por que clase y que metodo main arranca.");
                    System.out.println("revisar el siguiente repositorio");
                    System.out.println("carpeta src");
                    System.out.println("carpeta views: encontrara archivos con extension .java");
                    System.out.println("Revisar parte final del codigo:cada una tiene su metodo main");
                    System.out.println("https://github.com/DOVAYI/juegoSofka.git");

                    break;
                case 3:
                    num = 0;

                    while (num == 0) {

                        System.out.println("Opción 1: Usar metodo QuickSort");
                        System.out.println("Opción 2: Usar metod Burbuja");

                        num = Validator.validateNumber(read.nextLine());

                        if (num > 2 || (num < 0)) {
                            num = 0;
                        }

                    }

                    double array[] = new double[10];
                    double number;
                    System.out.println("Los numeros elegidos aleatoriamente son: ");
                    for (int i = 0; i < 10; i++) {
                        number = (double) Math.round(((Math.random()) * 10) * 100d) / 100d;
                        array[i] = number;
                        System.out.println(number);

                    }
                    MethodBubbleOrQuicksort methodBubbleOrQuick;
                    methodBubbleOrQuick = new MethodBubbleOrQuicksort();
                    if (num == 1) {
                        System.out.println("Los numeros ordenados por metodo" +
                                "quicksort: ");
                        methodBubbleOrQuick.showMethodQuikSort(array, 0,
                                array.length - 1);
                    } else if (num == 2) {
                        System.out.println("Los numeros ordenados por" +
                                " metodo bubble: ");
                        methodBubbleOrQuick.showMethodBuble(array);
                    }

                    break;
                case 4:
                        CreateVehicle createvehicle=new CreateVehicle();
                        createvehicle.show();
                    break;
                case 5:
                    Vehiculo lancha=new Lancha("motor", 4,"21-02-2008");
                    System.out.println(lancha.toString());
                    System.out.println("-----------------------------");
                    Vehiculo coche= new Coche("Disco",5,"19-06-1991");
                    System.out.println(coche.toString());
                    System.out.println("-----------------------------");
                    Vehiculo avion= new Avion(10,55,"04-02-2013");
                    System.out.println(avion.toString());
                    break;
                case 6:
                    UseVectorClass usevectorclass= new UseVectorClass();
                    usevectorclass.show();
                    break;
            }

            System.out.println("Desea continuar?");
            System.out.println("Presione la Tecla 'S' si desea continuar ó Cualquier tecla para salir");
            try {
                decision = read.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            num = 0;

        } while (decision.equals("s") || decision.equals("S"));
        System.out.println("GRACIAS! Hasta Pronto");
        read.close();

    }
}
