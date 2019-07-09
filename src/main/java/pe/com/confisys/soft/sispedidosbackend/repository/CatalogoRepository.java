package pe.com.confisys.soft.sispedidosbackend.repository;

import org.springframework.data.repository.CrudRepository;

import pe.com.confisys.soft.sispedidosbackend.model.CatalogoEntity;
import pe.com.confisys.soft.sispedidosbackend.model.CatalogoEntityPK;

public interface CatalogoRepository extends CrudRepository<CatalogoEntity, CatalogoEntityPK> {

}
