package pe.com.confisys.soft.sispedidosbackend.model;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Usuario implements Serializable{

	private String username;
	private String password;
}
