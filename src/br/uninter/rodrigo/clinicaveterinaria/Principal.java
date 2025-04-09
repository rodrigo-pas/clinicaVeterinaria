package br.uninter.rodrigo.clinicaveterinaria;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Criação de objetos de exemplo
        Scanner scanner = new Scanner(System.in);

        // Criação da clínica
        ClinicaVeterinaria clinica = new ClinicaVeterinaria("Clínica Veterinária XYZ");

        // Menu interativo
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Animal");
            System.out.println("2. Cadastrar Veterinário");
            System.out.println("3. Cadastrar Dono");
            System.out.println("4. Cadastrar Consulta");
            System.out.println("5. Listar Consultas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer de nova linha após nextInt()

            switch (opcao) {
                case 1: // Cadastrar Animal
                    System.out.print("Digite o nome do animal: ");
                    String nomeAnimal = scanner.nextLine();
                    System.out.print("Digite a idade do animal: ");
                    int idadeAnimal = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite a espécie do animal: ");
                    String especieAnimal = scanner.nextLine();
                    System.out.print("Digite a raça do animal: ");
                    String racaAnimal = scanner.nextLine();
                    
                    // Criar um novo Animal
                    Animal novoAnimal = new Animal(nomeAnimal, idadeAnimal, especieAnimal, racaAnimal);
                    clinica.adicionarAnimal(novoAnimal);
                    System.out.println("Animal cadastrado com sucesso!");
                    break;

                case 2: // Cadastrar Veterinário
                    System.out.print("Digite o nome do veterinário: ");
                    String nomeVet = scanner.nextLine();
                    System.out.print("Digite a especialidade do veterinário: ");
                    String especialidadeVet = scanner.nextLine();
                    
                    // Criar um novo Veterinário
                    Veterinario novoVeterinario = new Veterinario(nomeVet, especialidadeVet);
                    clinica.adicionarVeterinario(novoVeterinario);
                    System.out.println("Veterinário cadastrado com sucesso!");
                    break;

                case 3: // Cadastrar Dono
                    System.out.print("Digite o nome do dono: ");
                    String nomeDono = scanner.nextLine();
                    System.out.print("Digite o telefone do dono: ");
                    String telefoneDono = scanner.nextLine();
                    System.out.print("Digite o endereço do dono: ");
                    String enderecoDono = scanner.nextLine();
                    
                    // Criar um novo Dono
                    Dono novoDono = new Dono(nomeDono, telefoneDono, enderecoDono);
                    clinica.adicionarDono(novoDono);
                    System.out.println("Dono cadastrado com sucesso!");
                    break;

                case 4: // Cadastrar Consulta
                    // Exemplo de como cadastrar uma consulta
                    System.out.print("Digite o nome do animal para a consulta: ");
                    String nomeAnimalConsulta = scanner.nextLine();
                    Animal animalConsulta = clinica.buscarAnimal(nomeAnimalConsulta);
                    
                    if (animalConsulta == null) {
                        System.out.println("Animal não encontrado.");
                        break;
                    }

                    System.out.print("Digite o nome do veterinário para a consulta: ");
                    String nomeVetConsulta = scanner.nextLine();
                    Veterinario vetConsulta = clinica.buscarVeterinario(nomeVetConsulta);
                    
                    if (vetConsulta == null) {
                        System.out.println("Veterinário não encontrado.");
                        break;
                    }

                    System.out.print("Digite a data da consulta: ");
                    String dataConsulta = scanner.nextLine();
                    System.out.print("Digite a descrição da consulta: ");
                    String descricaoConsulta = scanner.nextLine();

                    // Criar nova consulta
                    Consulta novaConsulta = new Consulta(animalConsulta, vetConsulta, dataConsulta, descricaoConsulta);
                    clinica.adicionarConsulta(novaConsulta);
                    System.out.println("Consulta cadastrada com sucesso!");
                    break;

                case 5: // Listar Consultas
                    clinica.listarConsultas();
                    break;

                case 6: // Sair
                    System.out.println("Saindo...");
                    scanner.close();
                    return;  // Finaliza o loop e sai do método main
                
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
