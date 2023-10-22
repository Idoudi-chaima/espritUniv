package com.example.esprituniv.services;

import com.example.esprituniv.repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;
}
