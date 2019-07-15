package pe.com.confisys.soft.sispedidosbackend.ws.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.com.confisys.soft.sispedidosbackend.model.UsuarioEntity;
import pe.com.confisys.soft.sispedidosbackend.repository.UsuarioRepository;
import pe.com.confisys.soft.sispedidosbackend.utils.Constantes;

@RestController
@RequestMapping("/syspedidos/usuarios")
@CrossOrigin(origins = Constantes.URL_CLIENTE_CROSS_ORIGIN, methods= {RequestMethod.GET,RequestMethod.POST})
public class UsuarioWSController {

	@Autowired
//	private AdminRepository<Usuario> adminRepository;
	private UsuarioRepository adminRepository;
	
	@GetMapping(path="/all")
	protected Iterable<UsuarioEntity> getAll(){
		return this.adminRepository.findAll();
	}
}
