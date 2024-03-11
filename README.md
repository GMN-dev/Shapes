# Calculadora de Área de Formas com Abordagem de Programação Orientada a Objetos (POO)

Este projeto é uma calculadora simples de área de formas desenvolvida em Java, com uma abordagem baseada em Programação Orientada a Objetos (POO) e enfatizando a abstração. Permite ao usuário inserir dimensões de retângulos e círculos e calcular suas áreas.

![image](https://github.com/GMN-dev/Shapes/assets/84913052/2c2c5758-18e4-4d92-a71f-617ad874add7)

## Descrição

O sistema solicita ao usuário que insira o número de formas para calcular a área. Em seguida, para cada forma, o usuário é solicitado a especificar se é um retângulo ou um círculo, bem como a cor da forma. Com base na entrada do usuário, o sistema calcula e exibe a área de cada forma.

## Funcionalidades

- Calcular a área de retângulos e círculos.
- Inserir dimensões e cor para cada forma.
- Exibir a área de cada forma.

## Abordagem de Programação Orientada a Objetos (POO)

Este projeto segue os princípios da Programação Orientada a Objetos (POO), com uma ênfase na abstração. As classes são utilizadas para representar conceitos do mundo real, como formas geométricas, e são organizadas em hierarquias para facilitar a modelagem e a reutilização do código.

## Classes

1. **Shape:** Classe abstrata que representa uma forma genérica. Contém um campo para a cor e um método abstrato para calcular a área.
2. **Rectangle:** Classe concreta que representa um retângulo. Herda de Shape e contém campos para largura e altura.
3. **Circle:** Classe concreta que representa um círculo. Também herda de Shape e contém um campo para o raio.
4. **Main:** Classe principal contendo o método principal para executar a aplicação. Solicita a entrada do usuário, cria instâncias de Rectangle e Circle, calcula suas áreas e exibe os resultados.

## Tecnologias Utilizadas

- Linguagem de Programação: Java
- Manipulação de Entrada: java.util.Scanner

## Como Utilizar

1. Execute o arquivo Main.java.
2. Insira o número de formas para calcular a área.
3. Para cada forma, siga as instruções fornecidas pelo sistema:
   - Especifique se é um retângulo ou um círculo (r/c).
   - Insira a cor da forma (PRETO/VERMELHO/AZUL).
   - Insira as dimensões da forma (largura e altura para retângulos, raio para círculos).
4. Após inserir os detalhes de todas as formas, o sistema exibirá as áreas calculadas.
