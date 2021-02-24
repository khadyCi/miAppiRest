package com.vacuna.Vacuna.controlador;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.vacuna.Vacuna.model.Vacuna;
import com.vacuna.Vacuna.service.VacunaService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/vacuno")
public class VacunaControldor {
    @Autowired
    VacunaService vacunaService;

    @GetMapping("")
    public List<Vacuna> list() {
        return vacunaService.listAllVacuna();
    }
 
    //GET  http://localhost:4004/users/1
    @GetMapping("/{id}")
    public ResponseEntity<Vacuna> get(@PathVariable Integer id) {
        try {
            Vacuna vacuna = vacunaService.getVacuna(id);
            return new ResponseEntity<Vacuna>(vacuna, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Vacuna>(HttpStatus.NOT_FOUND);
        }
    }
    
  
    
    
    @PostMapping("/")
    public void add(@RequestBody Vacuna vacuna) {
        vacunaService.saveVacuna(vacuna);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Vacuna vacuna, @PathVariable Integer id) {
        try {
            Vacuna existVacuna = vacunaService.getVacuna(id);
            vacuna.setId(id);            
            vacunaService.saveVacuna(vacuna);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        vacunaService.deleteVacuna(id);
    }
}
