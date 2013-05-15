package tamagochi

class EstadoAburrido implements Estado {
	def minutosEnEsteEstado
	
	def comer(unaMascota) {d
		//Si est� aburrida, y hace m�s de 80 minutos que est� aburrida, entonces se pone contenta.
		//Si est� aburrida desde hace 80 minutos o menos, entonces no le pasa nada, no cambia nada.
		if(minutosEnEsteEstado > 80) {
			unaMascota.estado = new EstadoContento()
		}
	}
	
	def jugar(unaMascota){
		//Si est� aburrida, se pone contenta.
		unaMascota.estado = new EstadoContento()
	}
	
	def puedeJugar() {
		return true
	}
}
