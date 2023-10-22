package com.example.esprituniv.controller;

import com.example.esprituniv.services.IReservationService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
    IReservationService reservationService;
}
