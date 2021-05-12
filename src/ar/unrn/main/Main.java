package ar.unrn.main;

import ar.unrn.modelo.Calculador;
import ar.unrn.modelo.CalculadorJubilado;
import ar.unrn.modelo.CalculadorNoJubilado;

public class Main {

	public static void main(String[] args) {

		/* Con promocion del mismo mes le aumentan el 15% */
		Calculador noJubilado1 = new CalculadorNoJubilado(5);
		System.out.println(noJubilado1.calcularPrecio(25));

		/* Sin promocion le aumentan un 21% */
		Calculador noJubilado2 = new CalculadorNoJubilado(6);
		System.out.println(noJubilado2.calcularPrecio(30));

		/* Sin promocion le aumentan un 10% */
		Calculador jubilado = new CalculadorJubilado(6); /* Sin promocion */
		System.out.println(jubilado.calcularPrecio(25));

		/* Con promocion del mismo mes, no recibe ningun aumento */
		Calculador jubilado2 = new CalculadorJubilado(5);
		System.out.println(jubilado2.calcularPrecio(50));
	}
}