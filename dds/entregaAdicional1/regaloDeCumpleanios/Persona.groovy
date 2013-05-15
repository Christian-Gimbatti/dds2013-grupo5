package regaloDeCumpleanios

class Persona {
	def regaloQuePrefiero
	
	
	def Date getFechaCumple() {
		
	}
	
	def teGustaEsteRegalo(unRegalo) {
		unRegalo.esJuguete()
	}
	
	def meGustaEsteRegalo(unRegalo) {
		//{unRegalo-> unRegalo.esJuguete()}
		regaloQuePrefiero(unRegalo)
	}
	
	def esteRegaloTmbMeGusta(unRegalo) {
		false
	}
}