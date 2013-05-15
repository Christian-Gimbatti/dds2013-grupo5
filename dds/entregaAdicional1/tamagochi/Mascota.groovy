package tamagochi

class Mascota {
	def nivel = 0
	def estado
	
	def setEstado(unEstado){ estado = unEstado }
	def comer(){ estado.comer(this)	}
	def jugar(){ estado.jugar(this)	}
	def puedeJugar(){ estado.puedeJugar() }
}