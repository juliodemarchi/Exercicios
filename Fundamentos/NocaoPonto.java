package io.github.jiangdequan;

public class NocaoPonto {

    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.replace("X", "Senhora! Tudo bem? Isso e um assalto");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
        System.out.println(y);
        // string pode ser repetida

        // Tipos primitivos não tem o operador "."
        int a = 3;
        System.out.println(a);

    }

}