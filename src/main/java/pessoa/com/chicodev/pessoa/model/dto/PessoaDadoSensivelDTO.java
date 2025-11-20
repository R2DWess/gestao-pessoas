package pessoa.com.chicodev.pessoa.model.dto;

public class PessoaDadoSensivelDTO {

    private String cpf;
    private String rg;
    private String dataNascimento;
    private String localNascimento;

    public PessoaDadoSensivelDTO() {
    }

    public PessoaDadoSensivelDTO(String cpf, String rg, String dataNascimento, String localNascimento) {
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.localNascimento = localNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }
}
