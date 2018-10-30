package paquetepiedeaemet;

//import org.jdom2.Document;

public class PrincipalPideTiempoAEMET {

	public static void main(String[] args) {
		/*ArrayList<Provincia> lista_provincias=AccesoBD.devoverProvincias();//
		int id_provincia=EntradaSalida.mostrarMenu(lista_provincias);
		ArrayList<Municipio> lista_municipios=AccesoBD.devolverMunicipiosPorProvincia(id_provincia);//SELECT ... Where
		int cod_municipio=Entradasalida.mostrarMunicipios(lista_municipios);
		*/
		
		int id_provincia=28;
		int cod_municipio=8;
		String provincia="";
		String municipio="";
		
		if (id_provincia<10)
		{
			provincia="0"+id_provincia;
		}
		
		municipio=String.valueOf(cod_municipio);
		while(municipio.length()<3)
		{
			municipio="0"+municipio;
		}
		
		String codigo=provincia+municipio;
		System.out.println(codigo);
		/*String codigo=EntradaSalida.pedirCodigoMunicipio();
		String xml=AccesoWeb.pedirXML(codigo);
		Document documento_xml=ParseaXML.convertirStringEnDocument(xml);
		Clima c=ParseaXML.parsearXML(documento_xml);
		EntradaSalida.mostrarPrediccion(c);*/
	}

}
