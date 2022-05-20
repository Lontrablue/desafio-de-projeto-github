package collections;

import java.util.*;

public class ConhecendoMetodosList {
    public static void conhecendoMetodosList(){

        List<Double> notas = new ArrayList<>((Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)));
        //System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5");
        System.out.println(notas.indexOf(5d));

        System.out.println("Adicione a nota 8 na posição 4");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5 pela nota 7");
        notas.set(notas.indexOf(5d), 7d);
        System.out.println(notas);

        System.out.println("Confira se a nota 5 está na lista");
        System.out.println(notas.contains(5d));

        System.out.println("Exiba a terceira nota adicionada");
        System.out.println(notas.get(2));

        System.out.println("menor nota");
        System.out.println(Collections.min(notas));

        System.out.println("maior nota");
        System.out.println(Collections.max(notas));

        System.out.println("Soma dos valores");
        double soma = 0;
        /*for (double nota : notas){     SEM O ITERATOR.
            soma += nota;
        }*/
        Iterator<Double> iterator = notas.iterator();//CTRl alt V para jogar na variavel auto
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas");
        System.out.println(soma/notas.size());

        System.out.println("Remova a nota zero");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if (next < 7 )
                iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Informe se a lista está vazia");
        System.out.println(notas.isEmpty());
    }
}
