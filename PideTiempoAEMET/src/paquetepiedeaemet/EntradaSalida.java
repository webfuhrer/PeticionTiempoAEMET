package paquetepiedeaemet;

import java.util.ArrayList;
import java.util.Scanner;

import paquetepiedeaemet.Clima;
import paquetepiedeaemet.Dia;

public class EntradaSalida {

	public static String pedirCodigoMunicipio() {
		System.out.println("Introduzca el c�digo");
		Scanner sc=new Scanner(System.in);
		String codigo=sc.nextLine();
		return codigo;
	}
	public static void mostrarPrediccion(Clima c) {
		System.out.println("Municipio: "+c.getMunicipio());
		System.out.println("Provincia"+c.getProvincia());
		for (Dia d : c.getLista_dias()) {
			System.out.println(formatearFecha(d.getFecha())+":"+d.getT_minima()+"�C /"+d.getT_maxima()+"�C");
		}
		
	}
	private static String formatearFecha(String fecha) {
		// TODO Auto-generated method stub
		String[] campos=fecha.split("-");
		String fecha_formateada=campos[2]+"/"+campos[1]+"/"+campos[0];
		return fecha_formateada;
	}
	public static int mostrarMenu(ArrayList<Provincia> lista_provincias) {
		Scanner sc=new Scanner(System.in);
		for (Provincia provincia : lista_provincias) {
			System.out.println(provincia.getId_provincia()+"-"+provincia.getNombre());
		}
		int opcion=sc.nextInt();sc.nextLine();
		return opcion;
	}
	public static int mostrarMunicipios(ArrayList<Municipio> lista_municipios) {
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<lista_municipios.size(); i++)
		{
			System.out.println(lista_municipios.get(i).getCod_municipio()+"-"+lista_municipios.get(i).getNombre());
		}
		int opcion=sc.nextInt();sc.nextLine();
		return opcion;
		
	}

}
