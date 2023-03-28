package br.com.dio.exercicios.arrays;

/* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).

 */
import java.util.Random;

public class Ex04_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i=0; i < M.length;i++ ){
            for(int j =0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        for (int[] linha: M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
