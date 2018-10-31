package paquetepiedeaemet;

import java.util.ArrayList;

import org.jdom2.Document;

public class PrincipalPideTiempoAEMET {

	public static void main(String[] args) {
		ArrayList<Provincia> lista_provincias=AccesoBD.devolverProvincias();
		int id_provincia=EntradaSalida.mostrarMenu(lista_provincias);
		ArrayList<Municipio> lista_municipios=AccesoBD.devolverMunicipiosPorProvincia(id_provincia);//SELECT ... Where
		int cod_municipio=EntradaSalida.mostrarMunicipios(lista_municipios);
		
		
		String provincia="";
		String municipio="";
		
		if (id_provincia<10)
		{
			provincia="0"+id_provincia;
		}
		else
		{
			provincia=String.valueOf(id_provincia);	
		}
		
		municipio=String.valueOf(cod_municipio);
		while(municipio.length()<3)
		{
			municipio="0"+municipio;
		}
		
		String codigo=provincia+municipio;
		
	//String codigo=EntradaSalida.pedirCodigoMunicipio();
		String xml=AccesoWeb.pedirXML(codigo);
		Document documento_xml=ParseaXML.convertirStringEnDocument(xml);
		Clima c=ParseaXML.parsearXML(documento_xml);
		EntradaSalida.mostrarPrediccion(c);
	}

}
