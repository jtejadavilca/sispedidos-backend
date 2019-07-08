package pe.com.confisys.soft.sispedidosbackend.service;

import java.util.Optional;

public interface BaseService<T> {
	Iterable<T> listarTodos();

	Optional<T> obtenerPorId(Integer id);
	
	T crear(T entity);
	
	T actualizar(T entity);
}
