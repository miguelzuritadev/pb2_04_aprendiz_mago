package ar.edu.unlam.pb2.hechizable;

public class Agrandar extends Hechizo {
	
	public Agrandar(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	protected void aplicarHechizo(Hechizable objeto) {
		objeto.agrandar();
	}

}
