package pe.com.confisys.soft.sispedidosbackend.ws.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.confisys.soft.sispedidosbackend.model.UsuarioEntity;
import pe.com.confisys.soft.sispedidosbackend.repository.UsuarioRepository;

@RestController
@RequestMapping("/syspedidos/usuarios")
public class UsuarioWSController {

	@Autowired
//	private AdminRepository<Usuario> adminRepository;
	private UsuarioRepository adminRepository;
	
	@GetMapping(path="/all")
	protected Iterable<UsuarioEntity> getAll(){
		return this.adminRepository.findAll();
	}
}
