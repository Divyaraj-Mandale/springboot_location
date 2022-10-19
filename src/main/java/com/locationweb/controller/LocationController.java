package com.locationweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationweb.dto.LocationData;
import com.locationweb.entity.Locations;
import com.locationweb.services.LocationService;
import com.locationweb.utility.EmailService;

@Controller
public class LocationController {

	@Autowired
	private LocationService locationservice;
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/show")
	public String showLocationPage() {
		return "create_location";
	}
	
	//entity class
	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute("loc") Locations location, ModelMap model) {
		locationservice.saveLocation(location);
		emailService.sendSimpleMessage("rameshwargarade@gmail.com", "testing", "your welcome");
	model.addAttribute("msg","Location saved!!!");
		return "create_location";
	}
	@RequestMapping("listall")
	public String listALl(ModelMap model) {
		List<Locations> locations = locationservice.getAllLocations();
		model.addAttribute("location",locations);
		return "search_Result";
	}
	@RequestMapping("/delete")
	public String deleteLocation(@RequestParam("id") long id,ModelMap model) {
		locationservice.deleteLocationById(id);
		List<Locations> locations = locationservice.getAllLocations();
		model.addAttribute("location",locations);
		return "search_Result";
	}
	
	@RequestMapping("/update")
	public String updateLocation(@RequestParam("id") long id,ModelMap model) {
		Locations location = locationservice.updateLocationById(id);
		model.addAttribute("location",location);
		return "update_location";
	}
	
	@RequestMapping("/updateData")
	public String updateData(@ModelAttribute("loc") Locations location, ModelMap model) {
		locationservice.saveLocation(location);
	model.addAttribute("msg","Location updated!!!");
		return "update_location";
	}
	
//	@RequestMapping("/saveLocation")
//	public String saveLocation(LocationData loc,ModelMap model) {
//		Locations location=new Locations();
//		location.setId(loc.getId());
//		location.setName(loc.getName());
//		location.setCodes(loc.getCodes());
//		location.setType(loc.getType());
//		model.addAttribute("msg","Location saved!!!");
//		locationservice.saveLocation(location);
//		return "create_location";
//	}
	
//	@RequestMapping("/saveLocation")
//	public String saveLocation(@RequestParam("id") long id, @RequestParam("name") String name,@RequestParam("codes") String code,@RequestParam("type") String type, ModelMap model) {
//		Locations location=new Locations();
//		location.setId(id);
//		location.setName(name);
//		location.setCodes(code);
//		location.setType(type);
//		model.addAttribute("msg","Location saved!!!");
//		locationservice.saveLocation(location);
//		return "create_location";
//	}
}
