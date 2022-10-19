package com.locationweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locationweb.entity.Locations;
import com.locationweb.repository.LocationRepository;

@RestController
@RequestMapping("/location/api")
public class LocationRestController {

	@Autowired
	private LocationRepository locationrepo;
	
	@GetMapping("{a}/{b}")
	public int add(@PathVariable("a") int a,@PathVariable("b") int b) {
		int sum = a + b;
		return sum;
	}
	
	@GetMapping("{a}")
	public String add(@PathVariable("a") String a) {
	
		return a;
	}
	
	@GetMapping
	public List<Locations> getLocation(){
		List<Locations> location = locationrepo.findAll();
		return location;
	}
	
	@PostMapping
	public void saveLocation(@RequestBody Locations location){
		locationrepo.save(location);
	}
	
	@PutMapping
	public void updateLocation(@RequestBody Locations location){
		locationrepo.save(location);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteLocation(@PathVariable("id") long id){
		locationrepo.deleteById(id);
	}
	
	@GetMapping("/get/{id}")
	public Locations getOneLocation(@PathVariable("id") long id) {
		Optional<Locations> location = locationrepo.findById(id);
		Locations locations = location.get();
		return locations;
	}
}
