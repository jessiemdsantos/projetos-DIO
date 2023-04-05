package com.dio.list;

import java.util.*;
public class Exemplo {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        //      List notas = new ArrayList(); //antes do java 5
        //      List<Double> notas = new ArrayList<>(); // Generics
        //      ArrayList<Double> notas = new ArrayList<>();

        //      List<Double> notas = new ArrayList<> (Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
                /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
                notas.add(10d);
                System.out.println(notas); essa operação não permite adicionar ou remover*/

                /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
                notas.add(1d);
                notas.remove(5d);
                System.out.println(notas); lista imutavel, essa operação não permite adicionar ou remover*/

        // Criando e adicionando itens na lista
        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        // Exibindo o index de um item na lista
        System.out.println("Exiba a posição da nota 5.0: Posição " + notas.indexOf(5d) + ".");

        // Adicionando um item em uma posição especifica na lista
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        // Substituindo um item da lista por outro
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        // verificando se item existe na lista
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        //Exibir itens na ordem de inserção, aqui como é um List, isso já é automatico
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);

        // exebindo o item pelo index
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        // menor e maior item da lista
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator(); //atalho ctrl + alt + v
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        // remover item da lista
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        //remover item da posição da lista
        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        /*System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        */
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


        System.out.println("\n---- Agora com LinkedList ----\n");
        //Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println("Crie uma lista chamada notas2\n" +
                        "e coloque todos os elementos da list Arraylist nessa nova lista:\n" + notas2);
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo:\n" + notas2.get(0));
        System.out.println("Lista atualizada:\n" + notas2);
        System.out.println("Mostre a primeira nota da nova lista removendo-o:\n" +notas2.pop());
        System.out.println("Lista atualizada:\n" + notas2);



    }

}
