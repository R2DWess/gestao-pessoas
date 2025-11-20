package pessoa.com.chicodev.pessoa.model.resource;

public class PessoaDadoSenvivelResource {

    private String cpf;
    private String rg;
    private String dataNascimento;
    private String localNascimento;

    public PessoaDadoSenvivelResource() {

    }

    public PessoaDadoSenvivelResource(String cpf, String rg) {

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
