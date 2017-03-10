/**
 * 
 */
package br.usjt.ardesis.exercicio;

/**
 * @author Wendel Hime Lino Castro
 *
 */
public class Triangulo extends Poligono {

	double altura;
	double lado1;
	double lado2; 
	double lado3;
	
	/**
	 * 
	 */
	public Triangulo(double lado1, double lado2, double lado3, double altura)
	{
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	

	@Override
	public double area() {
		return (lado1*altura)/2;
	}

	@Override
	public double perimetro() {
		return lado1+lado2+lado3;
	}

}
