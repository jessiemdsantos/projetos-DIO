package com.dio.exercicios.UpcastDowncast;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //upcast - conceito a ser usado, inclusive ajuda muito na questão do polimorfismo
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //downcast - conceito a ser evitado, pois pode ocorrer perda de informação
       // Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}
