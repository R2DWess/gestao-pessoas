package pessoa.com.chicodev.pessoa.model.dto;

public class PessoaDadoContatoDTO {

    private String telefone;
    private String email;

    public PessoaDadoContatoDTO() {
    }

    public PessoaDadoContatoDTO(String telefone, String email) {
        this.telefone = telefone;
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
