package ar.edu.unlam.pb2.hechizable;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ar.edu.unlam.pb2.hechizable.hechizos.Expelliarmus;

public class LibroDeHechizosTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void queSePuedaObtenerLaCantidadDeHechizos() {
		Integer valorEsperado = 2;

		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus();
		Hechizo crecer = new Agrandar("enormuvus");
		libro.agregarHechizo(desarme);
		libro.agregarHechizo(crecer);

		Assert.assertEquals(valorEsperado, libro.obtenerCantidadDeHechizos());
	}

	@Test
	public void queSePuedaAgregarUnHechizoAlLibro() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus();
		libro.agregarHechizo(desarme);
		Assert.assertEquals(desarme, libro.buscar("expelliarmus"));
	}

	@Test
	public void verSiUnHechizableEstaHechizado() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Expelliarmus desarme = new Expelliarmus();
		Hechizable perro = new Animal();

		libro.agregarHechizo(desarme);
		Hechizo hechizo = libro.buscar("expelliarmus");
		hechizo.aplicarHechizo(perro);

		Assert.assertEquals("Me desarmaron", perro.getEstado());
	}

	@Test
	public void verSiUnHechizableCrece() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo crecer = new Agrandar("enormuvus");
		Hechizable mesa = new Mueble();

		libro.agregarHechizo(crecer);
		Hechizo hechizo = libro.buscar("enormuvus");
		hechizo.aplicarHechizo(mesa);

		Assert.assertEquals("Ahora soy más grande", mesa.getEstado());
	}

	@Test
	public void queElEstadoDelHechizableCorrespondaAlUltimoHechizo() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo crecer = new Agrandar("enormuvus");
		Expelliarmus desarme = new Expelliarmus();
		Hechizable mesa = new Mueble();
		
		libro.agregarHechizo(crecer);
		libro.agregarHechizo(desarme);
		Hechizo hechizo1 = libro.buscar("enormuvus");
		hechizo1.aplicarHechizo(mesa);
		Hechizo hechizo2 = libro.buscar("expelliarmus");
		hechizo2.aplicarHechizo(mesa);
		
		Assert.assertEquals("Me desarmaron", mesa.getEstado());
	}

}
