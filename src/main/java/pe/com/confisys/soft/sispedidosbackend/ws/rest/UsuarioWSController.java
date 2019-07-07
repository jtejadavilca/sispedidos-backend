package pe.com.confisys.soft.sispedidosbackend.ws.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.confisys.soft.sispedidosbackend.model.Usuario;
import pe.com.confisys.soft.sispedidosbackend.repository.UsuarioRepository;

@RestController
@RequestMapping("/syspedidos/user")
public class UsuarioRestController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping(path="/all")
	public Iterable<Usuario> getAllUsers() {
		// This returns a JSON or XML with the users
		return usuarioRepository.findAll();
	}
}
