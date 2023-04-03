package com.dio.exercicios.calculadora;

public class Calculadora {
    public static void somar(double num1, double num2){
        double resultado = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + resultado);

    }
    public static void subtrair(double num1, double num2){
        double resultado = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + resultado);

    }
    public static void multiplicar(double num1, double num2){
        double resultado = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + resultado);

    }
    public static void dividir(double num1, double num2){
        double resultado = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + resultado);

    }

}
