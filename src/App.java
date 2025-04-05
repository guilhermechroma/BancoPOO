import java.util.Scanner;

public class App {
    public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) { //Função scan do java.util.Scanner
			//Declaração das variáveis
			String n = "40028922";
			String ag = "324-15";
			String dgt = "8";
			double sld = 100; //Saldo inicial
			
			System.out.println("Informe o nome do cliente: ");
			String clt = scan.next(); //Escaneia a primeira palavra/primeiro nome
			clt += scan.nextLine(); //Escaneia o resto da linha
			
			//Cria uma nova conta com as informações declaradas anteriormente
			Conta conta = new Conta(n, ag, dgt, clt, sld);
			
			System.out.println("====== Conta criada! ======");
			System.out.println("Número: " + conta.getNumero());
			System.out.println("Agência: " + conta.getAgencia());
			System.out.println("Digito: " + conta.getDigito());
			System.out.println("Cliente: " + conta.getCliente());
			System.out.println("Saldo: " + conta.getSaldo());
			System.out.println("==================================");
			
			while(true) {
				System.out.println("Selecione uma das opções: \n" + "(1- saldo, 2- depósito, 3- saque, 4- sair): ");
				int escolha = scan.nextInt();
				
				if(escolha == 1) { //SALDO
					System.out.println("Saldo atual: " + sld + "\n");
				} else {
					
					if(escolha == 2) { //DEPÓSITO
						System.out.println("Insira o valor de depósito: ");
						sld += scan.nextDouble(); //Adicionará ao saldo o valor inserido
						System.out.println("Saldo atual: " + sld + "\n");
					} else {
						
						if(escolha == 3) { //SAQUE
							System.out.println("Insira o valor de saque: ");
							double valor = scan.nextDouble(); //Armazena o valor inserido
							if(valor <= sld) { //Se o valor condizer com o saldo, o saque será feito
								sld = sld - valor; //Retira do saldo o valor inserido
								System.out.println("Saldo atual: " + sld + "\n");
							} else { //Se não houver saldo, não será feito o saque
								System.out.println("SALDO INSUFICIENTE!\n");
							}
						} else {
							
							if(escolha == 4) { //SAÍDA
								System.out.println("Obrigado por usar nosso serviço. Volte sempre!");
								break;
							} else {
								System.out.println("ERRO! Digite uma opção válida!\n");
							}
						}
					}
				}
			}
		}
	}
}
