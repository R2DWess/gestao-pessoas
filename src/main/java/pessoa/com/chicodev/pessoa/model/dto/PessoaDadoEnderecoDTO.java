package pessoa.com.chicodev.pessoa.model.dto;

public class PessoaDadoEnderecoDTO {

    private String rua;
    private String numero;
    private String casa;
    private String cidade;
    private String estado;
    private String cep;


    public PessoaDadoEnderecoDTO() {
    }

    public PessoaDadoEnderecoDTO(String rua, String numero, String casa, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.casa = casa;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
