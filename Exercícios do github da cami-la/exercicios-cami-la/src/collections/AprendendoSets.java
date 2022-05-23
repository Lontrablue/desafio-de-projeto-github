package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AprendendoSets {
    public static void aprendendoSets(){
        System.out.println("criando uma lista de notas no hashset");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas+ "\n");
        System.out.println("confira se a nota 5 existe no conjunto");
        System.out.println(notas.contains(5d)+"\n");
        System.out.println("Exiba a soma dos valores");

    }
}
