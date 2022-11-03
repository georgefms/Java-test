package sets;

import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {
        //ordem aleatoria:
        Set<Serie> minhasSeries = new HashSet<>(){{
           add(new Serie("B99", "Sitcon", 60));
           add(new Serie("HOTD", "Fantasia", 60));
           add(new Serie("GoT", "Fantasia", 60));
        }};
        System.out.println("Aleatorio:");
        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome() +" - "+
                    serie.genero + " - " +
                    serie.duracaoEp);
        }
        //Ordem insercao:
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("B99", "Sitcon", 60));
            add(new Serie("HOTD", "Fantasia", 60));
            add(new Serie("Blue Lock", "Anime", 25));
        }};
        System.out.println("Ordem de insercao:");
        for (Serie serie: minhasSeries1) {
            System.out.println(serie.getNome() +" - "+
                    serie.genero + " - " +
                    serie.duracaoEp);
        }
        //Ordem natural: tempo de EP
        System.out.println("Por tempo de EP");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) {
            System.out.println(serie.getNome() +" - "+
                    serie.genero + " - " +
                    serie.duracaoEp);
        }


    }
    static class Serie implements Comparable<Serie>{
        private String nome;
        private String genero;
        private Integer duracaoEp;

        public Serie(String nome, String genero, Integer duracaoEp) {
            this.nome = nome;
            this.genero = genero;
            this.duracaoEp = duracaoEp;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getDuracaoEp() {
            return duracaoEp;
        }

        @Override
        public String toString() {
            return "Serie: {" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", duracaoEp=" + duracaoEp +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Serie series = (Serie) o;
            return nome.equals(series.nome) && genero.equals(series.genero) && duracaoEp.equals(series.duracaoEp);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, duracaoEp);
        }


        @Override
        public int compareTo(Serie serie) {
            int tempoEpisodio = Integer.compare(this.getDuracaoEp(), serie.getDuracaoEp());
            if (tempoEpisodio != 0) return tempoEpisodio;
            return this.getGenero().compareTo(serie.getGenero());
        }
    }
}
