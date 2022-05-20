package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temperaturas {
    public static void temperaturas(){

        int soma = 0;

        List<Integer> listaTemperaturas = new ArrayList<>();
        listaTemperaturas.add(31);
        listaTemperaturas.add(28);
        listaTemperaturas.add(17);
        listaTemperaturas.add(22);
        listaTemperaturas.add(10);
        listaTemperaturas.add(-1);

        String[] listaMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};

        Iterator<Integer> iterator = listaTemperaturas.iterator();
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        float media = (float)soma/listaTemperaturas.size();
        System.out.println("Média semestral = "+media);
        /*
        String tempAcimaMedia;
        for (int temperature : listaTemperaturas){
            soma += temperature;

        }
        float media = (float)soma/listaTemperaturas.size();
        */

        int i = 0;
        System.out.println("Temperaturas acima da média semestral:");
        for (int temperature : listaTemperaturas){
            i++;
            if (temperature > media){
                System.out.println(temperature+" : "+listaMeses[i]);
            }
        }

    }
}
