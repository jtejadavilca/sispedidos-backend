package pe.com.confisys.soft.sispedidosbackend.service.impl;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.confisys.soft.sispedidosbackend.model.ClienteEntity;
import pe.com.confisys.soft.sispedidosbackend.repository.ClienteRepository;
import pe.com.confisys.soft.sispedidosbackend.service.ClienteService;
import pe.com.confisys.soft.sispedidosbackend.utils.Constantes;
import pe.com.confisys.soft.sispedidosbackend.utils.PedidosUtils;
import pe.com.confisys.soft.sispedidosbackend.utils.ResponseBean;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository; 
	
	@Override
	public ResponseBean<ClienteEntity> listarTodos() {
		ResponseBean<ClienteEntity> respuesta = new ResponseBean<>();
		try {
			
			Iterable<ClienteEntity> itCliente = StreamSupport.stream(clienteRepository.findAll().spliterator(), false)
					.filter( cliente -> cliente.getActivo().intValue() == Constantes.COD_REG_ACTIVO )
					.collect(Collectors.toList());
			
			respuesta.setDataLst(itCliente);
			
		} catch(Exception ex) {
			PedidosUtils.buildResponseError(respuesta, ex);
		}
		return respuesta;
	}

	@Override
	public ResponseBean<ClienteEntity> obtenerPorId(Integer id) {
		ResponseBean<ClienteEntity> respuesta;

		respuesta = new ResponseBean<>();
		
		try {
			respuesta.setDataObj(this.clienteRepository
					.findById(id).filter(cliente -> cliente.getActivo().intValue() == Constantes.COD_REG_ACTIVO));
		} catch(Exception ex) {
			PedidosUtils.buildResponseError(respuesta, ex);
		}
		
		return respuesta;
	}

	@Override
	public ResponseBean<ClienteEntity> crear(ClienteEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteEntity actualizar(ClienteEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
