import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
	// Definição de variáveis do sistema
	String agencia = "5678";
	String numero = "40028922";
	String digito = "8";
	String cliente = "";
	double saldo = 100;
	// Variável que checa qual card atual. Sa
	int cardAtual = 1;

	// Definição de parâmetros dos elementos
	Font fontePadrao = new Font("Arial", Font.BOLD, 90);
	Font fonteTitulo = new Font("Arial", Font.BOLD, 200);
	Font fonteSubtitulo = new Font("Arial", Font.BOLD, 100);
	Color corTexto = Color.WHITE;
	Color corFundoBotao = Color.BLUE;
	Color corFundoBotaoVerde = Color.GREEN;

	// Criação do objeto da conta bancária da aplicação
	Conta conta = new Conta(agencia, numero, digito, cliente, saldo);

	// Criação dos paineis do CardLayout
	CardLayout cardLayout = new CardLayout(40, 40);
	JPanel painelPrincipal = new JPanel(cardLayout);
	JPanel cardLogin = new JPanel();
	JPanel cardMenu = new JPanel();
	JPanel cardSaldo = new JPanel();
	JPanel cardDeposito = new JPanel();
	JPanel cardSaque = new JPanel();

	// Criação dos textos da aplicação
	JLabel textoLogin = new JLabel("LOGIN");
	JLabel textoBanco = new JLabel("BANCO");
	JLabel textoCliente = new JLabel("");
	JLabel textoAgencia = new JLabel("Agência: " + conta.getAgencia());
	JLabel textoNumeroConta = new JLabel("Número: " + conta.getNumero() + "-" + conta.getDigito());
	JLabel textoSaldo = new JLabel("CHEQUE SEU SALDO");
	JLabel textoDeposito = new JLabel("FAÇA UM DEPÓSITO");
	JLabel textoSaque = new JLabel("FAÇA UM SAQUE");

	// Criação dos botões da aplicação
	JButton botaoSaldo = new JButton("SALDO");
	JButton botaoDeposito = new JButton("DEPOSITO");
	JButton botaoSaque = new JButton("SAQUE");
	JButton botaoVoltar = new JButton("VOLTAR");
	JButton botaoConfirmar = new JButton("CONFIRMAR");
	JButton botaoChecarSaldo = new JButton("CHECAR SALDO");

	// Criação das caixas de texto da aplicação
	JTextField caixaTexto = new JTextField("Insira a quantidade");
	JTextField caixaTextoNome = new JTextField("Insira seu nome");
	JTextField caixaTextoSenha = new JTextField("Insira sua senha");

	App() {
		// Definição de parâmetros da aplicação
		setTitle("Aplicação do Banco");
		setVisible(true);
		setSize(1280, 1024);
		setResizable(false);
		// Inicializa a aplicação no meio da tela
		setLocationRelativeTo(null);
		// Finaliza o programa ao fechar a aplicação
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Adiciona o Painel Principal à aplicação da aplicação
		add(painelPrincipal);

		// Cor de fundo dos Cards
		painelPrincipal.setBackground(Color.BLUE);
		cardLogin.setBackground(Color.BLUE);
		cardMenu.setBackground(Color.BLACK);
		cardSaldo.setBackground(Color.BLACK);
		cardDeposito.setBackground(Color.BLACK);
		cardSaque.setBackground(Color.BLACK);

		// Adiciona os cards ao Painel Principal, com suas respectivas identificações
		painelPrincipal.add(cardLogin, "login");
		painelPrincipal.add(cardMenu, "menu");
		painelPrincipal.add(cardSaldo, "saldo");
		painelPrincipal.add(cardDeposito, "deposito");
		painelPrincipal.add(cardSaque, "saque");

		// Definição dos parâmetros base dos TEXTOS
		textoLogin.setFont(fonteTitulo);
		textoLogin.setForeground(corTexto);

		textoSaldo.setFont(fonteSubtitulo);
		textoSaldo.setForeground(corTexto);

		textoDeposito.setFont(fonteSubtitulo);
		textoDeposito.setForeground(corTexto);

		textoSaque.setFont(fonteSubtitulo);
		textoSaque.setForeground(corTexto);

		textoBanco.setFont(fonteTitulo);
		textoBanco.setForeground(corTexto);

		textoCliente.setFont(fontePadrao);
		textoCliente.setForeground(corTexto);

		textoAgencia.setFont(fontePadrao);
		textoAgencia.setForeground(corTexto);

		textoNumeroConta.setFont(fontePadrao);
		textoNumeroConta.setForeground(corTexto);

		// Definição dos parâmetros base dos BOTÕES
		botaoSaldo.setFont(fontePadrao);
		botaoSaldo.setForeground(corTexto);
		botaoSaldo.setBackground(corFundoBotaoVerde);

		botaoDeposito.setFont(fontePadrao);
		botaoDeposito.setForeground(corTexto);
		botaoDeposito.setBackground(corFundoBotao);

		botaoSaque.setFont(fontePadrao);
		botaoSaque.setForeground(corTexto);
		botaoSaque.setBackground(corFundoBotao);

		botaoVoltar.setFont(fontePadrao);
		botaoVoltar.setForeground(corTexto);
		botaoVoltar.setBackground(corFundoBotao);

		botaoConfirmar.setFont(fontePadrao);
		botaoConfirmar.setForeground(corTexto);
		botaoConfirmar.setBackground(corFundoBotaoVerde);

		botaoChecarSaldo.setFont(fontePadrao);
		botaoChecarSaldo.setForeground(corTexto);
		botaoChecarSaldo.setBackground(corFundoBotaoVerde);

		// Definição dos parâmetros base das CAIXAS DE TEXTO
		caixaTexto.setFont(fontePadrao);
		caixaTextoNome.setFont(fontePadrao);
		caixaTextoSenha.setFont(fontePadrao);

		// Adiciona botões do Card Login
		cardLogin.add(textoLogin);
		cardLogin.add(caixaTextoNome);
		cardLogin.add(caixaTextoSenha);
		cardLogin.add(botaoConfirmar);

		// Adiciona botões do Card Menu
		cardMenu.add(textoBanco);
		cardMenu.add(textoCliente);
		cardMenu.add(textoAgencia);
		cardMenu.add(textoNumeroConta);
		cardMenu.add(botaoSaldo);
		cardMenu.add(botaoDeposito);
		cardMenu.add(botaoSaque);

		// Checagem de click no botão SALDO
		botaoSaldo.addActionListener((e) -> {
			cardLayout.show(painelPrincipal, "saldo");
			cardSaldo.add(botaoVoltar);
			cardSaldo.add(textoSaldo);
			cardSaldo.add(botaoChecarSaldo);
		});

		// Checagem de click no botão DEPOSITO
		botaoDeposito.addActionListener((e) -> {
			cardLayout.show(painelPrincipal, "deposito");
			cardDeposito.add(botaoVoltar);
			cardDeposito.add(textoDeposito);
			cardDeposito.add(caixaTexto);
			cardDeposito.add(botaoConfirmar);
			cardAtual = 2;
		});

		// Checagem de click no botão SAQUE
		botaoSaque.addActionListener((e) -> {
			cardLayout.show(painelPrincipal, "saque");
			cardSaque.add(botaoVoltar);
			cardSaque.add(textoSaque);
			cardSaque.add(caixaTexto);
			cardSaque.add(botaoConfirmar);
			cardAtual = 3;
		});

		// Checagem de click no botão VOLTAR
		botaoVoltar.addActionListener((e) -> {
			cardLayout.show(painelPrincipal, "menu");
			// "Reseta" o texto original da caixa de texto
			caixaTexto.setText("Insira a quantidade");
		});

		// Checagem de click no botão CONFIRMAR
		botaoConfirmar.addActionListener((e) -> {
			switch (cardAtual) {
				// LOGIN
				case 1:
					try {
						String nomeLogin = caixaTextoNome.getText();
						Integer senhaLogin = Integer.parseInt(caixaTextoSenha.getText());

						// Checa se o nome do cliente foi inserido apropriadamente
						if (nomeLogin.equals("Insira seu nome") || nomeLogin.isEmpty()) {
							JOptionPane.showMessageDialog(null,
									"Nome inválido. Insira seu nome",
									"Erro",
									JOptionPane.ERROR_MESSAGE);
						} else {
							conta.setCliente(nomeLogin);

							// Apenas permite entrada, caso a senha digitada coincida com a do sistema
							if (senhaLogin.equals(conta.getSenha())) {
								textoCliente.setText("Cliente: " + conta.getCliente() + " ");
								painelPrincipal.setBackground(Color.BLACK);
								cardLayout.show(painelPrincipal, "menu");
								System.out.println(conta.getCliente());
							} else {
								JOptionPane.showMessageDialog(null,
										"Senha Inválida",
										"Erro",
										JOptionPane.ERROR_MESSAGE);
							}
						}
					} catch (NumberFormatException exception) {
						JOptionPane.showMessageDialog(null,
								"A senha deve conter apenas números",
								"Erro",
								JOptionPane.ERROR_MESSAGE);
					}
					break;

				// DEPOSITO
				case 2:
					try {
						Double numeroDeposito = Double.parseDouble(caixaTexto.getText());
						if (numeroDeposito < 0) {
							JOptionPane.showMessageDialog(null,
									"Valor não permitido. Insira apenas valores positivos",
									"Erro",
									JOptionPane.ERROR_MESSAGE);
						} else {
							conta.setSaldo(conta.getSaldo() + numeroDeposito);
							JOptionPane.showMessageDialog(null, "Deposito efetuado!");
						}
						System.out.println(conta.getSaldo());
					} catch (NumberFormatException exception) {
						JOptionPane.showMessageDialog(null,
								"O valor inserido não é um número OU contém vírgula ao invés de ponto para centavos",
								"Erro",
								JOptionPane.ERROR_MESSAGE);
					}
					break;

				// SAQUE
				case 3:
					try {
						Double numeroSaque = Double.parseDouble(caixaTexto.getText());
						if (numeroSaque > conta.getSaldo() || numeroSaque < 0) {
							JOptionPane.showMessageDialog(null,
									"Valor não permitido. Cheque seu saldo, insira apenas valores positivos",
									"Erro",
									JOptionPane.ERROR_MESSAGE);
						} else if (numeroSaque == 0) {
							JOptionPane.showMessageDialog(null,
									"Insira um valor para saque",
									"Atenção",
									JOptionPane.WARNING_MESSAGE);
						} else {
							conta.setSaldo(conta.getSaldo() - numeroSaque);
							JOptionPane.showMessageDialog(null, "Saque efetuado!");
						}
						System.out.println(conta.getSaldo());
					} catch (NumberFormatException exception) {
						JOptionPane.showMessageDialog(null,
								"O valor inserido não é um número OU contém vírgula ao invés de ponto para centavos",
								"Erro",
								JOptionPane.ERROR_MESSAGE);
					}
					break;

				default:
					break;
			}
		});

		botaoChecarSaldo.addActionListener((e) -> {
			JOptionPane.showMessageDialog(null, "Seu saldo é de: R$ " + conta.getSaldo());
		});
	}

	// Método main da aplicação
	public static void main(String[] args) {
		new App();
	}
}
