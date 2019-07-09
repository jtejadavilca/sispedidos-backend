package pe.com.confisys.soft.sispedidosbackend.service.impl;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.confisys.soft.sispedidosbackend.model.CatalogoEntity;
import pe.com.confisys.soft.sispedidosbackend.repository.CatalogoRepository;
import pe.com.confisys.soft.sispedidosbackend.service.CatalogoService;
import pe.com.confisys.soft.sispedidosbackend.utils.Constantes;
import pe.com.confisys.soft.sispedidosbackend.utils.PedidosUtils;
import pe.com.confisys.soft.sispedidosbackend.utils.ResponseBean;

@Service
public class CatalogoServiceImpl implements CatalogoService {

	@Autowired
	private CatalogoRepository catalogoRepository;
	
	@Override
	public ResponseBean<CatalogoEntity> obtenerCatalogo(String codCatalogo) {
		ResponseBean<CatalogoEntity> respuesta;
		
		respuesta = new ResponseBean<>();
		try {
			Iterable<CatalogoEntity> itCat = StreamSupport.stream(catalogoRepository.findAll().spliterator(), false)
					.filter(catalogo -> codCatalogo.equals(catalogo.getCatalogoEntityPK().getParamCatalogo()) && !Constantes.COD_SYSADMIN.equals(catalogo.getDescripcion()))
					.collect(Collectors.toList());
			
			respuesta.setDataLst(itCat);
		} catch (Exception ex) {
			PedidosUtils.buildResponseError(respuesta, ex);
		}
		return respuesta;
	}

	
	
}
