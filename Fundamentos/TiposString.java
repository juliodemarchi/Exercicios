package io.github.jiangdequan;

public class TiposString {

    public static void main(String[] args) {
        System.out.println("Ola pessoal".charAt(5));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos Da Silva";
        var idade = 27;
        var salario = 14900.56;

        System.out.printf("O senhor: %s %s tem %d e recebe R$%.2f.", nome, sobrenome, idade, salario);

        System.out.println("Primeiro numero da vida".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 10));

    }

}