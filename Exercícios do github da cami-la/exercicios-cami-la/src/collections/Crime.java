package collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Crime {
    public static void crime() {

        int qtadeRespostaSim = 0;

        Scanner scan = new Scanner(System.in);

        List<String> listaPerguntas = new ArrayList<>();
        listaPerguntas.add("Telefonou para a vítima? (S/N)");
        listaPerguntas.add("Esteve no local do crime? (S/N)");
        listaPerguntas.add("Mora perto da vítima? (S/N)");
        listaPerguntas.add("Devia para a vítima? (S/N)");
        listaPerguntas.add("Já trabalhou com a vítima? (S/N)");

        Iterator<String> iterator = listaPerguntas.iterator();
        while (iterator.hasNext()){
            String perguntaAtual = iterator.next();
            System.out.println(perguntaAtual);
            char resposta = scan.next(".").charAt(0);
            if (resposta == 's') qtadeRespostaSim++;
        }
        switch(qtadeRespostaSim){
            case 2:
                System.out.println("Suspeito");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassin");
                break;
            default:
                System.out.println("Inocente");
        }
    }
}
