package Aula21.exemploBanco;

public class Principal extends Conta {
    public Principal(String Titular, String Senha) {
        super(Titular, Senha);
    }

    public static void main (String[] args){
        ContaCorrente cc = new ContaCorrente("João", "1234", 500.0f);
        cc.depositar(1000.0f);
        System.out.println(cc.verificaSaldo());
        cc.sacar(1200.0f);
        System.out.println(cc.verificaSaldo());

        ContaPoupanca cp = new ContaPoupanca("Maria", "5678", 1000.0f);
        System.out.println(cp.verificaSaldo());
        cp.Sacar(500.0f);
        System.out.println(cp.verificaSaldo());

        System.out.println(cc.validaAcesso(cc.getIdentificador(), "1234"));
        System.out.println(cp.validaAcesso(cp.getIdentificador(), "5678"));
    }
}

