package Entitie;

public class Conta {
	
	private Integer numeroConta;
	private Double saldo;
	
	
	public Conta(Integer numeroConta, Double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}


	public Integer getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}


	public Double getSaldo() {
		return saldo;
	}

	

	

}
