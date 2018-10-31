package paquetepiedeaemet;

public class Municipio {
	private int cod_municipio;
	private String nombre;
	public Municipio(int cod_municipio, String nombre) {
		super();
		this.cod_municipio = cod_municipio;
		this.nombre = nombre;
	}
	public int getCod_municipio() {
		return cod_municipio;
	}
	public String getNombre() {
		return nombre;
	}
	

}
