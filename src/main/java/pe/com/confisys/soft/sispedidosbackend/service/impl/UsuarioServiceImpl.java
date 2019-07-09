package pe.com.confisys.soft.sispedidosbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.confisys.soft.sispedidosbackend.model.EmpleadoEntity;
import pe.com.confisys.soft.sispedidosbackend.model.UsuarioEntity;
import pe.com.confisys.soft.sispedidosbackend.repository.UsuarioRepository;
import pe.com.confisys.soft.sispedidosbackend.service.UsuarioService;
import pe.com.confisys.soft.sispedidosbackend.utils.ResponseBean;

public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public ResponseBean<UsuarioEntity> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBean<UsuarioEntity> obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBean<UsuarioEntity> crear(UsuarioEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioEntity actualizar(UsuarioEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crearCuentaUsuario(EmpleadoEntity empleado) {
		UsuarioEntity usuario;
		
		usuario = new UsuarioEntity();
//		usuario.set
		
		usuarioRepository.save(usuario);
	}

}
