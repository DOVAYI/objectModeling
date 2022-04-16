package Ejercicio3;

public class MethodBubbleOrQuicksort {

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

    public void showMethodQuikSort(double array[], int start, int fin) {
        double arrayOrderBy[] = quicksort(array, start, fin);
        for (int i = 0; i < arrayOrderBy.length; i++) {
            System.out.println(arrayOrderBy[i]);

        }
    }

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

    public void showMethodBuble(double[] arrays2 ){
        double[] arrayOrderBy= buble(arrays2);
        for (int i = 0; i < arrayOrderBy.length; i++) {
            System.out.println(arrayOrderBy[i]);

        }
    }

}
