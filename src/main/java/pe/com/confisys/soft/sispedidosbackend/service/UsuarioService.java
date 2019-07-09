package pe.com.confisys.soft.sispedidosbackend.service;

import pe.com.confisys.soft.sispedidosbackend.model.EmpleadoEntity;
import pe.com.confisys.soft.sispedidosbackend.model.UsuarioEntity;

public interface UsuarioService extends BaseService<UsuarioEntity> {
	public void crearCuentaUsuario(EmpleadoEntity empleado);
}
