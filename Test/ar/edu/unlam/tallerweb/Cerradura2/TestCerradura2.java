package ar.edu.unlam.tallerweb.Cerradura2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCerradura2 {

	@Test
	public void testAbrirCerraduraConClaveCorrecta() {
		Cerradura2 miCerradura = new Cerradura2(1234, 3);
		assertTrue(miCerradura.abrirCerradura(1234));
	}

	@Test
	public void testNoAbrirCerraduraConClaveIncorrecta() {
		Cerradura2 miCerradura = new Cerradura2(1111, 2);
		assertFalse(miCerradura.abrirCerradura(1234));
		assertFalse(miCerradura.abrirCerradura(2222));
	}

	@Test
	public void testCerrarCerradura2() {
		Cerradura2 miCerradura = new Cerradura2(4321, 3);
		miCerradura.abrirCerradura(4321);
		assertFalse(miCerradura.cerrarCerradura());

	}
	
	@Test
	public void testComprobarQueCerraduraEstaAbierta(){
		Cerradura2 miCerradura= new Cerradura2(1234,3);
		miCerradura.abrirCerradura(1234);
		assertTrue(miCerradura.estaCerraduraEstaAbierta());
	}
	
	@Test
	public void estaCerraduraEstaCerrada(){
		Cerradura2 miCerradura = new Cerradura2(1111,2);
		miCerradura.cerrarCerradura();
		assertFalse(miCerradura.estaCerraduraEstaCerrada());
	}
	
	@Test
	public void comprobarQueSeBloqueoCerradura(){
		Cerradura2 miCerradura= new Cerradura2(1111,2);
		miCerradura.abrirCerradura(0000);
		miCerradura.abrirCerradura(222);
		assertTrue(miCerradura.bloqueada());
	}
	
	@Test
	public void contarAperturasExitosas(){
		Cerradura2 miCerradura = new Cerradura2(111,3);
		miCerradura.abrirCerradura(111);
		miCerradura.abrirCerradura(111);
		miCerradura.abrirCerradura(111);
		Integer cantidadEsperada= 3;
		Integer aperturaExitosa = miCerradura.contarAperturaExitosa();
		assertEquals(cantidadEsperada, aperturaExitosa);
		
	}
	
	@Test
	public void contarAperturasFallidas(){
		Cerradura2 miCerradura = new Cerradura2(111,2);
		miCerradura.abrirCerradura(000);
		miCerradura.abrirCerradura(222);
		Integer cantidadEsperada= 2;
		Integer aperturaFallida= miCerradura.contarAperturaFallida();
		assertEquals(cantidadEsperada, aperturaFallida);
	}

}
