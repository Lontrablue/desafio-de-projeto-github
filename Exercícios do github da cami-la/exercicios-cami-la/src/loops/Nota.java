package loops;

import java.util.Scanner;

public class Nota {

    public static void nota() {
        Scanner scan = new Scanner(System.in);
            System.out.println("Digite a nota");
            int nota = scan.nextInt();
            while (nota < 0 || nota > 10){
                System.out.println("Nota inválida");
                nota = scan.nextInt();
            }
    }
}

