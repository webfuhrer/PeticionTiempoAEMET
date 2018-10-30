package paquetepiedeaemet;

import org.jdom2.Document;

public class PrincipalPideTiempoAEMET {

	public static void main(String[] args) {
		String codigo=EntradaSalida.pedirCodigoMunicipio();
		String xml=AccesoWeb.pedirXML(codigo);
		Document documento_xml=ParseaXML.convertirStringEnDocument(xml);
		Clima c=ParseaXML.parsearXML(documento_xml);
		EntradaSalida.mostrarPrediccion(c);
	}

}
