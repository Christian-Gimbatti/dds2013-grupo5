package tamagochi

class EstadoAburrido implements Estado {
	def minutosEnEsteEstado
	
	def comer(unaMascota) {d
		//Si está aburrida, y hace más de 80 minutos que está aburrida, entonces se pone contenta.
		//Si está aburrida desde hace 80 minutos o menos, entonces no le pasa nada, no cambia nada.
		if(minutosEnEsteEstado > 80) {
			unaMascota.estado = new EstadoContento()
		}
	}
	
	def jugar(unaMascota){
		//Si está aburrida, se pone contenta.
		unaMascota.estado = new EstadoContento()
	}
	
	def puedeJugar() {
		return true
	}
}
