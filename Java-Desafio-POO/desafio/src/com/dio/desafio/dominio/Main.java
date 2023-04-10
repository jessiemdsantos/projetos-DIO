package com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do curso de javascript");
        curso2.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

/*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

 */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Jessica");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " +dev1.getNome()+ ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println(" ");
        System.out.println("XP = " + dev1.calcularTotoalXP());
        System.out.println("Conteúdos Inscritos de " +dev1.getNome()+ ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " +dev1.getNome()+ ": " + dev1.getConteudosConcluidos());

        System.out.println("\n----------------------------------------- ");
        Dev dev2 = new Dev();
        dev2.setNome("Melissa");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " +dev2.getNome()+ ": " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println(" ");
        System.out.println("XP = " + dev2.calcularTotoalXP());
        System.out.println("Conteúdos Inscritos de " +dev2.getNome()+ ": " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " +dev2.getNome()+ ": " + dev2.getConteudosConcluidos());
    }
}
