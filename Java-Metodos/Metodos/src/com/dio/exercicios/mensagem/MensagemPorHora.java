package com.dio.exercicios.mensagem;

public class MensagemPorHora {

    public static void gerarMensagem(int hora){
        if(hora > 0 && hora < 5){
            System.out.println("São " + hora + " horas! Bom madrugada!");
        }else if (hora < 12){
            System.out.println("São " + hora + " horas! Bom dia!");
        }else if(hora < 18){
            System.out.println("São " + hora + " horas! Boa tarde!");
        }else if (hora <= 23){
            System.out.println("São " + hora + " horas! Boa noite!");
        }else{
            System.out.println("Hora inválida!");
        }
    }
}
