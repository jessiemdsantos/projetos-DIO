package com.dio.list.exercicio;

import java.util.*;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
public class InvestigandoCrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();
        String resp;

        System.out.println("Responda as perguntas: ");
        System.out.println("Você telefonou para a vítima [S/N]? ");
        resp = scan.next().toUpperCase();
        respostas.add(resp);
        System.out.println("Você esteve no local do crime [S/N]? ");
        resp = scan.next().toUpperCase();
        respostas.add(resp);
        System.out.println("Você mora perto da vítima [S/N]? ");
        resp = scan.next().toUpperCase();
        respostas.add(resp);
        System.out.println("Você devia para a vítima [S/N]? ");
        resp = scan.next().toUpperCase();
        respostas.add(resp);
        System.out.println("Você já trabalhou com a vítima [S/N]? ");
        resp = scan.next().toUpperCase();
        respostas.add(resp);

        System.out.println(respostas);



        int cont = 0;
        Iterator<String> iterator = respostas.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.contains("S")) cont++;
        }
        System.out.println("\nClassificação: ");
        switch (cont){
            case(2):
                System.out.println("Suspeita!");
                break;
            case(3):
            case(4):
                System.out.println("Cúmplice!");
                break;
            case(5):
                System.out.println("Assassina!");
                break;
            default:
                System.out.println("Inocente!");
                break;

        }

    }
}
