package aula20.exemp.heranca;

public class Engenheiro extends Funcionario{

    public Engenheiro(String nome, String sobrenome, int matricula, String number){
        super(nome, sobrenome, matricula);
    }
    private String crea;

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
}

