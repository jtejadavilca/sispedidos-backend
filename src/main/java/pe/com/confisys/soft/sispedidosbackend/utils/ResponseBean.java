package pe.com.confisys.soft.sispedidosbackend.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class ResponseBean<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3575781638735495620L;

	private boolean estado = true;
	private List<String> mensajesErrores;
	private Object dataObj;
	private Iterable<T> dataLst;
	
	public void addMensajeError(String msj) {
		if(mensajesErrores == null) {
			mensajesErrores = new ArrayList<>();
		}
		mensajesErrores.add(msj);
	}
	
}
