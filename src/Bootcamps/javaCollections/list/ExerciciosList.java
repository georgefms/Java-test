package list;

import java.util.*;

public class ExerciciosList {
    public static void main(String[] args) {
        //Criar uma lista e adicionar 7 notas
        List<Double> notas = new ArrayList<>();

        notas.add(10d);
        notas.add(8.5);
        notas.add(6.2);
        notas.add(7d);
        notas.add(8.2);
        notas.add(6d);
        notas.add(3.2);

        System.out.println(notas.toString());
        // Exibir a nota na quinta posição
        System.out.println("A posição da nota 6.2 é: " +notas.indexOf(6.2));
        // Adicionar uma nota na posição 3 da lista
        notas.add(3, 7.5);
        System.out.println(notas.toString());
        // Substituir a nota 3.2 por 5
        notas.set(notas.indexOf(3.2), 5d);
        System.out.println(notas.toString());
        //Conferir se um elemento está na lista
        System.out.println("a Nota 6 está presente na lista? " + notas.contains(6d));
        // Exibir as ordens na ordem de adição:
        //Por ser uma lista o print já vem na ordem
        System.out.println(notas);
        //Nota na terceira posição
        System.out.println("Nota na terceira posição "+notas.get(2));
        //menor valor dentro das listas
        System.out.println("Menor nota entre as notas +"+ Collections.min(notas));
        //maior valor dentro das listas
        System.out.println("Maior nota entre as notas +"+ Collections.max(notas));
        //somarando o valor das notas
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma das notas é: "+soma);
        //Media das notas
        System.out.println("A media das notas é: "+(soma/notas.size()));
        //removendo notas menores que 7 e print
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

    }
}
