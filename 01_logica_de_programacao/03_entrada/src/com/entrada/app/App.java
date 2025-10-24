package com.entrada.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // instância do objeto leia
        Scanner leia = new Scanner(System.in);

        // declaração de variaveis
        String nome;
        int idade;
        double altura;
        String email;

        // entrada de dados
        System.out.println( "informe seu nome:");
        nome = leia.nextLine();
        System.out.println("informe sua idade");
        idade = leia.nextInt();
        System.out.println("informe sua altura em metros:");
        altura = leia.nextDouble();

        // limpeza de buffer
        leia.nextLine();

        System.out.println("informe seu e-mail:");
        email = leia.nextLine();

        // saída de dados
        System.out.println("Nome: " + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Altura:" + altura + "m");
        System.out.println("Email:" + email);


        // fecha objeto close
        leia.close();


    }
}
