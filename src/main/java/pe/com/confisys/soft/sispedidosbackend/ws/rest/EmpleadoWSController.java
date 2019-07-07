package pe.com.confisys.soft.sispedidosbackend.ws.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.confisys.soft.sispedidosbackend.model.EmpleadoEntity;
import pe.com.confisys.soft.sispedidosbackend.repository.EmpleadoRepository;

@RestController
@RequestMapping("/syspedidos/empleados")
public class EmpleadoWSController {
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@GetMapping(path="/all")
	protected Iterable<EmpleadoEntity> getAll(){
		return this.empleadoRepository.findAll();
	}
}
