package aula20.exemp.Acesso3;

import aula20.exemp.Conta;

public class Principal {
    public static void main(String[] args) {
        aula20.exemp.Acesso3.Conta c1 = new aula20.exemp.Acesso3.Conta("Ana", "123", 10);
        System.out.println("Conta cadastrada com ID: "+c1.getIdentificador);
        aula20.exemp.Acesso3.Conta c2 = new aula20.exemp.Acesso3.Conta("José", "345", 100);
        System.out.println("Conta cadastrada com ID: "+c2.getIdentificador);
        c1.depositar (100);
        c1.sacar (10);
        //não é possível acessar o atributo saldo diretamente
        //c1.saldo = 0;
        System.out.println(c1.saldo());
    }
}
