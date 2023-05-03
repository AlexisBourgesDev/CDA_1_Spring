package fr.alexisbourges.cefimtestcda2.controller;

import fr.alexisbourges.cefimtestcda2.model.Salle;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/salle")
class SalleController {
    @GetMapping("")
    public List<Salle> getAllSalles(){
        throw new EntityNotFoundException("Salles not found");
    }
    @GetMapping("/total")
    public int getNbSalles(){
        Integer t = null;
        return t.intValue();
    }
}