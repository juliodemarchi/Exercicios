package io.github.jiangdequan;

import javax.management.MBeanAttributeInfo;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {

        String s = new String("Descrição");
        s.toUpperCase();

        // Wrappers
        int a = 123;
        System.out.println(a);

    }

}