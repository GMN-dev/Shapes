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


<br><br>

# Shape Area Calculator with Object-Oriented Programming (OOP) Approach

This project is a simple shape area calculator developed in Java, with an emphasis on Object-Oriented Programming (OOP) principles and abstraction. It allows the user to input dimensions of rectangles and circles and calculates their areas.

## Description

The system prompts the user to input the number of shapes they want to calculate the area for. Then, for each shape, the user is asked to specify whether it's a rectangle or a circle, as well as the color of the shape. Based on the user's input, the system calculates and displays the area of each shape.

## Features

- Calculate the area of rectangles and circles.
- Input dimensions and color for each shape.
- Display the area of each shape.

## Object-Oriented Programming (OOP) Approach

This project follows the principles of Object-Oriented Programming (OOP), with a focus on abstraction. Classes are used to represent real-world concepts, such as geometric shapes, and are organized in hierarchies to facilitate modeling and code reuse.

## Classes

1. **Shape:** Abstract class representing a generic shape. Contains a field for the color and an abstract method to calculate the area.
2. **Rectangle:** Concrete class representing a rectangle. Inherits from Shape and contains fields for width and height.
3. **Circle:** Concrete class representing a circle. Also inherits from Shape and contains a field for the radius.
4. **Main:** Main class containing the main method to run the application. Prompts the user for input, creates instances of Rectangle and Circle, calculates their areas, and displays the results.

## Technologies Used

- Programming Language: Java
- Input Handling: java.util.Scanner

## How to Use

1. Run the Main.java file.
2. Enter the number of shapes you want to calculate the area for.
3. For each shape, follow the instructions provided by the system:
   - Specify whether it's a rectangle or a circle (r/c).
   - Enter the color of the shape (BLACK/RED/BLUE).
   - Enter the dimensions of the shape (width and height for rectangles, radius for circles).
4. After entering the details for all shapes, the system will display the calculated areas.
