package com.rapido.rider.service;

	import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpStatus;
	import org.springframework.stereotype.Service;
 
import com.rapido.rider.dto.CordinateDto;
import com.rapido.rider.dto.ResponseStructure;
import com.rapido.rider.dto.Riderdto;
import com.rapido.rider.dto.Vehicledto;
import com.rapido.rider.entity.Rider;
import com.rapido.rider.entity.Vehicle;
import com.rapido.rider.exception.RiderNotFoundException;
import com.rapido.rider.repositry.RiderRepositry;
import com.rapido.rider.repositry.VehicleRepositry;

	@Service
	public class RiderService {
		@Autowired
		RiderRepositry riderrepository;
		@Autowired
		VehicleRepositry vehiclerepository;
		@Autowired
		private StringRedisTemplate redistemplate;
		
		public void createaccservice(Riderdto riderdto)
		{
			Rider rider=new Rider();
			rider.setRidername(riderdto.getName());
			rider.setRidermobno(riderdto.getMobno());
			rider.setRidergender(riderdto.getGender());
			rider.setRidermail(riderdto.getEmail());
			rider.setLicense(riderdto.getLicense());
			Vehicledto vehicledto = riderdto.getVd();
			Vehicle vehicle=new Vehicle();
			vehicle.setVehciletype(vehicledto.getType());
			vehicle.setVehcileno(vehicledto.getVehicleno());
			vehicle.setName(vehicledto.getName());
			vehicle.setModel(vehicledto.getModel());
			rider.setVehcile(vehicle);
			riderrepository.save(rider);	
		}
		public ResponseStructure<Rider> deleteByID(int id) {
			Rider rider=riderrepository.findById(id).orElseThrow(()-> new RiderNotFoundException());
			riderrepository.delete(rider);
			ResponseStructure<Rider> response=new ResponseStructure<Rider>();
			response.setData(rider);
			response.setMessage("rider with id is deleted");
			response.setStatuscode(HttpStatus.FOUND.value());
			return response;
			
		}
		public ResponseStructure<Rider> findById(int id) {
			Rider rider=riderrepository.findById(id).orElseThrow(()-> new RiderNotFoundException());
		
			ResponseStructure<Rider> response=new ResponseStructure<Rider>();
			response.setData(rider);
			response.setMessage("rider with id is found");
			response.setStatuscode(HttpStatus.FOUND.value());
			return response;
		}
		public void updateVehicleService(int riderid, Vehicledto vehicledto) {
			Rider rider=riderrepository.findById(riderid).orElseThrow(()-> new RiderNotFoundException());
			Vehicle oldvehicle=rider.getVehcile();
			if(oldvehicle!=null)
			{
				rider.setVehcile(null);
				riderrepository.save(rider);
				vehiclerepository.delete(oldvehicle);
			}
			Vehicle newVehicle=new Vehicle();
			newVehicle.setName(vehicledto.getName());
			newVehicle.setModel(vehicledto.getModel());
			newVehicle.setVehcileno(vehicledto.getVehicleno());
			newVehicle.setVehciletype(vehicledto.getType());
			rider.setVehcile(newVehicle);
			riderrepository.save(rider);
			
		}
		public void currentLocationService(int id, String vehicletype, CordinateDto cordinatedto) {
			String key = vehicletype.toLowerCase();
			Point cordinates = new Point(cordinatedto.getLongitude(), cordinatedto.getLatitude());
			redistemplate.opsForGeo().add(key, cordinates, String.valueOf(id));
			redistemplate.expire(key, Duration.ofDays(30));
			
		}
		public void updateStatus(int id) {
			Rider rider = riderrepository.findById(id).orElseThrow(() -> new RiderNotFoundException());
			if (rider.getRiderstatus().equals("offline")) {
				rider.setRiderstatus("online");
			} else if (rider.getRiderstatus().equals("online")) {
				rider.setRiderstatus("offline");
			}
			riderrepository.save(rider);
			
		}
		 
		
		

	}


