package br.uninter.rodrigo.clinicaveterinaria;

import java.util.ArrayList;
import java.util.List;

public class ClinicaVeterinaria {
    private String nome;
    private List<Animal> animais;
    private List<Veterinario> veterinarios;
    private List<Consulta> consultas;
    private List<Dono> donos;

    public ClinicaVeterinaria(String nome) {
        this.nome = nome;
        this.animais = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
        this.consultas = new ArrayList<>();
        this.donos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void adicionarVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario);
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    // Método para adicionar um dono
    public void adicionarDono(Dono dono) {
        donos.add(dono);
    }

    // Método para buscar um animal
    public Animal buscarAnimal(String nome) {
        for (Animal animal : animais) {
            if (animal.getNome().equalsIgnoreCase(nome)) {
                return animal;
            }
        }
        return null; // Caso não encontre o animal
    }

    // Método para buscar um veterinário
    public Veterinario buscarVeterinario(String nome) {
        for (Veterinario veterinario : veterinarios) {
            if (veterinario.getNome().equalsIgnoreCase(nome)) {
                return veterinario;
            }
        }
        return null; // Caso não encontre o veterinário
    }

    // Método para listar todas as consultas
    public void listarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("Não há consultas registradas.");
        } else {
            System.out.println("Consultas registradas:");
            for (Consulta consulta : consultas) {
                System.out.println("Animal: " + consulta.getAnimal().getNome() + ", Veterinário: " + consulta.getVeterinario().getNome() +
                        ", Data: " + consulta.getData() + ", Descrição: " + consulta.getDescricao());
            }
        }
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public List<Dono> getDonos() {
        return donos;
    }
}