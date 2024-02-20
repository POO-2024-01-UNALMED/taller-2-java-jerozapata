package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;	
	
	
	int cantidadAsientos() {
		int numeroAsientos = 0;
		for (int i = 0 ; 1<asientos.length; i++) {
			
			if(asientos[1] != null) {
				numeroAsientos++;
			}
		}
		return numeroAsientos;
	}
	
	String verificarIntegridad() {
		if(this.registro == this.motor.registro) {
			for(int i = 0 ; i < asientos.length ; i++) {
				if (asientos[i] != null && asientos[i]) {
					return "Las piezas no son originales"
					else "Auto original"
				}
			}
			
		}
	}
	
	
	
}
