package ar.edu.unlam.pb2.hechizable;

import java.util.Objects;

public abstract class Hechizo {
	
	protected String nombre;
	
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hechizo other = (Hechizo) obj;
		return Objects.equals(nombre, other.nombre);
	}

	protected abstract void aplicarHechizo(Hechizable objeto);
	
	

}
