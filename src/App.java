
import Ejercicio1.CreationPlanetarySystem;
import Ejercicio3.MethodBubbleOrQuicksort;


public class App {
    public static void main(String[] args) throws Exception {
        /*CreationPlanetarySystem creation = new CreationPlanetarySystem();
        creation.listPlanetary();
        creation.show();
        creation.showAttractionPlanetaryGravitational();
        creation.showAttractionPlanetaryGravitational();
        */

        double array[]=new double[10];
        double number;
        System.out.println("Los numeros elegidos aleatoriamente son: ");
        for(int i=0;i<10;i++){
            number=(double)Math.round(((Math.random())*10) * 100d) / 100d;
            array[i] =number ;
            System.out.println(number);
            
        }
        System.out.println("Los numeros ordenados son: ");
        MethodBubbleOrQuicksort methodBubbleOrQuick=new MethodBubbleOrQuicksort();
        System.out.println("Los numeros ordenados por metodo quick: ");
        methodBubbleOrQuick.showMethodQuikSort(array, 0, array.length-1);
        System.out.println("Los numeros ordenados por metodo bubble: ");
        methodBubbleOrQuick.showMethodBuble(array);
        
    }
}
