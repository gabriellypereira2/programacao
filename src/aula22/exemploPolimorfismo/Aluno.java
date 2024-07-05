package aula22.exemploPolimorfismo;

public class Aluno extends Pessoa {
    private String Matricula;

    public String getMatricula() {return Matricula;}

    public void setMatricula(String matricula) {this.Matricula = matricula;}

    public String obterDados(){
        return "Nome: "+getNome()+" Sobrenome: "+getSobrenome()+" Matrícula: "+getMatricula();
    }

}
