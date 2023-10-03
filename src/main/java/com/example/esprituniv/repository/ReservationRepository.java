package com.example.esprituniv.repository;

import com.example.esprituniv.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository <Reservation, String> {
}
