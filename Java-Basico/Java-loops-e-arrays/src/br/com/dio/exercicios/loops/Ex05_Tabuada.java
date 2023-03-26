package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 O usuário deve informar de qual numero ele deseja ver a tabuada.
 A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
 */
public class Ex05_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre 1 e 10, qual tabuada deseja ver? ");
        int num = scan.nextInt();

        while (num < 1 || num > 10){
            System.out.println("Número invalido, tente novamente! \nEntre 1 e 10, qual tabuada deseja ver? ");
            num = scan.nextInt();
        }
        System.out.println("\nTabuada do " + num);
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }


    }
}
