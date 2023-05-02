package io.github.jiangdequan;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLorweCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());

    }
}