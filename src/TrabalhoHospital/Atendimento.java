package TrabalhoHospital;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Atendimento {
    private LocalDate data;
    private String descricao;

    public Atendimento(LocalDate data, String descricao){
        this.data = data;
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(){
        this.descricao = descricao;
    }

    public String tostring(){
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatoBr.format(this.data);
        return "Data: " + dataFormatada + "\nInformações: " + descricao;
    }

}
