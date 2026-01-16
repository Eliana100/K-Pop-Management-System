# 💕 K-Pop Management System (Java | POO)


<div align="center">
  <img src="https://github.com/user-attachments/assets/88b77780-ae29-43b7-80f2-72fea17cf3ef" alt="Blackpink Banner" width="100%" style="border-radius: 10px;">
</div>

  <br>

  [![Java](https://img.shields.io/badge/Java-C71585?style=for-the-badge&logo=openjdk&logoColor=white)]()
  [![Paradigma](https://img.shields.io/badge/Paradigma-POO-darkorchid?style=for-the-badge)]()
  [![Status](https://img.shields.io/badge/Status-Desenvolvendo-000000?style=for-the-badge)]()
</div>

---

Projeto em Java desenvolvido para praticar Programação Orientada a Objetos (POO), com foco em modelagem de domínio, encapsulamento e validação de regras de negócio, simulando o gerenciamento de agências e bandas de K-pop.


## 💌 Índice

| Seção | Atalho |
| :--- | :--- |
| **Contexto** | [![](https://img.shields.io/badge/Descrição-darkorchid?style=flat-square)](#descrição) |
| **Arquitetura** | [![](https://img.shields.io/badge/Estrutura_das_Classes-darkorchid?style=flat-square)](#estrutura-das-classes) |
| **Regras** | [![](https://img.shields.io/badge/Regras_de_Negócio-000000?style=flat-square)](#regras-de-negócio-validações) |
| **Guia** | [![](https://img.shields.io/badge/Como_Rodar-darkorchid?style=flat-square)](#como-rodar-o-projeto) |
---

## Descrição

Este sistema permite gerenciar as principais entidades do universo K-pop: **Membros**, **Managers** e **Bandas**. O foco principal é a aplicação de conceitos como encapsulamento, listas de objetos e validações de regras de negócio.

O projeto tem caráter educacional, mas segue princípios que podem ser reaproveitados em sistemas maiores.

<br>

## 🌸 Estrutura das Classes

### Membro
Representa os artistas (idols) que compõem a banda.
- **Atributos:** Nome, Idade, Cargo, Salário e Status de contrato.
---

### Manager
Representa o gestor responsável pela banda.
- **Atributos:** Nome, Idade, Salário e Anos de experiência.
---

### Banda
Classe central do sistema, responsável por agregar membros e manager.
- **Responsabilidades:** Manter lista de integrantes, associar manager, calcular média de idade e gerar relatórios.

---

<br>

## 🎀 Regras de Negócio (Validações)

As regras abaixo são validadas antes da atribuição dos valores para garantir a integridade do sistema:

| Campo | Regra |
| :--- | :--- |
| **Idade do Membro** | Deve ser estritamente maior que 0. |
| **Idade do Manager** | Deve ser maior que 18 anos. |
| **Financeiro** | Salários (Membro/Manager) não podem ser negativos. |
| **Cronologia** | O ano de estreia não pode ser uma data futura. |

---
<br>

## ✨ Como rodar o projeto

### Pré-requisitos
- JDK 17 ou superior
- IDE Java (IntelliJ, Eclipse ou VS Code)

### Execução
1. Clone o repositório.
2. O projeto pode ser executado diretamente pela classe `Main.java` em sua IDE.

Opcionalmente, via terminal:
```bash
javac *.java
java Main

```
---

<div align="center">
  <img src="https://github.com/user-attachments/assets/87095cc4-f419-4916-acba-610de3fecc28" alt="Blackpink Banner" width="100%" style="border-radius: 10px;">
</div>

