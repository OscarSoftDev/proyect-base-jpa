package co.proyect.base.back.output.persistence.jpa;

import java.util.List;

import co.proyect.base.back.base.dto.Property;


public interface PropertyPersistenceJpa {

	void add(Property property);
	
	List<Property> getAll();
	
	Property getById(Integer id);
    
    void update(Property property);
    
    void deleteById(Integer id);
}
