package com.dio.exercicios.quadrilateros;

public class QuadrilateroRetorno {

    public static double area(double lado){

        System.out.print("Área do quadrado: ");
        return lado * lado;
    }

    public static double area(double lado1, double lado2){

        System.out.print("Área do retângulo: ");
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura){

        System.out.print("Área do trapézio: " );
        return ((baseMaior + baseMenor)*altura)/2;
    }

    public float area(float diagonal1, float diagonal2){

        System.out.print("Área do losango: ");
        return diagonal1 * diagonal2;
    }
}
