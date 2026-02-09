package Util;

public class currencyConverter {

	public static final double IMPOSTO = 1.06;
	
	public double valorDolar;
	public double dolarComprado;
	
	public double valorFinal() {
		return (valorDolar * dolarComprado) * IMPOSTO;
	}
	
}