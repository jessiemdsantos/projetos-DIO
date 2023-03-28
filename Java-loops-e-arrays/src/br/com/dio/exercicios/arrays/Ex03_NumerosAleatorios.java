package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
armazene-os num vetor. Ao final, mostre os números e seus sucessores.
 */
public class Ex03_NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numeros = random.nextInt(100);
            numerosAleatorios[i] = numeros;
        }
        System.out.println("Numeros Aleatorios: ");
        for (int numero: numerosAleatorios) {
            System.out.println("numero gerado: "+ numero +
                    "; sucessor: " + (numero + 1) +
                    "; antecessor: " + (numero - 1) + ";");
        }

    }
}
