package pe.com.confisys.soft.sispedidosbackend.service;

import pe.com.confisys.soft.sispedidosbackend.utils.ResponseBean;

public interface BaseService<T> {
	ResponseBean<T> listarTodos();

	ResponseBean<T> obtenerPorId(Integer id);
	
	ResponseBean<T> crear(T entity);
	
	T actualizar(T entity);
}
