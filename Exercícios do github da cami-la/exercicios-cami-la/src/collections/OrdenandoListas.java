package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenandoListas {

    public static void ordenandoListas() {
        class Cachorro implements Comparable<Cachorro> {
            String nome;
            String cor;
            int agressividade;

            public String getNome() {
                return nome;
            }

            public String getCor() {
                return cor;
            }

            public int getAgressividade() {
                return agressividade;
            }

            public Cachorro(String nome, String cor, int agressividade) {
                this.nome = nome;
                this.cor = cor;
                this.agressividade = agressividade;
            }


            @Override
            public String toString() {
                return "{" +
                        "nome='" + nome + '\'' +
                        ", cor='" + cor + '\'' +
                        ", agressividade=" + agressividade +
                        '}';
            }

            @Override
            public int compareTo(Cachorro cachorro) {
                return this.getNome().compareToIgnoreCase(cachorro.getNome());
            }
        }
        List<Cachorro> meusCaes = new ArrayList<>() {{
            add(new Cachorro("Lady", "amarelo", 2));
            add(new Cachorro("Dreck", "preto", 5));
            add(new Cachorro("John", "preto", 1));
            add(new Cachorro("Toby", "branco", 8));
            add(new Cachorro("Mara", "marrom", 16));
        }};

        class ComparatorAgressividade implements Comparator<Cachorro> {
            @Override
            public int compare(Cachorro o1, Cachorro o2) {
                return Integer.compare(o1.getAgressividade(), o2.getAgressividade());
            }
        }

        class ComparatorCor implements Comparator<Cachorro>{
            @Override
            public int compare(Cachorro o1, Cachorro o2) {
               return o1.getCor().compareToIgnoreCase(o2.getCor());
            }
        }

        class ComparatorNomeAgressividadeCor implements Comparator<Cachorro>{
            @Override
            public int compare(Cachorro o1, Cachorro o2) {
                int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
                if (nome != 0) return nome;

                int agressividade = (Integer.compare(o1.getAgressividade(), o2.getAgressividade()));
                if (agressividade != 0 ) return agressividade;

                return o1.getCor().compareToIgnoreCase(o2.getCor());
            }
        }

        System.out.println("Ordemde inserção: ");
        System.out.println(meusCaes+"\n");

        System.out.println("Ordem aleatória: ");
        Collections.shuffle(meusCaes);
        System.out.println(meusCaes+"\n");

        System.out.println("Ordem natural: ");
        Collections.sort(meusCaes);
        System.out.println(meusCaes+"\n");

        System.out.println("Ordem de agressividade :");
        Collections.sort(meusCaes, new ComparatorAgressividade());// para usr o comparator tenho que criar uma classe
        //meusCaes.sort(new ComparatorAgressividade()); - esta opção usa o método sort da propria list, inves de chamar do collections
        System.out.println(meusCaes+"\n");

        System.out.println("Ordem de cor: ");
        meusCaes.sort(new ComparatorCor());
        System.out.println(meusCaes+"\n");

        System.out.println("Ordem por Nome/agressividade/cor");
        meusCaes.sort(new ComparatorNomeAgressividadeCor());
        System.out.println(meusCaes);

    }
}




