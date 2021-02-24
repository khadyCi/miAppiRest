package com.vacuna.Vacuna.repository;





import org.springframework.data.jpa.repository.JpaRepository;

import com.vacuna.Vacuna.model.Vacuna;

public interface VacunaRepository extends JpaRepository<Vacuna, Integer>{
}