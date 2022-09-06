package co.proyect.base.back.persistence.jpa.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="PROPERTY")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PropertyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_PROPERTY")
    private Integer idProperty;
    
    @Column(name="DATO_PROPERTY")
    private String datoProperty;
    
    @Column(name="FECHA_PROPERTY")
	private Date fechaProperty;
	
	@Column(name="PESOS_PROPERTY")
	private BigDecimal pesosProperty;
	
	@Column(name="ESTADO", columnDefinition = "BIT")
	private boolean estado;
}
