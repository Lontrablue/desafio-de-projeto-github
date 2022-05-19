package loops;

import java.util.Scanner;

public class ParImpar {
    public static void parImpar(){
        Scanner scan = new Scanner(System.in);
        int qtdePar = 0;
        int qtdeImpar = 0;
        int numero;
        System.out.println("Entre a quantidade de número");
        int qtdeNumero = scan.nextInt();

        for (int i = 1; i <= qtdeNumero; i++){
            System.out.println("Entre um número");
            numero = scan.nextInt();

           if (numero % 2 == 0) {
              qtdePar++;
           } else {
               qtdeImpar++;
           }
        }
        System.out.println("Números pares = "+qtdePar);
        System.out.println("Números ímpares = "+qtdeImpar);

    }
}


