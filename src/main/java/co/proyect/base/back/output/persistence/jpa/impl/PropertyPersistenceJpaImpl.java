package co.proyect.base.back.output.persistence.jpa.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.hibernate.PropertyNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import co.proyect.base.back.base.dto.Property;
import co.proyect.base.back.output.persistence.jpa.PropertyPersistenceJpa;
import co.proyect.base.back.persistence.jpa.entity.PropertyEntity;
import co.proyect.base.back.persistence.jpa.repository.PropertyRepository;

@Component
public class PropertyPersistenceJpaImpl  implements PropertyPersistenceJpa{


	@Autowired
	private PropertyRepository propertyRepository;
	
	private final ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public void add(Property property){
		PropertyEntity propertyEntity = new PropertyEntity();
		if(property.getIdProperty()!=null) {
			throw new PropertyNotFoundException("No es posible agregar Property");
		}
		propertyEntity=modelMapper.map(property, PropertyEntity.class);
		propertyRepository.save(propertyEntity);
	}

	@Override
	public List<Property> getAll() {
		List<Property> listProperty=new ArrayList<Property>();
		List<PropertyEntity> propertyEntity= propertyRepository.findAll();
		listProperty=modelMapper.map(propertyEntity, List.class);
		
		return listProperty;
	}

	@Override
	public Property getById(Integer id) {
		Optional<PropertyEntity> propertyEntity = propertyRepository.findById(id);
		if (!propertyEntity.isPresent()) {
			throw new PropertyNotFoundException("No se encontro Property en getById");
		}
		Property property = modelMapper.map(propertyEntity, Property.class);
		return property;
	}

	@Override
	public void update(Property property) {
		Optional<PropertyEntity> optPropertyEntity=propertyRepository.findById(property.getIdProperty());
		if(!optPropertyEntity.isPresent()) {
			throw new PropertyNotFoundException("No se encontro Property en metodo Update");
		}
		
		PropertyEntity propertyEntity=modelMapper.map(property, PropertyEntity.class);
		propertyRepository.save(propertyEntity);
	}
	
	@Override
	public void deleteById(Integer id) {
		Optional<PropertyEntity> optPropertyEntity=propertyRepository.findById(id);
		if(!optPropertyEntity.isPresent()) {
			throw new PropertyNotFoundException("No se encontro Property en metodo Eliminar");
		}
		propertyRepository.deleteById(id);
	}
}
