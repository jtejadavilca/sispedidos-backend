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

import pe.com.confisys.soft.sispedidosbackend.model.ProductoEntity;
import pe.com.confisys.soft.sispedidosbackend.service.ProductoService;
import pe.com.confisys.soft.sispedidosbackend.utils.Constantes;
import pe.com.confisys.soft.sispedidosbackend.utils.ResponseBean;

@RestController
@RequestMapping("/syspedidos/productos")
@CrossOrigin(origins = Constantes.URL_CLIENTE_CROSS_ORIGIN, methods= {RequestMethod.GET,RequestMethod.POST})
public class ProductoWSController {
	
	private static final Log logger = LogFactory.getLog(ProductoWSController.class);
	@Autowired
	private ProductoService productoService;
	
	@GetMapping(path="/all")
	protected ResponseBean<ProductoEntity> getAll() {
		logger.info("[getAll] << ENTER");
		ResponseBean<ProductoEntity> respuesta;
		
		respuesta = this.productoService.listarTodos(); 
		logger.info("[getAll] >> EXIT");
		return respuesta;
	}

	@GetMapping(path="/{productoId}")
	protected ResponseBean<ProductoEntity> getById(@PathVariable Integer productoId){
		logger.info("[getById] << ENTER");
		ResponseBean<ProductoEntity> respuesta;
		
		respuesta = this.productoService.obtenerPorId(productoId);
		logger.info("[getById] >> EXIT");
		return respuesta;
	}

	@PostMapping(path="/producto")
	protected ResponseBean<ProductoEntity> saveProducto(@RequestBody ProductoEntity producto){
		logger.info("[saveProducto] << ENTER");
		ResponseBean<ProductoEntity> respuesta;
		
		respuesta = this.productoService.crear(producto);
		logger.info("[saveProducto] >> EXIT");
		return respuesta;
	}
}
