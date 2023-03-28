package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */
public class Ex03_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int maior = 0;
        double total = 0;
        int cont = 0;

        do{
            System.out.println("Numero: ");
            num = scan.nextInt();
            if (num > maior){
                maior = num;
            }
            total += num;
            cont++;

        } while(cont < 5);

        System.out.println("Maior número digitado: " + maior);
        System.out.println("Média dos números: " + total/5);




    }
}
