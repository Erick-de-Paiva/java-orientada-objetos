package entities;

public class Rectangle {
	
	public double largura;
	public double altura;
	
	public Double area() {
		return largura * altura;
	}
	
	public Double perimetro() {
		return largura * 2 + altura * 2;
	}
	
	public Double diagonal() {
		return Math.sqrt(largura * largura + altura * altura);
	}

}