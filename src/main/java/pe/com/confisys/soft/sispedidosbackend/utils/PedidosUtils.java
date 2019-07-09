package pe.com.confisys.soft.sispedidosbackend.utils;

public class PedidosUtils {

	@SuppressWarnings("rawtypes")
	public static void buildResponseError(ResponseBean response, Exception ex) {
		response.setEstado(false);
		response.addMensajeError(ex.getMessage());
	}
	
}
