package pe.com.confisys.soft.sispedidosbackend.service;

import pe.com.confisys.soft.sispedidosbackend.model.CatalogoEntity;
import pe.com.confisys.soft.sispedidosbackend.utils.ResponseBean;

public interface CatalogoService {
	ResponseBean<CatalogoEntity> obtenerCatalogo(String codCatalogo);

	ResponseBean<CatalogoEntity> cargarCatalogos();
}
