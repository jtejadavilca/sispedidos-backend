package pe.com.confisys.soft.sispedidosbackend.service.impl;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.confisys.soft.sispedidosbackend.exceptions.PedidosServiceException;
import pe.com.confisys.soft.sispedidosbackend.model.EmpleadoEntity;
import pe.com.confisys.soft.sispedidosbackend.repository.DatosPersonalesRepository;
import pe.com.confisys.soft.sispedidosbackend.repository.EmpleadoRepository;
import pe.com.confisys.soft.sispedidosbackend.service.EmpleadoService;
import pe.com.confisys.soft.sispedidosbackend.utils.Constantes;
import pe.com.confisys.soft.sispedidosbackend.utils.PedidosUtils;
import pe.com.confisys.soft.sispedidosbackend.utils.ResponseBean;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoRepository empleadoRepository;
	@Autowired
	private DatosPersonalesRepository datosPersonalesRepository;

	@Override
	public ResponseBean<EmpleadoEntity> listarTodos() {
		ResponseBean<EmpleadoEntity> respuesta = new ResponseBean<>();
		try {

			Iterable<EmpleadoEntity> itEmpleado = StreamSupport.stream(empleadoRepository.findAll().spliterator(), false)
					.filter(empleado -> empleado.getId().intValue() > 1 && empleado.getActivo().intValue() == Constantes.COD_REG_ACTIVO)
					.collect(Collectors.toList());

			respuesta.setDataLst(itEmpleado);

		} catch(Exception ex) {
			PedidosUtils.buildResponseError(respuesta, ex);
		}
		return respuesta;
	}

	@Override
	public ResponseBean<EmpleadoEntity> obtenerPorId(Integer id) {
		ResponseBean<EmpleadoEntity> respuesta;
		
		respuesta = new ResponseBean<>();
		
		try {
			respuesta.setDataObj(this.empleadoRepository.findById(id)
					.filter(empleado -> empleado.getId().intValue() > 1 && empleado.getActivo().intValue() == Constantes.COD_REG_ACTIVO));
		} catch(Exception ex) {
			PedidosUtils.buildResponseError(respuesta, ex);
		}

		return respuesta;
	}

	@Override
	public ResponseBean<EmpleadoEntity> crear(EmpleadoEntity empleado) {
		ResponseBean<EmpleadoEntity> respuesta = new ResponseBean<>();
		try {
			if(empleado.getDatosPersonalesEntity() == null) {
				throw new PedidosServiceException("Debe ingresar datos del Empleado");
			}
			datosPersonalesRepository.save(empleado.getDatosPersonalesEntity());
			respuesta.setDataObj(this.empleadoRepository.save(empleado));
		} catch(PedidosServiceException pse) {
			PedidosUtils.buildResponseError(respuesta, pse);
		} catch( Exception ex ) {
			
		}
		return respuesta;
	}

	@Override
	public EmpleadoEntity actualizar(EmpleadoEntity empleado) {
		return null;
	}

}
