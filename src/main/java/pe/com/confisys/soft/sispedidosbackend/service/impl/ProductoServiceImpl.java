package pe.com.confisys.soft.sispedidosbackend.service.impl;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.confisys.soft.sispedidosbackend.model.ProductoEntity;
import pe.com.confisys.soft.sispedidosbackend.repository.ProductoRepository;
import pe.com.confisys.soft.sispedidosbackend.service.ProductoService;
import pe.com.confisys.soft.sispedidosbackend.utils.Constantes;
import pe.com.confisys.soft.sispedidosbackend.utils.PedidosUtils;
import pe.com.confisys.soft.sispedidosbackend.utils.ResponseBean;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository; 

	@Override
	public ResponseBean<ProductoEntity> listarTodos() {
		ResponseBean<ProductoEntity> respuesta = new ResponseBean<>();
		try {
			
			Iterable<ProductoEntity> itProducto = StreamSupport.stream(productoRepository.findAll().spliterator(), false)
					.filter( producto -> producto.getActivo().intValue() == Constantes.COD_REG_ACTIVO )
					.collect(Collectors.toList());
			
			respuesta.setDataLst(itProducto);
			
		} catch(Exception ex) {
			PedidosUtils.buildResponseError(respuesta, ex);
		}
		return respuesta;
	}

	@Override
	public ResponseBean<ProductoEntity> obtenerPorId(Integer id) {
		ResponseBean<ProductoEntity> respuesta;

		respuesta = new ResponseBean<>();
		
		try {
			respuesta.setDataObj(this.productoRepository.findById(id)
					.filter(producto -> producto.getActivo().intValue() == Constantes.COD_REG_ACTIVO));
		} catch(Exception ex) {
			PedidosUtils.buildResponseError(respuesta, ex);
		}
		
		return respuesta;
	}

	@Override
	public ResponseBean<ProductoEntity> crear(ProductoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoEntity actualizar(ProductoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
