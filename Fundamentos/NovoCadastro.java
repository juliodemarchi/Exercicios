package io.github.jiangdequan;

public class Cadastro1.0
{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

        entrada.close();

    }

}