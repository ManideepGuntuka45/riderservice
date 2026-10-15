package com.rapido.rider.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapido.rider.entity.Rider;

public interface RiderRepositry extends JpaRepository<Rider, Integer>{

}
