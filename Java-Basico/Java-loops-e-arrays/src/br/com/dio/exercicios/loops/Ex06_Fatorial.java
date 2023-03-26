package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
 */
public class Ex06_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número: ");
        int num = scan.nextInt();
        int fatorial = 1;

        System.out.print(num+"! = ");
        for(int i = num; i > 1; i--){
            fatorial *= i ;
            System.out.print(i + " * ");
        }
        System.out.print("1 = " + fatorial);
    }
}
