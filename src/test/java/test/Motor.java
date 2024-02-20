package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int nuevoRegistro) {
		this.registro = nuevoRegistro;
	}
	
	void asignarTipo(String tipo) {
		if (tipo.equals("electrico") || tipo.equals("gasolina")) {
			this.tipo = tipo;
			
	        }
	}

}
