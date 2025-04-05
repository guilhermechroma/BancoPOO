public class Conta {
	private String numero;
	private String agencia;
	private String digito;
	private String cliente;
	private double saldo;
	
	public Conta(String numero, String agencia, String digito, String cliente, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.digito = digito;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public String getNumero() { //Número
		return this.numero;
	}
	
	public String getAgencia() { //Agência
		return this.agencia;
	}

	public String getDigito() { //Digito
		return this.digito;
	}

	public String getCliente() { //Cliente
		return this.cliente;
	}

	public double getSaldo() { //Saldo
		return this.saldo;
	} 
}
