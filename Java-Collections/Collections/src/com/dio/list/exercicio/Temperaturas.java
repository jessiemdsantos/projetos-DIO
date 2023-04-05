package com.dio.list.exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
public class Temperaturas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperatura = new ArrayList<>();


        double soma = 0.0;
        double mediaSemestral;

        for(int i = 1; i <= 6; i++){
            System.out.println("Digite a média da temperatura do mês "+ i +": ");
            double temp = scan.nextDouble();
            temperatura.add(temp);
            soma += temp;
        }
        mediaSemestral = soma / 6;
        System.out.println(temperatura);
        System.out.println("\nMedia da temperatura semestral:\n" + String.format("%.1f", mediaSemestral));
        System.out.println("\nTemperaturas acima desta média:");


        int cont = 0;
        Iterator<Double> iterator = temperatura.iterator();
        while(iterator.hasNext()) {
            Double next = iterator.next();
            if(next > mediaSemestral) {
                switch (cont){
                    case(0):
                        System.out.println("1 - Janeiro. Média deste mês: " + next);
                        break;
                    case(1):
                        System.out.println("2 - Fevereiro. Média deste mês: " + next);
                        break;
                    case(2):
                        System.out.println("3 - Março. Média deste mês: " + next);
                        break;
                    case(3):
                        System.out.println("4 - Abril. Média deste mês: " + next);
                        break;
                    case(4):
                        System.out.println("5 - Maio. Média deste mês: " + next);
                        break;
                    case(5):
                        System.out.println("6 - Junho. Média deste mês: " + next);
                        break;
                    default:
                        System.out.println("Não houve nenhuma temperatura acima da média semestral");
                }
            }
            cont++;
        }




    }
}
