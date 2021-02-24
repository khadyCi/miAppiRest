package com.vacuna.Vacuna.service;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vacuna.Vacuna.model.Vacuna;
import com.vacuna.Vacuna.repository.VacunaRepository;

import java.util.List;
@Service
@Transactional
public class VacunaService  {
    @Autowired
    private VacunaRepository vacunaRepository;
    public List<Vacuna> listAllVacuna() {
        return vacunaRepository.findAll();
    }

    public void saveVacuna(Vacuna vacuna) {
    	vacunaRepository.save(vacuna);
    }

    public Vacuna getVacuna(Integer id) {
        return vacunaRepository.findById(id).get();
    }

    public void deleteVacuna(Integer id) {
    	vacunaRepository.deleteById(id);
    }
}
