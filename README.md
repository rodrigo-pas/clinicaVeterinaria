# 🐾 Clínica Veterinária em Java
Este é um projeto de um sistema simples para gerenciamento de uma clínica veterinária, desenvolvido em Java. A aplicação permite o cadastro de animais, donos, veterinários e consultas, e também permite listar as consultas realizadas.

💻 **Tecnologias utilizadas**
- Java 8 ou superior

⚙️ **Funcionalidades**
- **Cadastrar Animal**: Permite o cadastro de um animal com nome, idade, espécie e raça.
- **Cadastrar Dono**: Cadastra o dono do animal com nome, telefone e endereço.
- **Cadastrar Veterinário**: Cadastra o veterinário com nome e especialidade.
- **Cadastrar Consulta**: Registra uma consulta associando um animal, um veterinário, e a data da consulta.
- **Listar Consultas**: Exibe todas as consultas registradas na clínica.

▶️ **Como executar**
Clone este repositório ou copie o código-fonte.

1. Compile os arquivos `.java`:
```bash
javac -d . br/uninter/rodrigo/clinicaveterinaria/*.java
```

2. Execute o programa com o comando:
```bash
java br.uninter.rodrigo.clinicaveterinaria.Principal
```

# **📝 Exemplo de uso**

Após iniciar o programa, o menu principal será exibido. Aqui está um exemplo de como você pode interagir com o sistema:
```bash
Menu Principal:
1. Cadastrar Animal
2. Cadastrar Veterinário
3. Cadastrar Dono
4. Cadastrar Consulta
5. Listar Consultas
6. Sair

Escolha uma opção: 1
Digite o nome do animal: Rex
Digite a idade do animal: 5
Digite a espécie do animal: Cachorro
Digite a raça do animal: Labrador

Escolha uma opção: 2
Digite o nome do veterinário: Dr. João
Digite a especialidade do veterinário: Clínica Geral

Escolha uma opção: 3
Digite o nome do dono: Maria Silva
Digite o telefone do dono: (11) 99999-9999
Digite o endereço do dono: Rua das Flores, 123

Escolha uma opção: 4
Digite o nome do animal para a consulta: Rex
Digite o nome do veterinário para a consulta: Dr. João
Digite a data da consulta: 09/04/2025
Digite a descrição da consulta: Consulta de rotina

Escolha uma opção: 5
Lista de Consultas:
Consulta 1:
Animal: Rex
Veterinário: Dr. João
Data: 09/04/2025
Descrição: Consulta de rotina
```
# 📌 Observações
- O sistema funciona de forma simples, permitindo cadastrar e listar informações relacionadas a animais, donos, veterinários e consultas.
- O código está estruturado em pacotes, e cada classe tem uma responsabilidade específica.
- Para rodar o sistema, é necessário ter o **Java 8 ou superior** instalado.