package TrabalhoHospital;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Paciente {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private ArrayList<Atendimento> atendimentos;
    private boolean ativo;

    public Paciente(String nome, String sobrenome, LocalDate dataNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.atendimentos = new ArrayList<>();
        this.ativo = true;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Atendimento> getAtendimentos(){
        return atendimentos;
    }

    public void adicionarAtendimento(Atendimento atendimento){
        atendimentos.add(atendimento);
    }

    public int getIdade(){
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimento, dataAtual).getYears();
    }

    public boolean isAtivo(){
        return ativo;
    }

    public void desativar(){
        this.ativo = false;
    }

    public boolean equals(Object obj){
        if (this == obj) return true;
        if(!(obj instanceof Paciente)) return false;
        Paciente other = (Paciente) obj;
        return this.nome.equals(other.nome);
    }

    public String toString(){
        return "Nome: " + nome + " " + sobrenome + ", Data de Nascimento: " + dataNascimento + ", Idade: " + getIdade() + ", Ativo: " + ativo;
    }
}
