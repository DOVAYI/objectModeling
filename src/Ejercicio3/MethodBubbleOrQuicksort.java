/**
 * Esta clase permite ordenar un grupo de numeros Eligos aleatoriamente.
 * 
 * La solucion fue tomada de internet en Pseudocodigo
 * fue modificada y adaptada a este contexto
 * 
 * ej.:
 * 
 * EstaClase clase = new EstaClase();
 * 
 
 * @version 1.0.0 2022-04-16
 * 
 * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
 *
 * @since 1.0.0 2022-04-15
 *
 */

package Ejercicio3;

public class MethodBubbleOrQuicksort {
    /**
     * Este metodo recursivo su utiliza para ordenar un grupo de numeros
     
     * @param recibe una arreglo de numero desordenados
     * @param recibe numero entero para indicar la posicion de inicio de arreglo
     * @param recibe numero entero cantidad de elementos-1s(tamaño del array)
     * @return retorna Lista ordenada de numeros
     * 
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-15
     *
     *
     * 
     */
    private double[] quicksort(double arrays[], int left, int rigth) {

        var reference = arrays[left];
        int i = left;
        int j = rigth;
        double aux;

        while (i < j) {
            while ((arrays[i] <= reference) && (i < j)) {
                i++;
            }

            while (arrays[j] > reference) {
                j--;
            }
            if (i < j) {
                aux = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = aux;
            }
        }

        arrays[left] = arrays[j];
        arrays[j] = reference;

        if (left < j - 1)
            quicksort(arrays, left, j - 1);
        if (j + 1 < rigth)
            quicksort(arrays, j + 1, rigth);

        return arrays;
    }

    /**
     * Este metodo muestra grupo de numeros ordenados
     
     * @param recibe una arreglo de numero desordenados
     * @param recibe numero entero para indicar la posicion de inicio de arreglo
     * @param recibe numero entero cantidad de elementos-1s(tamaño del array)
     * 
     * 
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-15
     *
     *
     * 
     */
    public void showMethodQuikSort(double array[], int start, int fin) {
        double arrayOrderBy[] = quicksort(array, start, fin);
        for (int i = 0; i < arrayOrderBy.length; i++) {
            System.out.println(arrayOrderBy[i]);

        }
    }

    /**
     * Este metodo recursivo su utiliza para ordenar un grupo de numeros
     
     * @param recibe una arreglo de numero desordenados
     * 
     * @return retorna Lista ordenada de numeros
     * 
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-15
     *
     *
     * 
     */
    private double[] buble(double[] arrays2) {
        double aux2;
        
        for (int i = 2; i < arrays2.length; i++) {
            for (int j = 0; j < arrays2.length - i; j++) {
                if (arrays2[j] > arrays2[j + 1]) {
                    aux2 = arrays2[j];
                    arrays2[j] = arrays2[j + 1];
                    arrays2[j + 1] = aux2;
                }
            }
        }
         
        return arrays2;
    }
     /**
     * Este metodo muestra grupo de numeros ordenados
     
     * @param recibe una arreglo de numero desordenados
   
     * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
     *
     * @since 1.0.0 2022-04-15
     *
     *
     * 
     */
    public void showMethodBuble(double[] arrays2 ){
        double[] arrayOrderBy= buble(arrays2);
        for (int i = 0; i < arrayOrderBy.length; i++) {
            System.out.println(arrayOrderBy[i]);

        }
    }

}
