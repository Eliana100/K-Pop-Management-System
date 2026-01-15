# K-Pop Management System (Java | POO)

Projeto em Java desenvolvido para praticar Programação Orientada a Objetos (POO), com foco em modelagem de domínio, encapsulamento e validação de regras de negócio. 
Simulando o sistema de gerenciamento de agências e bandas de K-pop.

---

## Índice

- [Descrição](#descrição)
- [Estrutura das Classes](#estrutura-das-classes)
 - [Membro](#membro)
 - [Manager](#manager)
 - [Banda](#banda)
- [Regras de Negócio](#regras-de-negócio-validações)
- [Como Rodar o Projeto](#como-rodar-o-projeto)
 - [Pré-requisitos](#pré-requisitos)
 - [Execução](#execução)
- [Exemplo de Saída](#exemplo-de-saída)

---


## Descrição

Este sistema permite gerenciar as principais entidades do universo K-pop: **Membros**, **Managers** e **Bandas**. O foco principal é a aplicação de conceitos como encapsulamento, listas de objetos e validações de regras de negócio.

O projeto tem caráter educacional, mas segue princípios que podem ser reaproveitados em sistemas maiores.
<br>

## Estrutura das Classes

O projeto é composto por três classes principais:

### Membro
Representa os artistas (idols) que compõem a banda.

Principais informações:
- Nome
- Idade
- Cargo
- Salário
- Status de contrato

---

### Manager
Representa o gestor responsável pela banda.

Principais informações:
- Nome
- Idade
- Salário
- Anos de experiência

---

### Banda
Classe central do sistema, responsável por agregar membros e manager.

Responsabilidades:
- Manter a lista de membros
- Associar um manager responsável
- Calcular a média de idade dos integrantes
- Exibir todas as informações da banda

---

## Regras de Negócio (Validações)

O sistema garante a integridade dos dados através das seguintes regras:
* **Idade do Membro**: Deve ser maior que 0.
* **Idade do Manager**: Deve ser maior que 18 anos.
* **Financeiro**: Salários não podem ser valores negativos.
* **Cronologia**: O ano de estreia da banda não pode ser uma data futura.

## Como rodar o projeto

Se você quiser testar este projeto na sua máquina, siga os passos abaixo:

### Pré-requisitos
- JDK 17 ou superior
- IDE Java (IntelliJ, Eclipse ou VS Code)

### Execução
O projeto pode ser executado diretamente pela classe `Main.java` em uma IDE.

Opcionalmente, via terminal:

```bash
javac *.java
java Main

## Exemplo de Saída

Ao executar o sistema, você verá algo como:
* Cálculo automático da média de idade dos membros.
* Relatório completo com os dados da agência, manager e lista detalhada de integrantes.

---
