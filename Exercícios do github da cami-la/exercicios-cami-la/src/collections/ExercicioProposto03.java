package collections;
import com.sun.source.tree.Tree;

import java.util.*;
public class ExercicioProposto03 {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void exercicio03() {

        System.out.println("--\tOrdem aleatória\t--");

        class Contato{
            private String nome;
            private Integer numero;

            public Contato(String nome, Integer numero) {
                this.nome = nome;
                this.numero = numero;
            }

            public String getNome() {
                return nome;
            }

            public Integer getNumero() {
                return numero;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Contato contato = (Contato) o;
                return nome.equals(contato.nome) && numero.equals(contato.numero);
            }

            @Override
            public int hashCode() {
                return Objects.hash(nome, numero);
            }

            @Override
            public String toString() {
                return "Contato{" +
                        "nome='" + nome + '\'' +
                        ", numero='" + numero + '\'' +
                        '}';
            }
        }


        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda);

        System.out.println("Exibir por ordem de id");
        Map<Integer, Contato> agendaPorId= new TreeMap<>(agenda);
        for(Map.Entry<Integer, Contato> entry : agendaPorId.entrySet())
            System.out.println(entry);


        class ComparatorNome implements Comparator<Map.Entry<Integer, Contato>>{
            @Override
            public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
                return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
            }
        }

        System.out.println("ordem nome");
        Set<Map.Entry<Integer, Contato>> agendaPorNome= new TreeSet<>(new ComparatorNome());
        agendaPorNome.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry:agendaPorNome) {
            System.out.println(entry.getKey()+ " - " +entry.getValue().getNome()+" : "+entry.getValue().getNumero());
        }


        class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        }

        System.out.println("--\tOrdem número telefone\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }
    }
}