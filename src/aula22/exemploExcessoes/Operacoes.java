package aula22.exemploExcessoes;

public class Operacoes {
    public int divide(int n1, int n2) throws ArithmeticException{ //pode lançar
        if(n2==0){
            throw new ArithmeticException("Não pode dividir por zero"); //está lançando
        }
        return n1/n2;
    }
}
