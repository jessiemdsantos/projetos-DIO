package br.com.dio.exercicios.arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
 */
public class Ex01_OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = {12, 34, 13, 16, 54, 10};

        System.out.println("Vetor Inverso: ");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

    }
}
