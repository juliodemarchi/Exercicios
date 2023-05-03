package io.github.jiangdequan;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        System.out.println("Bom");
        System.out.println("dia!\n\n");

        System.out.println("Como foi?");
        System.out.println("como é?");

        System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
        System.out.printf(" Salario: %.1f", 1234.5678);
        System.out.printf(" Nome: %s%n", "João");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("%s %s tem %d anos.%n", nome, sobrenome, idade);

        entrada.close();

    }
}