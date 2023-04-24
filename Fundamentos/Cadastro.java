package io.github.jiangdequan;

import javax.sql.rowset.spi.SyncResolver;

public class Cadastro {
    public static void main(String[] args) {

        var a = "Nome: ";
        var Nome = "Antonio Teodoro";
        System.out.println(a + Nome);
        // Nome

        var c = "CPF: ";
        var CPF = "256.236.258.78";
        System.out.println(c + CPF);
        // CPF

        var d = "RG: ";
        var RG = "458956";
        System.out.println(d + RG);
        // RG

        var e = "Data de nascimento: ";
        var Datadenascimento = "25/04/2001";
        System.out.println(e + Datadenascimento);

        var b = "Salario: ";
        double Salario = 23568.89;
        System.out.println(b + Salario);
        // Salario

        var s = "Saldo disponivel: R$";
        double Saldo;
        Saldo = 1203.65;
        System.out.println(s + Saldo);
        // Saldo

    }

}