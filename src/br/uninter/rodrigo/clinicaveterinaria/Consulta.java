package br.uninter.rodrigo.clinicaveterinaria;

public class Consulta {
    private Animal animal;
    private Veterinario veterinario;
    private String data;
    private String descricao;

    // Construtor
    public Consulta(Animal animal, Veterinario veterinario, String data, String descricao) {
        this.animal = animal;
        this.veterinario = veterinario;
        this.data = data;
        this.descricao = descricao;
    }

    // Getters e Setters
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método para exibir as informações da consulta
    public String exibirInformacoes() {
        return "Consulta - Animal: " + animal.getNome() + ", Veterinário: " + veterinario.getNome() +
                ", Data: " + data + ", Descrição: " + descricao;
    }
}