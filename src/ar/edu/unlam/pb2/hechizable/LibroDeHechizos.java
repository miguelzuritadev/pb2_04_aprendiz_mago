package ar.edu.unlam.pb2.hechizable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LibroDeHechizos {

	private HashMap<String, Hechizo> hechizos = new HashMap<String, Hechizo>();

	public void agregarHechizo(Hechizo hechizo) {
		this.hechizos.put(hechizo.getNombre(), hechizo);
	}

	public Hechizo buscar(String nombreHechizo) {
		Hechizo hechizoEncontrado = null;

		for (Map.Entry<String, Hechizo> entry : this.hechizos.entrySet()) {
			String clave = entry.getKey();
			Hechizo valor = entry.getValue();
			if (clave == nombreHechizo) {
				hechizoEncontrado = valor;
				break;
			}
		}

		return hechizoEncontrado;
	}

	public Integer obtenerCantidadDeHechizos() {
		return this.hechizos.size();
	}

}
