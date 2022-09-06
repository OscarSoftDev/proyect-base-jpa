package co.proyect.base.back.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.proyect.base.back.base.dto.Property;

public interface PropertyController {

    @GetMapping("/property")
    ResponseEntity<List<Property>> getAll();

    @PostMapping("/property")
    ResponseEntity<Void> add(@RequestBody Property property);

    @GetMapping("/property/{id}")
    ResponseEntity<Property> getPropertyById(@PathVariable Integer id);
    
    @PutMapping("/property/update")
    ResponseEntity<Void> update(@RequestBody Property property);
    
    @DeleteMapping("/property/{id}")
    ResponseEntity<Void> deletePropertyById(@PathVariable Integer id);
}
