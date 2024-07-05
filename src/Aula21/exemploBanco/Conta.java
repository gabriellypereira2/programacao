package Aula21.exemploBanco;

import java.util.Random;

public class Conta {
    private String Titular;
    private String Identificador;
    protected float Saldo;
    private String Senha;


    public Conta(String Titular, String Senha) {
        this.Titular = Titular;
        this.Saldo = 0.0f;
        this.Senha = Senha;
        geraIdentificador();
    }

    public void depositar(float valor){
        if(valor > 0){
            Saldo += valor;
        }
    }
    private void geraIdentificador() {
        Random aleatorio = new Random();
        String identificador = "";
        for (int i = 0; i < 4; i++) {
            identificador += (char) aleatorio.nextInt(65, 90);
        }
        identificador += aleatorio.nextInt(1000, 2000);
        this.Identificador = identificador;

    }
    public boolean validaAcesso(String Identificador, String Senha){
        return this.Identificador.equals(Identificador) && this.Senha.equals(Senha);
    }

    public String getTitular() {
        return Titular;
    }

    public void setSenha(String titular) {
        Senha = Senha;
    }

    public void getSenha(String titular) {
        Senha = Senha;
    }

    public String getIdentificador() {return Identificador;}
    }

