package br.uninter.rodrigo.clinicaveterinaria;

public class Dono {
    private String nome;
    private String telefone;
    private String endereco;

    // Construtor
    public Dono(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método para exibir as informações do dono
    public String exibirInformacoes() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Endereço: " + endereco;
    }
}