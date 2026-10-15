package com.rapido.rider.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapido.rider.entity.Vehicle;

public interface VehicleRepositry extends JpaRepository<Vehicle, Integer>{

}
