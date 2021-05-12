package ar.unrn.modelo;

import static java.time.LocalDate.now;

import org.junit.Assert;
import org.junit.Test;

public class CalculadorTest {

	@Test
	public void calcularPrecioJubiladoSinPromocion() {

		Calculador jubilado = new CalculadorJubilado(now().getMonthValue() + 1);

		Assert.assertEquals(Double.valueOf(27.5), Double.valueOf(jubilado.calcularPrecio(25)));
	}

	@Test
	public void calcularPrecioJubiladoConPromocion() {

		Calculador jubilado = new CalculadorJubilado(now().getMonthValue());

		Assert.assertEquals(Double.valueOf(50.0), Double.valueOf(jubilado.calcularPrecio(50)));
	}

	@Test
	public void calcularPrecioNoJubiladoSinPromocion() {

		Calculador noJubilado = new CalculadorNoJubilado(now().getMonthValue() + 1);

		Assert.assertEquals(Double.valueOf(36.3), Double.valueOf(noJubilado.calcularPrecio(30)));
	}

	@Test
	public void calcularPrecioNoJubiladoConPromocion() {

		Calculador noJubilado = new CalculadorNoJubilado(now().getMonthValue());

		Assert.assertEquals(Double.valueOf(28.75), Double.valueOf(noJubilado.calcularPrecio(25)));
	}
}