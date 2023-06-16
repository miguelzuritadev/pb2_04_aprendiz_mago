package ar.edu.unlam.pb2.hechizable;

public class Mueble implements Hechizable {

	private String estado = "";

	@Override
	public String getEstado() {
		return estado;
	}

	@Override
	public void agrandar() {
		this.estado = "Ahora soy más grande";
	}

	@Override
	public void desarmar() {
		this.estado = "Me desarmaron";
	}

}
