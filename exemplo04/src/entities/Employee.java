package entities;

public class Employee {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	public double porcentagem;

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public double aumentoSalarial() {
		return salarioBruto * (1 + porcentagem / 100) - imposto;
	}
	
}