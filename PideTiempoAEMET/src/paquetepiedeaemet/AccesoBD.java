package paquetepiedeaemet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccesoBD {
private static String usuario="root";
private static String password="";
private static String url="jdbc:mysql://localhost:3306/bd_municipios";
private static Connection c=null;
private static Statement stmt=null;

	public static ArrayList<Provincia> devolverProvincias() {
		abrirConexion();
		ArrayList<Provincia> lista_provincias=new ArrayList<>();
		String query="SELECT provincia, id_provincia FROM provincias ORDER BY id_provincia";
		try {
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				String nombre=rs.getString("provincia");
				int id_provincia=rs.getInt("id_provincia");
				Provincia p=new Provincia(id_provincia, nombre);
				lista_provincias.add(p);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista_provincias;
	}
	private static void abrirConexion()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection(url, usuario, password);
			stmt=c.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	public static ArrayList<Municipio> devolverMunicipiosPorProvincia(int id_provincia) {
		abrirConexion();
		ArrayList<Municipio> lista_municipios=new ArrayList<Municipio>();
		String query="SELECT cod_municipio, nombre FROM municipios WHERE id_provincia="+id_provincia+" ORDER BY id_municipio"; 
		ResultSet rs;
		try {
			rs = stmt.executeQuery(query);
			while(rs.next())
			{
				int cod_municipio=rs.getInt("cod_municipio");
				String nombre=rs.getString("nombre");
				Municipio m=new Municipio(cod_municipio, nombre);
				lista_municipios.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	return lista_municipios;	
	}

}
