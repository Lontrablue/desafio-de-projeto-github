package loops;

import java.util.Scanner;

public class MaiorMedia {
    public static void maiorMedia(){
        Scanner scan = new Scanner(System.in);
        float media = 0;
        int maior = 0;
        int controle = 0;
        while(controle < 5){
            System.out.println("Digite um número");
            int numero = scan.nextInt();
            if (numero > maior)
                maior = numero;
            media = media + numero;
            controle ++;
        }
        media = media/controle;
        System.out.println("O maior número é "+maior);
        System.out.println("A média os 5 números é "+media);
    }
}
