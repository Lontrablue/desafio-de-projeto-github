package atividades;

public class ExemploSwitch {
    public static void switchNumero(){
        int numero = 4;
        switch(numero){
            case 1:
            case 2:
            case 3:
                System.out.println("certo");
                break;
            case 4:
                System.out.println("errado");
                break;
            case 5:
                System.out.println("talvez");
                break;
            default:
                System.out.println("inválido");
                break;
        }
    }
}
