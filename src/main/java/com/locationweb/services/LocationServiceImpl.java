package com.locationweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationweb.entity.Locations;
import com.locationweb.repository.LocationRepository;
@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationrepo;
	
	@Override
	public void saveLocation(Locations location) {
		locationrepo.save(location);
	}

	@Override
	public List<Locations> getAllLocations() {
		List<Locations> locations = locationrepo.findAll();
		return locations;
	}

	@Override
	public void deleteLocationById(long id) {
		locationrepo.deleteById(id);
		
	}

	@Override
	public Locations updateLocationById(long id) {
		Optional<Locations> findById = locationrepo.findById(id);
		Locations location = findById.get();
		
		return location;
	}

}
