import java.time.LocalDateTime;
import java.util.UUID;

public class Atendimento {
    private UUID id;
    private Aluno aluno;
    private LocalDateTime dataAtendimento;
    private String descricao;
    private Status status;

    public Atendimento(Aluno aluno, String descricao, Status status) {
        this.aluno = aluno;
        this.dataAtendimento = LocalDateTime.now();
        this.descricao = descricao;
        this.status = status;
        this.id = UUID.randomUUID();

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public LocalDateTime getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDateTime dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Atendimento{ " +
                " Id: " + id +
                " Aluno:{ " + aluno +" }\n"+
                " Data Atendimento: " + dataAtendimento +
                " Descricao: " + descricao +
                " Status: " + status+" }";
    }
}
