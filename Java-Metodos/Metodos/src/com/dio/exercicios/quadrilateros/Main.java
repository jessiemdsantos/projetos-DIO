package com.dio.exercicios.quadrilateros;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sem return");
        Quadrilatero.area(5);
        Quadrilatero.area(5d, 8d);
        Quadrilatero.area(12, 4, 5);
        Quadrilatero.area(5f, 5f);

        System.out.println("\nCom return");
        System.out.print(QuadrilateroRetorno.area(5)+ "\n");
        System.out.print(QuadrilateroRetorno.area(5d, 8d)+ "\n");
        System.out.print(QuadrilateroRetorno.area(12, 4, 5)+ "\n");
        System.out.print(QuadrilateroRetorno.area(5.0, 5f)+ "\n");
    }
}
