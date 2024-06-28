package Aula21.exemploBanco;

public class ContaCorrente extends Conta {
    private float limite;

    public ContaCorrente(String Titular, String Senha, float limite) {
        super(Titular, Senha);
        this.limite = limite;
    }

    public boolean sacar(float valor) {
        if (valor <= Saldo + limite) {
            Saldo -= valor;
            return true;
        }
        return false;
    }

    public String verificaSaldo() {
        String retorno = String.format("Seu saldo é de R$%.2f\n", Saldo);
        if (Saldo >= 0)
            retorno += String.format("Limite disponível %.2f", limite);
        else
            retorno += String.format("Limite disponível %.2f", limite + Saldo);
        return retorno;
    }
}

