package com.rapido.rider.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rapido.rider.dto.CordinateDto;
import com.rapido.rider.dto.ResponseStructure;
import com.rapido.rider.dto.Riderdto;
import com.rapido.rider.dto.Vehicledto;
import com.rapido.rider.entity.Rider;
import com.rapido.rider.service.RiderService;




@RestController
public class Ridercontroller {
	@Autowired
	private RiderService riderservice;
	@PostMapping("/rider/createaccount")
	public void createacc(@RequestBody Riderdto riderdto)
	{
		riderservice.createaccservice(riderdto);
	}
	@DeleteMapping("/rider/deleteaccount")
	public ResponseStructure<Rider> deleteacc(@RequestParam int id)
	{
		return riderservice.deleteByID(id);
	}
	@GetMapping("/rider/findrider")
	public ResponseStructure<Rider> findrider(@RequestParam int id)
	{
		return riderservice.findById(id);
	}
	@PatchMapping("/rider/updatevehicle/{id}")
	public void updatevehicle(@PathVariable int id,@RequestBody Vehicledto vehicledto )
	{
		riderservice.updateVehicleService(id,vehicledto);
	}
	
	@PatchMapping("/rider/updatestatus")
	public void updateStatus(@RequestParam int id) {
		riderservice.updateStatus(id);
	}
	
	@PostMapping("/rider/sendcurrentlocation")
	public void currentlocation(@RequestParam int id, @RequestParam String vehicletype,
			@RequestBody CordinateDto cordinatedto) {
		riderservice.currentLocationService(id, vehicletype, cordinatedto);
	}
	
	

}
