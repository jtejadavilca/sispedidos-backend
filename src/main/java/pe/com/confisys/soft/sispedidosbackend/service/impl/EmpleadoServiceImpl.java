package pe.com.confisys.soft.sispedidosbackend.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.confisys.soft.sispedidosbackend.model.EmpleadoEntity;
import pe.com.confisys.soft.sispedidosbackend.repository.DatosPersonalesRepository;
import pe.com.confisys.soft.sispedidosbackend.repository.EmpleadoRepository;
import pe.com.confisys.soft.sispedidosbackend.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoRepository empleadoRepository;
	@Autowired
	private DatosPersonalesRepository datosPersonalesRepository;

	@Override
	public Iterable<EmpleadoEntity> listarTodos() {
		return this.empleadoRepository.findAll();
	}

	@Override
	public Optional<EmpleadoEntity> obtenerPorId(Integer id) {
		return this.empleadoRepository.findById(id);
	}

	@Override
	public EmpleadoEntity crear(EmpleadoEntity empleado) {
		if(empleado.getDatosPersonalesEntity() == null) {
			return null;//TODO: Manejar error
		}
		datosPersonalesRepository.save(empleado.getDatosPersonalesEntity());
		return this.empleadoRepository.save(empleado);
	}

	@Override
	public EmpleadoEntity actualizar(EmpleadoEntity empleado) {
		return null;
	}

}
