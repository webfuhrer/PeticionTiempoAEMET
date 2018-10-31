package paquetepiedeaemet;

public class Provincia {
private int id_provincia;
private String nombre;
public int getId_provincia() {
	return id_provincia;
}
public String getNombre() {
	return nombre;
}
public Provincia(int id_provincia, String nombre) {
	super();
	this.id_provincia = id_provincia;
	this.nombre = nombre;
}

}
