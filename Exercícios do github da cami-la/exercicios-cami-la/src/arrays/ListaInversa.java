package arrays;

import java.util.Arrays;

public class ListaInversa {
    public static void listaInversa() {
        int [] array = {52, 44, 36, 45, 58};
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[array.length];
        int x = 1;
        for (int i = 0; i < array.length; i++){
            array2[i] = array[array.length-x];
            x++;
        }
        System.out.println(Arrays.toString(array2));
    }
}
