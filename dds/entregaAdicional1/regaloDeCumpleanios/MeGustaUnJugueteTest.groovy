package regaloDeCumpleanios;

import org.junit.*;


class MeGustaUnJugeteTest {
	def unRegalo
	def unaPersona
	
	@Before
	def void init() {
		unRegalo = new Regalo(juguete:true)
		unaPersona = new Persona()
		
	}

	@Test //La persona decide que le gusta sabiendo la interfaz del Regalo
	def void leGustaUnJugueteAUnaPersona() {
		Assert.assertTrue(unaPersona.teGustaEsteRegalo(unRegalo))
	}
	
	@Test //Con closures que se pueden ir cambiando segun los gustos que la persona vaya teniendo
	def void leGustaOtroJugueteAUnaPersona() {
		unaPersona.regaloQuePrefiero = PreferenciaDeRegalo.prefieroUnJugete()
		Assert.assertTrue(unaPersona.meGustaEsteRegalo(unRegalo))
	}
	
	@Test //Empiezo con lo que no le gusta aunque sea el mismo regalo
	def void esteOtroRegaloNoLeGustaAUnaPersona() {
		Assert.assertFalse(unaPersona.esteRegaloTmbMeGusta(unRegalo))
	}
	
	//MIXINS
	
	@Test //Y ahora si le gusta el regalo que antes no le gusto(indeciso), pero a la otraPersona no le gusta(sin cambiarle el comportamiento)
	def void esteOtroRegaloSiEsJugueteTmbLeGustaAUnaPersona() {
		unaPersona.metaClass {mixin(JugueteComoRegalo)}
		Assert.assertTrue(unaPersona.esteRegaloTmbMeGusta(unRegalo))
		
		def otraPersona = new Persona()// Verifico que la clase original no es modificada
		Assert.assertFalse(otraPersona.esteRegaloTmbMeGusta(unRegalo))
		
		//Finalmente no le gusta y ya no lo quiere, piso con mixin el comportamiento modificado del original, osea -> lo vuelvo a modificar
		unaPersona.metaClass {mixin(PersonaQueNoLeGustaNingunRegalo)}
		Assert.assertFalse(otraPersona.esteRegaloTmbMeGusta(unRegalo))
	}
		
}
