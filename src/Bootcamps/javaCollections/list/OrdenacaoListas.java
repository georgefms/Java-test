package list;

import java.util.*;

public class OrdenacaoListas {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jooj", 12, "preto"));
            add(new Gato("gato", 6, "laranja"));
            add(new Gato("jooj", 10, "azul"));
        }};
        //Print em ordem de inserção
        System.out.println("Inserção: " + meusGatos);
        //Print aleatorio
        Collections.shuffle(meusGatos);
        System.out.println("Aleatório: " + meusGatos);
        //Em ordem natural(nome)
        Collections.sort(meusGatos);
        System.out.println("Por nome: " + meusGatos);
        //Em ordem de idade
        meusGatos.sort(new ComparatorIdade());
        System.out.println("por idade: " + meusGatos);
        //Em ordem de cor
        meusGatos.sort(new ComparatorCor());
        System.out.println("por Cor: " + meusGatos);


    }
    static class Gato implements Comparable<Gato>{
        private final String nome;
        private final Integer idade;
        private final String cor;

        public Gato(String nome, Integer idade, String cor) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        public String getNome() {
            return nome;
        }

        public Integer getIdade() {
            return idade;
        }

        public String getCor() {
            return cor;
        }

        @Override
        public String toString() {
            return "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", cor='" + cor + '\'';
        }

        @Override
        public int compareTo(Gato gato) {
            return this.getNome().compareToIgnoreCase(gato.getNome());
        }
    }
    static class ComparatorIdade implements Comparator<Gato> {

        @Override
        public int compare(Gato g1, Gato g2) {
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }

    static class ComparatorCor implements Comparator<Gato> {

        @Override
        public int compare(Gato g1, Gato g2) {
            return g1.getCor().compareToIgnoreCase(g2.getCor());
        }
    }

}
