package io.github.jiangdequan;

public class TiposPrimitivosNumeros {

    public static void main(String[] args) {

        double a = 1; // implicita
        System.out.println(a);

        float b = (float) 1.258753951456; // explicita ST
        System.out.println(b);

        int c = 340;
        byte d = c;
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e;
        System.out.println(f);

    }

}