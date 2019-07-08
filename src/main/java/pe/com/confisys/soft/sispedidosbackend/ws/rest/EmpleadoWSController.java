package pe.com.confisys.soft.sispedidosbackend.ws.rest;

import java.util.Optional;

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

@RestController
@RequestMapping("/syspedidos/empleados")
public class EmpleadoWSController {
	private static final Log logger = LogFactory.getLog(EmpleadoWSController.class);
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping(path="/all")
	protected Iterable<EmpleadoEntity> getAll(){
		logger.info("[getAll] << ENTER");

		Iterable<EmpleadoEntity> lstEmpleados;
		
		lstEmpleados = this.empleadoService.listarTodos(); 
		
		logger.info("[getAll] >> EXIT");
		return lstEmpleados;
	}

	@GetMapping(path="/{empleadoId}")
	protected Optional<EmpleadoEntity> getById(@PathVariable Integer empleadoId){
		return this.empleadoService.obtenerPorId(empleadoId);
	}
	@PostMapping(path="/empleado")
	protected EmpleadoEntity saveEmpleado(@RequestBody EmpleadoEntity empleado){
		return this.empleadoService.crear(empleado);
	}
}
