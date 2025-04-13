public class Conta {
	private String numero;
	private String agencia;
	private String digito;
	private String cliente;
	private double saldo;

	public Conta(String agencia, String numero, String digito, String cliente, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.digito = digito;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public String getNumero() {
		return this.numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public String getDigito() {
		return this.digito;
	}

	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Senha definida do cliente, coletada num banco de dados fictício
	public final int getSenha() {
		return 1234;
	}
}
