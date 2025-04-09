package br.uninter.rodrigo.clinicaveterinaria;

public class Veterinario {
    private String nome;
    private String especialidade;

    // Construtor
    public Veterinario(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // Método para exibir as informações do veterinário
    public String exibirInformacoes() {
        return "Nome: " + nome + ", Especialidade: " + especialidade;
    }
}