package regaloDeCumpleanios.caso1;

import org.junit.*;


class MeGustaUnJugeteTest {
	def unRegalo
	def unaPersona
	
	@Before
	def void init() {
		unRegalo = new Regalo(juguete:true)
		unaPersona = new Persona()
	}

	@Test
	def void leGustaUnJugueteAUnaPersona() {
		Assert.assertTrue(unaPersona.teGustaEsteRegalo(unRegalo))
	}
}
