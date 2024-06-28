package Aula21.exemploBanco;

import java.util.Scanner;


public class  Banco extends Conta{

    public Banco(String Titular, String Senha) {
        super(Titular, Senha);
    }

    public static String leString(String mensagem){
            Scanner ler = new Scanner(System.in);
            System.out.print(mensagem+": ");
            return ler.nextLine();
        }

        public static float leFloat(String mensagem){
            Scanner ler = new Scanner(System.in);
            System.out.print(mensagem+": ");
            return ler.nextFloat();
        }

        public static ContaCorrente acessaCC(ContaCorrente c1) {
            String opc;
            System.out.println("Acessando a conta "+c1.getIdentificador());
            do{
                System.out.println("Selecione uma opção: ");
                System.out.println("d. depositar");
                System.out.println("s.sacar");
                System.out.println("v. verificar saldo");
                System.out.println("e. sair");
                opc = leString(" ").toLowerCase();
                switch (opc){
                    case "d" -> {
                        float valor = leFloat("Qual o  valor do deposito");
                        c1.depositar(valor);
                        System.out.println("Deposito realizado!");
                    }
                    case "s" -> {
                        float valor = leFloat("Qual o valor que deseja sacar");
                        if (c1.sacar(valor))
                        System.out.println("Saque realizado com sucesso!");
                        else
                            System.out.println("Saldo insuficiente!");
                    }
                    case "v" -> System.out.println(c1.verificaSaldo());
                }
            }
            while(!opc.equals("e"));
            return c1;
        }


        public static ContaPoupanca acessaCP(ContaPoupanca c1){
            String opc;
            System.out.println("Acessando a conta "+c1.getIdentificador());
            do{
                System.out.println("Selecione uma opção: ");
                System.out.println("d. depositar");
                System.out.println("s.sacar");
                System.out.println("v. verificar saldo");
                System.out.println("e. sair");
                opc = leString(" ").toLowerCase();
                switch (opc){
                    case "d" -> {
                        float valor = leFloat("Qual o  valor do deposito");
                        c1.depositar(valor);
                        System.out.println("Deposito realizado!");
                    }
                    case "s" -> {
                        float valor = leFloat("Qual o valor que deseja sacar");
                        if (c1.Sacar(valor))
                            System.out.println("Saque realizado com sucesso!");
                        else
                            System.out.println("Saldo insuficiente!");
                    }
                    case "v" -> System.out.println(c1.verificaSaldo());
                }
            }
            while(!opc.equals("e"));
            return c1;
        }

        public static void main(String[] args) {
            ContaCorrente[] listaCC = new ContaCorrente[20];
            ContaPoupanca[] listaCP = new ContaPoupanca[20];
            int contCC = 0;
            int contCP = 0;
            String opc;
            do{
                System.out.println("Selecione uma opção");
                System.out.println("cc - cadastrar conta corrente");
                System.out.println("cp - cadastrar conta poupança");
                System.out.println("ac - acessar conta corrente");
                System.out.println("ap - acessar conta poupança");
                System.out.println("e - sair");
                opc = leString("");
            }
            while(!opc.equals("e"));
        }
    }


