package com.dio.exercicios.polimorfismo;

public class Main {

    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[] {
                new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes){
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        // aqui não teve polimorfismo, e sim sobrescrita pura
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();

    }
}
