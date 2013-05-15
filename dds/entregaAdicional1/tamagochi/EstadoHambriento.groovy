package tamagochi

class EstadoHambriento implements Estado {

	def comer(unaMascota) {
		//Si est� hambrienta, se pone contenta.
		unaMascota.estado = new EstadoContento()
	}

	def jugar(unaMascota) {
		//No produce ning�n efecto jugar con la mascota si esta hambrienta.
	}
	
	def puedeJugar() {
		return false
	}
}