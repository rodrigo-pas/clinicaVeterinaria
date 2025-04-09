package br.uninter.rodrigo.clinicaveterinaria;

public class Animal {
    private String nome;
    private int idade;
    private String especie;
    private String raca;

    // Construtor
    public Animal(String nome, int idade, String especie, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.raca = raca;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Método para exibir informações do animal
    public String exibirInformacoes() {
        return "Nome: " + nome + ", Idade: " + idade + " anos, Espécie: " + especie + ", Raça: " + raca;
    }
}