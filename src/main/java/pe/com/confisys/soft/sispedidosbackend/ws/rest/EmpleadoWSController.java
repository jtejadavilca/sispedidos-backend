package pe.com.confisys.soft.sispedidosbackend.ws.rest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.confisys.soft.sispedidosbackend.model.EmpleadoEntity;
import pe.com.confisys.soft.sispedidosbackend.service.EmpleadoService;
import pe.com.confisys.soft.sispedidosbackend.utils.ResponseBean;

@RestController
@RequestMapping("/syspedidos/empleados")
public class EmpleadoWSController {
	private static final Log logger = LogFactory.getLog(EmpleadoWSController.class);
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping(path="/all")
	protected ResponseBean<EmpleadoEntity> getAll() {
		logger.info("[getAll] << ENTER");
		ResponseBean<EmpleadoEntity> respuesta;
		
		respuesta = this.empleadoService.listarTodos(); 
		logger.info("[getAll] >> EXIT");
		return respuesta;
	}

	@GetMapping(path="/{empleadoId}")
	protected ResponseBean<EmpleadoEntity> getById(@PathVariable Integer empleadoId){
		logger.info("[getById] << ENTER");
		ResponseBean<EmpleadoEntity> respuesta;
		
		respuesta = this.empleadoService.obtenerPorId(empleadoId);
		logger.info("[getById] >> EXIT");
		return respuesta;
	}

	@PostMapping(path="/empleado")
	protected ResponseBean<EmpleadoEntity> saveEmpleado(@RequestBody EmpleadoEntity empleado){
		logger.info("[saveEmpleado] << ENTER");
		ResponseBean<EmpleadoEntity> respuesta;
		
		respuesta = this.empleadoService.crear(empleado);
		logger.info("[saveEmpleado] >> EXIT");
		return respuesta;
	}
}
