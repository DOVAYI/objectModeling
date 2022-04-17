package Ejercicio6;

import java.util.Scanner;
import java.util.Vector;

public class UseVectorClass {
    Vector<Integer> vector = new Vector<Integer>();
    Scanner read = new Scanner(System.in);

    private Vector<Integer> loadDates() {
        String prueba = "s";
        int i = 0;
        

        do {
            int valor = 0;
            while ((valor == 0) || (valor < 0)) {
                try {
                    System.out.println("ingresa numeros mayores que cero 0");
                    valor = Integer.parseInt(read.nextLine());
                    vector.addElement(valor);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    valor=0;
                }
            }

            if (i > 0) {

                if (vector.elementAt(i).equals(vector.elementAt(i - 1))) {
                    prueba = "n";
                    vector.removeElementAt(i);
                }

            }
            i++;

        } while (prueba.equals("s"));

        return vector;
    }

    public void show() {
        Vector<Integer> array = loadDates();
        System.out.println("--------------");
        for (int j = 0; j < array.size(); j++) {
            System.out.println(array.elementAt(j));
        }

    }
}
