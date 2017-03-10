/**
 * 
 */
package br.usjt.ardesis.exercicio;

import java.util.ArrayList;

/**
 * @author Wendel Hime Lino Castro
 *
 */
public class Geometria {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(4));
		figuras.add(new Triangulo(2, 2, 2, 3));
		figuras.add(new Quadrado(5));
		figuras.add(new Esfera(5));
		figuras.add(new Cilindro(5));
		figuras.add(new Losango(10, 20));
		figuras.add(new Retangulo(50, 30));
		figuras.add(new Trapezio(10, 7, 8, 2, 6));
		figuras.add(new Triangulo(10, 20, 12, 9));
	}

}
