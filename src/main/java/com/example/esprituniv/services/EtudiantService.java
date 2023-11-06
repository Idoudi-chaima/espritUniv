package com.example.esprituniv.services;

import com.example.esprituniv.entities.Etudiant;
import com.example.esprituniv.entities.Reservation;
import com.example.esprituniv.repository.EtudiantRepository;
import com.example.esprituniv.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{
    EtudiantRepository etudiantRepository;
   ReservationRepository reservationRepository;
   ReservationService reservationService;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {

        return etudiantRepository.save(e) ;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {

        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {

        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public Etudiant affecterEtudiantAReservation(String nomEt, String prenomEt, Long idReservation) {
       Etudiant etudiant = etudiantRepository.findEtudiantByNomEtAndPrenomEt(nomEt,prenomEt);
        Reservation reservation= reservationService.retrieveReservation(idReservation);


        return null;
    }
}
