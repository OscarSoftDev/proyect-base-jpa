package co.proyect.base.back.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import co.proyect.base.back.base.dto.Property;
import co.proyect.base.back.controller.PropertyController;
import co.proyect.base.back.core.service.PropertyService;


@RestController
public class PropertyControllerImpl  implements PropertyController {

	@Autowired
	private PropertyService propertyService;
	
    public ResponseEntity<List<Property>> getAll() {
        return new ResponseEntity<List<Property>>(propertyService.getAll(), HttpStatus.OK);
    }

    public ResponseEntity<Void> add(Property property) {
    	propertyService.add(property);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Property> getPropertyById(Integer id) {
        return new ResponseEntity<Property>(propertyService.getById(id), HttpStatus.OK);
    }

	public ResponseEntity<Void> update(Property property) {
		propertyService.update(property);
        return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> deletePropertyById(Integer id){
			propertyService.deleteById(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
