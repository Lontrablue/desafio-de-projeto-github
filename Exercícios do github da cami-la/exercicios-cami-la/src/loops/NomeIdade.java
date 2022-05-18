package loops;

import java.util.Scanner;

public class NomeIdade {

    public static void nomeIdade() {
            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("Digite o nome");
                String nome = scan.next();
                if (nome.equals("0"))
                    break;
                System.out.println("Digite a idade");
                int idade = scan.nextInt();
            }
        }
    }
