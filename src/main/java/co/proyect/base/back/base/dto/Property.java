package co.proyect.base.back.base.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Property {

	private Integer idProperty;
	private String datoProperty;
	@JsonFormat(timezone="America/Bogota")
	private Date fechaProperty;
	private BigDecimal pesosProperty;
	private boolean estado;
	
}
