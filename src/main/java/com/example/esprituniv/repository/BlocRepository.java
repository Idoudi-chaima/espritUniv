package com.example.esprituniv.repository;

import com.example.esprituniv.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BlocRepository extends JpaRepository<Bloc,Long> {

}
