package pe.com.confisys.soft.sispedidosbackend.ws.rest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.com.confisys.soft.sispedidosbackend.model.CatalogoEntity;
import pe.com.confisys.soft.sispedidosbackend.service.CatalogoService;
import pe.com.confisys.soft.sispedidosbackend.utils.ResponseBean;

@RestController
@RequestMapping("/syspedidos/catalogos")
@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.GET,RequestMethod.POST})
public class CatalogoWSController {
//obtenerCatalogo

	private static final Log logger = LogFactory.getLog(CatalogoWSController.class);
	@Autowired
	private CatalogoService catalogoService;
	
	@GetMapping(path="/obtenercatalogo/{codCatalogo}")
	protected ResponseBean<CatalogoEntity> obtenerCatalogo(@PathVariable String codCatalogo) {
		logger.info("[obtenerCatalogo] << ENTER");
		ResponseBean<CatalogoEntity> respuesta;
		
		respuesta = this.catalogoService.obtenerCatalogo(codCatalogo); 
		logger.info("[obtenerCatalogo] >> EXIT");
		return respuesta;
	}
}
