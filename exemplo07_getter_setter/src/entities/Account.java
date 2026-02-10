package entities;

public class Account {
		
		private int numeroConta;
		private String titular;
		private double saldo;
		
		public Account(int numeroConta, String titular) {
			this.numeroConta = numeroConta;
			this.titular = titular;
		}

		public Account(int numeroConta, String titular, double depositoInicial) {
			this.numeroConta = numeroConta;
			this.titular = titular;
			deposito(depositoInicial);
		}

		public int getNumeroConta() {
			return numeroConta;
		}

		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public Double getSaldo() {
			return saldo;
		}
		
		public void deposito(double amount) {
			saldo += amount;
		}
		
		public void saque(double amount) {
			saldo -= amount + 5.0;
		}
		
		public String toString() {
			return "Conta " + numeroConta + ", titular: " + titular + ", saldo: R$ " + String.format("%.2f", saldo);
		}
		
	}