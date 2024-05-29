# Sistema de Gerenciamento de Bootcamps em Java

## Descrição

Este projeto implementa um sistema de gerenciamento de bootcamps em Java. Ele permite criar cursos e mentorias, organizar esses conteúdos em bootcamps e gerenciar a inscrição e progresso de desenvolvedores (Devs) nesses bootcamps.

## Estrutura do Projeto

O projeto é composto por várias classes que representam os diferentes componentes de um bootcamp:

- **Curso**: Representa um curso com título, descrição e carga horária.
- **Mentoria**: Representa uma mentoria com título, descrição e data.
- **Bootcamp**: Agrupa cursos e mentorias em um programa de treinamento intensivo.
- **Dev**: Representa um desenvolvedor que pode se inscrever em bootcamps, progredir através dos conteúdos e calcular a experiência adquirida.

## Funcionalidades

- **Criação de Cursos**: Permite criar novos cursos com título, descrição e carga horária.
- **Criação de Mentorias**: Permite criar novas mentorias com título, descrição e data.
- **Organização de Bootcamps**: Permite agrupar cursos e mentorias em um bootcamp.
- **Inscrição de Desenvolvedores**: Permite que desenvolvedores se inscrevam em bootcamps.
- **Progresso de Desenvolvedores**: Permite que desenvolvedores progridam através dos conteúdos do bootcamp.
- **Cálculo de Experiência**: Permite calcular a experiência total adquirida pelos desenvolvedores com base nos conteúdos concluídos.

## Exemplo de Uso

1. **Criação de Cursos e Mentorias**:
    - Criação de um curso de Java com carga horária de 8 horas.
    - Criação de um curso de JavaScript com carga horária de 4 horas.
    - Criação de uma mentoria sobre Java com data atual.

2. **Organização de um Bootcamp**:
    - Criação de um bootcamp chamado "Bootcamp JavaDeveloper" que inclui os cursos e a mentoria criados.

3. **Inscrição e Progresso de Desenvolvedores**:
    - Inscrição de um desenvolvedor chamado "Igor" no bootcamp.
    - Progresso de Igor através dos conteúdos do bootcamp.
    - Cálculo e exibição da experiência total adquirida por Igor.

    - Inscrição de outro desenvolvedor chamado "Pi" no bootcamp.
    - Progresso de Pi através dos conteúdos do bootcamp.
    - Cálculo e exibição da experiência total adquirida por Pi.

## Requisitos

- **Java 8+**: O projeto é implementado em Java e requer a versão 8 ou superior.

## Instruções de Uso

### Compilação

Para compilar o projeto, navegue até o diretório do projeto e execute:

```sh
javac -d bin src/*.java
