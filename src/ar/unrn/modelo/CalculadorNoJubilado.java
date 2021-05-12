package ar.unrn.modelo;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado implements Calculador {

	private LogTransaction log;
	private int mesEnPromocion;

	public CalculadorNoJubilado(int mesEnPromocion) {
		this.mesEnPromocion = mesEnPromocion;
		this.log = new LogTransaction();
	}

	@Override
	public double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;
		if (of(mesEnPromocion).equals(now().getMonth())) {
			precioTotal += precioProducto * 0.15; /* precioTotal = precioTotal + (precioProducto * 0.15) */
		} else {
			precioTotal += precioProducto * 0.21;
		}
		log.log(CalculadorNoJubilado.class.getName());
		return precioTotal;
	}
}
