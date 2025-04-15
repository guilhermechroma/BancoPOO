# Banco POO (Programação Orientada a Objetos)

## ⚙️ FUNCIONALIDADE ⚙️

Um projeto feito na linguagem de programação **Java**, aproveitando dos conceitos da **Programação Orientada a Objetos** para simulação básica de uma aplicação de **caixa eletrônico**, com funções como: Fazer **Login** na conta, **Checar Saldo**, **Depositar** e **Sacar** dinheiro da conta. Por limitações de um projeto de estudo em fase inicial, ainda não há um banco de dados apropriado para guardar informações confidenciais do usuário e nem um sistema de registro. A aplicação possui uma interface gráfica simples feita em JFrame com CardLayout (auxiliando na troca de telas, mas limitando a customização da interface) e roda inteiramente na própria máquina do usuário, de forma local e off-line.

## ⭐ DEPENDÊNCIAS ⭐

Contém importações das bibliotecas **java.swing** e **java.awt**. Classes (com suas devidas funções) derivadas dessas bibliotecas foram usadas no projeto, como:

### java.swing

- JFrame
- JPanel
- JLabel
- JButton
- JTextField
- JOptionPane

### java.awt

- Font
- Color
- CardLayout

> A Interface Gráfica do Usuário (GUI) foi trabalhada baseada no JFrame e JPanel, classes importadas da biblioteca java.swing, que são responsáveis, respectivamente, pela estrutura da janela da aplicação e das telas contidas nela (também chamadas de painéis). Da mesma biblioteca, também foi possível a utilização de classes para construir os textos, caixas de texto (entrada do usuário) e botões da interface, sendo elas: JLabel, JTextField e JButton, e para completar ainda há a classe JOptionPane para representação de caixas pop-up de erro e alerta para exceções e falhas na entrada de dados do usuário. Além da biblioteca swing, também foi necessário o uso da biblioteca java.awt para determinar o layout dos painéis e definir fonte e cores dos elementos desenhados na tela, cabendo esse trabalho às classes CardLayout (gerenciador de layout), Font e Color. Uma última alteração foi a adição de uma classe do java.swing chamada UIManager, que gerencia parâmetros de interface de toda uma classe de uma vez ao invés de manusear cada objeto dela (no caso desse projeto, sendo usada para manusear o visual do JOptionPane), com o auxílio de outras do java.awt, como Dimension e FontUIResource.

## 📜 HISTÓRICO 📜

Este foi um dos primeiros projetos feitos em Java, durante minha graduação em Análise e Desenvolvimento de Sistemas. Sua primeira versão era uma simulação bancária mais básica, não continha interface gráfica e rodava diretamente pelo terminal. Apenas havia dependência da biblioteca java.util para sua classe Scanner, que detectava a entrada de dados do usuário a partir de "inputs" que aguardavam pelo seu comando.
