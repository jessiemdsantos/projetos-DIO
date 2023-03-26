package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares e a quantidade de números impares.


 */
public class Ex04_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int par = 0;
        int impar = 0;

        System.out.println("Quantidade de vezes que deseja testar: ");
        int numTestes = scan.nextInt();

        do{
            System.out.println("Número: ");
            num = scan.nextInt();

            if (num % 2 == 0) par++;
            else impar++;

            numTestes--;
        }while(numTestes > 0);

        System.out.println("Quantidade de números pares digitados: " + par);
        System.out.println("Quantidade de números ímpares digitados: " + impar);
    }
}
