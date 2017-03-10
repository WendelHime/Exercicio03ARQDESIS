/**
 * 
 */
package br.usjt.ardesis.exercicio;

/**
 * @author Wendel Hime Lino Castro
 *
 */
public class Cubo implements Volume{

	
	double comprimento, largura, altura;
	
	public Cubo(double comprimento, double largura, double altura)
	{
		this.comprimento = comprimento;
		this.largura = largura;
		this.altura = altura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calculaVolume() {
		return (comprimento*largura*altura);
	}

}
