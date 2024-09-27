package TrabalhoHospital;
import TrabalhoHospital.Atendimento;
import TrabalhoHospital.Paciente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaConsultaMedica {
    private ArrayList<Paciente> pacientes;

    public SistemaConsultaMedica(){
        this.pacientes = new ArrayList<>();
    }

    public void incluirPaciente(String nome, String sobrenome, LocalDate dataNascimento){
        Paciente paciente = new Paciente(nome, sobrenome, dataNascimento);
        pacientes.add(paciente);
        System.out.println("Paciente incluídi com sucesso!");
    }

    public void alterarPaciente(String nome, String sobrenome, LocalDate novaDataNascimento){
        for(Paciente paciente : pacientes){
            if(paciente.getNome().equals(nome) && paciente.getSobrenome().equals(sobrenome) && paciente.isAtivo()){
                paciente.setDataNascimento(novaDataNascimento);
                System.out.println("Data de nascimento alterada com sucesso!");
                return;
            }
        }
        System.out.println("Paciente não encontrado ou inativo!");
        return;
    }

    public void realizarAtendimento(String nome, String sobrenome, LocalDate data, String descricao){
        for(Paciente paciente: pacientes){
            if(paciente.getNome().equals(nome) && paciente.getSobrenome().equals(sobrenome) && paciente.isAtivo()){
                Atendimento atendimento = new Atendimento(data, descricao);
                paciente.adicionarAtendimento(atendimento);
                System.out.println("Atendimento registrado com sucesso!");
                return;
            }
        }
        System.out.println("Paciente não encontrado ou inativo!");
    }
}
