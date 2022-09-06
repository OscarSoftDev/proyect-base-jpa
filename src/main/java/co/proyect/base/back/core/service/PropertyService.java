package co.proyect.base.back.core.service;

import java.util.List;

import co.proyect.base.back.base.dto.Property;

public interface PropertyService {

	void add(Property property);
	
	List<Property> getAll();
	
	Property getById(Integer id);
    
    void update(Property property);
    
    void deleteById(Integer id);
}
