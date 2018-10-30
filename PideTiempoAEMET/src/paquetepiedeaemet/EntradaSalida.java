package paquetepiedeaemet;

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

}
