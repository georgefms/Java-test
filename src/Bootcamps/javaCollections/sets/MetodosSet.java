package sets;

import java.util.*;

public class MetodosSet {
    public static void main(String[] args) {
        //Iniciando um Set
        Set<Double> notas = new HashSet<>(Arrays.asList(8.5, 7d, 6.5, 6d, 9d, 5.5, 0d));
        System.out.println(notas.toString());
        //Exibir a posicao de algo especifico
        //set não tem essa posicoes
        //Conferir se uma nota está no conjunto
        System.out.println("A nota 6.5 está no conjunto? "+ notas.contains(6.5));
        //Valor minimo
        System.out.println("A menor nota presente é: "+ Collections.min(notas));
        //Valor máximo
        System.out.println("A maior nota presente é: "+ Collections.max(notas));
        //Soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("A soma dos valores é :" + soma);
        System.out.println("A média é: "+soma/notas.size());
        //Remover elemento
        notas.remove(0d);
        System.out.println(notas);
        //remover valores menores que 7
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println("Removi menores que 7: "+notas);
        //Set usando a ordem de inserção
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(3.5);
        notas2.add(9d);
        notas2.add(2.5);
        notas2.add(6.5);
        notas2.add(4d);
        System.out.println(notas2.toString());
        //Ordem crescente:
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("Ordem natural dos elementos: "+notas3);
        //Limpar uma lista
        notas.clear();
        //isEmpty?
        System.out.println("O conjunto 1 está vazio?"+notas.isEmpty());


    }
}
