package aula22.exemploPolimorfismo;

public class Teste {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        System.out.println("Somando dois números "+op.soma(5,7));
        System.out.println("Somando tres números"+op.soma(7,2,1));
        System.out.println("somando duas Strings"+op.soma("Palavra","teste"));
    }
}
