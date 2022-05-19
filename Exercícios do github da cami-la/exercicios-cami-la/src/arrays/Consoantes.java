package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Consoantes {
    public static void consoantes() {
        int contadorConsoante = 0;
        Scanner scan = new Scanner(System.in);
        String[] lista = new String[6];
        String[] vogais = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for (int i = 0; i < 6; i++) {
            System.out.println("digite uma letra");
            String letra = scan.next();
            boolean result = Arrays.asList(vogais).contains(letra);
            if (!result) {
                contadorConsoante++;
                lista[i] = letra;
            }
        }
        for (String element : lista) {
            if (element != null)
                System.out.print(element+", ");
        }
        System.out.println("\nnumero de consoantes = "+contadorConsoante);

    }
}
