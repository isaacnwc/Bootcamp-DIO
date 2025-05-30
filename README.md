
#  Simulador de Bootcamp DIO

Este projeto é um **simulador de bootcamp** desenvolvido em Java, aplicando conceitos de **Programação Orientada a Objetos (POO)**. Nele, é possível criar bootcamps, adicionar conteúdos (cursos e mentorias), inscrever desenvolvedores e acompanhar sua progressão e acúmulo de XP. Faz parte do curso de Programação Orientada a Objetos com Java, da **DIO - Digital Innovation One**

##  Descrição

O sistema: 

- Cria cursos e mentorias;
- Adiciona esses conteúdos a um bootcamp;
- Inscreve desenvolvedores no bootcamp;
- Simula o progresso dos desenvolvedores nos conteúdos;
- Calcula o XP total acumulado.

## Tecnologias

- Java
- Paradigma de Programação Orientada a Objetos (POO)

##  Estrutura do Projeto

- `Bootcamp.java`: Representa o bootcamp com conteúdos e desenvolvedores inscritos
- `Dev.java`: Gerencia inscrição, progresso e XP dos desenvolvedores
- `Conteudo.java`: Classe abstrata base para cursos e mentorias
- `Curso.java`: Implementação de conteúdo com carga horária
- `Mentoria.java`: Implementação de conteúdo com data definida.
- `Main.java`: Simula o uso das classes criando um bootcamp, conteúdos e desenvolvedores

##  Funcionalidades Demonstradas

- Criação de cursos de **PHP** e **JavaScript**, além de uma mentoria de **Java**.
- Dois desenvolvedores (`Isaac` e `Newton`) se inscrevem e progridem juntando XP
- Exibição dos conteúdos inscritos, concluídos e o cálculo do XP adquirido

##  Licença

Este projeto está licenciado sob a licença MIT.
