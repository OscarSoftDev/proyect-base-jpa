package co.proyect.base.back.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.proyect.base.back.base.dto.Property;
import co.proyect.base.back.core.service.PropertyService;
import co.proyect.base.back.output.persistence.jpa.PropertyPersistenceJpa;

@Service
public class PropertyServiceImpl implements PropertyService{

	@Autowired
	private PropertyPersistenceJpa propertyPersistenceJpa;
	
	@Override
	public void add(Property property) {
		propertyPersistenceJpa.add(property);
	}

	@Override
	public List<Property> getAll() {
		return propertyPersistenceJpa.getAll();
	}

	@Override
	public Property getById(Integer id) {
		 return propertyPersistenceJpa.getById(id);
	}

	@Override
	public void update(Property property) {
		propertyPersistenceJpa.update(property);	
	}

	@Override
	public void deleteById(Integer id) {
		propertyPersistenceJpa.deleteById(id);	
	}

}
