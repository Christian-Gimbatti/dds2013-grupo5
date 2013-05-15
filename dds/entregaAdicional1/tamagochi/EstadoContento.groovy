package tamagochi

class EstadoContento implements Estado {
	
	def comer(unaMascota) {
		//Si est� contenta, su nivel se incrementa en una unidad.
		unaMascota.aumentarNivel
	}
	
	def jugar(unaMascota) {
		//Si est� contenta, su nivel se incrementa en dos unidades.
		unaMascota.nivel = (unaMascota.nivel + 2)
	}
	
	def puedeJugar() {
		return true
	}
}