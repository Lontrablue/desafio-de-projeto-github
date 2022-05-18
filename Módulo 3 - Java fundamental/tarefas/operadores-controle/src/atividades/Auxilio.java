package atividades;

import java.util.Scanner;

public class Auxilio {
    public static double receberSalario(){
        System.out.println("Defina o salário mensal");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public static double receberMediaSalario(){
        System.out.println("Defina a média salarial");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public static int qtdeDependentes(){
        System.out.println("Defina a quantidade de dependentes");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static int mediaDependentes(){
        System.out.println("Defina a media de dependentes");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static boolean recebeAuxilio(){
        boolean salarioAbaixo = receberSalario() < receberMediaSalario();
        boolean muitosDependentes = qtdeDependentes() > mediaDependentes();
        return (salarioAbaixo && muitosDependentes);
    }

    public static void imprimir(){
        System.out.println("A elegibiliade do auxilio é "+recebeAuxilio());
    }
}
