/**
 * 
 */
package br.usjt.ardesis.exercicio;

/**
 * @author Wendel Hime Lino Castro
 *
 */
public class Circulo extends Figura {

	public double raio;
	
	/**
	 * 
	 */
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
		
	/* (non-Javadoc)
	 * @see br.usjt.ardesis.exercicio.Figura#area()
	 */
	@Override
	public double area() {
		return Math.PI* Math.pow(this.raio, 2);
	}

	@Override
	public double perimetro() {
		return (2*Math.PI*raio);
	}

}
