package pe.com.confisys.soft.sispedidosbackend.ws.rest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.com.confisys.soft.sispedidosbackend.model.ClienteEntity;
import pe.com.confisys.soft.sispedidosbackend.service.ClienteService;
import pe.com.confisys.soft.sispedidosbackend.utils.Constantes;
import pe.com.confisys.soft.sispedidosbackend.utils.ResponseBean;

@RestController
@RequestMapping("/syspedidos/clientes")
@CrossOrigin(origins = Constantes.URL_CLIENTE_CROSS_ORIGIN, methods= {RequestMethod.GET,RequestMethod.POST})
public class ClienteWSController {
	
	private static final Log logger = LogFactory.getLog(ClienteWSController.class);
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(path="/all")
	protected ResponseBean<ClienteEntity> getAll() {
		logger.info("[getAll] << ENTER");
		ResponseBean<ClienteEntity> respuesta;
		
		respuesta = this.clienteService.listarTodos(); 
		logger.info("[getAll] >> EXIT");
		return respuesta;
	}

	@GetMapping(path="/{clienteId}")
	protected ResponseBean<ClienteEntity> getById(@PathVariable Integer clienteId){
		logger.info("[getById] << ENTER");
		ResponseBean<ClienteEntity> respuesta;
		
		respuesta = this.clienteService.obtenerPorId(clienteId);
		logger.info("[getById] >> EXIT");
		return respuesta;
	}

	@PostMapping(path="/cliente")
	protected ResponseBean<ClienteEntity> saveCliente(@RequestBody ClienteEntity cliente){
		logger.info("[saveCliente] << ENTER");
		ResponseBean<ClienteEntity> respuesta;
		
		respuesta = this.clienteService.crear(cliente);
		logger.info("[saveCliente] >> EXIT");
		return respuesta;
	}
}
