package com.dio.Stream;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {
    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
//        numerosAleatorios.stream().forEach(System.out::println);
        numerosAleatorios.forEach(System.out::println);

        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream().limit(5) //Pegando os 5 primeiros
                .collect(Collectors.toSet()) //colocando no set
                .forEach(System.out::println); //set não vai mostrar numeros repetidos


//        Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet());
//        System.out.println(numerosAleatorios5Primeiros);



      System.out.println("\nTransforme esta lista de String em uma lista de números inteiros.");
        List<Integer> numerosAleatoriosInteiros = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(numerosAleatoriosInteiros);
        //                       ou

//        numerosAleatorios.stream()
 //               .map(Integer::parseInt)
 //              .collect(Collectors.toList())
 //               .forEach(System.out::println);


        System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista:");
//        numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> i % 2 == 0 && i > 2)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("\nMostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

       /* System.out.println("\nRemova os valores ímpares: ");
        numerosAleatoriosInteiros.removeIf(i -> i % 2 != 0);
        System.out.println(numerosAleatoriosInteiros);

        */

//        numerosAleatoriosInteiros.removeIf(i -> (i % 2 != 0));
//        System.out.println(numerosAleatoriosInteiros);

//        Exercícios

        System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatoriosInteiros.stream()
                .skip(3)
                .forEach(System.out::println);


        //contando numeros não repetidos
        long countNumerosUnicos = numerosAleatoriosInteiros.stream()
                .distinct().count();

        System.out.println("\nRetirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);
        System.out.println(numerosAleatoriosInteiros);
        System.out.print("\nMostre o menor valor da lista: ");
        numerosAleatoriosInteiros.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.print("\nMostre o maior valor da lista: ");
        numerosAleatoriosInteiros.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);;

        int somaDosNumerosPares = numerosAleatoriosInteiros.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("\nPegue apenas os números pares e some: " + somaDosNumerosPares);

        System.out.println("\nMostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteiros.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println(numerosOrdemNatural);

        System.out.println("\nAgrupe os valores ímpares múltiplos de 3 ou de 5:");
//
        Map<Object, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteiros.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
    }


}
