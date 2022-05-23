package collections;


import java.util.*;

public class ExerciciosPropostos {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void exercicio1()
    {
        System.out.println("criando o dicionário...");
        Map<String, Integer> dicionario = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(dicionario/*.toString()*/+"\n");
        System.out.println("Substituir a população do estado do RN por 3534165");
        dicionario.replace("RN", 3534165);
        System.out.println(dicionario/*.toString()*/+"\n");
        System.out.println("Conferir se o estado PB está no dicionário. Caso não, adicionar " +
                "com população de 4039277");
        if (!dicionario.containsKey("PB")) dicionario.put("PB", 4039277);
        System.out.println(dicionario/*.toString()*/+"\n");
        System.out.println("Exibir a população de PE");
        System.out.println(dicionario.get("PE\n"));
        System.out.println("Exiba todos os estados e suas populações na ordem em que foi informado");
        LinkedHashMap<String, Integer> dicionarioOrdenado = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(dicionarioOrdenado+"\n");
        System.out.println("Exibir tudo em ordem alfabética");
        TreeMap<String, Integer> dicionarioOrdenado2 = new TreeMap<>(dicionario);
        System.out.println(dicionarioOrdenado2+"\n");
        System.out.println("Exiba os estado com a menor população e sua quantidade");
        int menorPopulacao = Collections.min(dicionario.values());
        Set<Map.Entry<String, Integer>> estados = dicionario.entrySet();
        for(Map.Entry<String, Integer> estado : estados){
            if (estado.getValue() == menorPopulacao){
                System.out.println(estado+"\n");
            }
        }
        System.out.println("Exiba o estado com a maior população e sua quantidade");
        int maiorPopulacao = Collections.max(dicionario.values());
        for(Map.Entry<String, Integer> estado : estados){
            if (estado.getValue() == maiorPopulacao){
                System.out.println(estado+"\n");
            }
        }
        System.out.println("Exiba a soma da população destes estados");
        Iterator<Integer> iterator = dicionario.values().iterator();
        int soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma+"\n");

        System.out.println("Exiba a média aritmetica das populações");
        System.out.println(soma/dicionario.size()+"\n");

        System.out.println("Remova os estados com populações menor do que 4kk");
        Iterator<Integer> iterator2 = dicionario.values().iterator();
        while (iterator2.hasNext()){
            if (iterator2.next() < 4000000) iterator2.remove();
        }
        System.out.println(dicionario+"\n");
        System.out.println("Apague o dicionário");
        dicionario.clear();
        System.out.println(dicionario+"\n");
        System.out.println("confira se o dicionário permanece vazio");
        System.out.println(dicionario.isEmpty());

    }
}
