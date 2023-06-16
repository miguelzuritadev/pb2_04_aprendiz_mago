package ar.edu.unlam.pb2.hechizable.hechizos;

import ar.edu.unlam.pb2.hechizable.Hechizable;
import ar.edu.unlam.pb2.hechizable.Hechizo;

public class Expelliarmus extends Hechizo {

	public Expelliarmus() {
		super();
		super.nombre = "expelliarmus";
	}

	@Override
	protected void aplicarHechizo(Hechizable objeto) {
		objeto.desarmar();
	}

}
