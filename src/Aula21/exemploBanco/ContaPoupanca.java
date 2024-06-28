package Aula21.exemploBanco;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String Titular, String Senha, float deposito) {
        super(Titular, Senha);
        Saldo = deposito;
    }

    public boolean Sacar(float valor){
        if (Saldo>= valor){
            Saldo -= valor;
            return true;
        }
        return false;
    }

    public String verificaSaldo(){
        return String.format("Seu saldo é de R$%.2f", Saldo);
    }


}
