package fr.alexisbourges.cefimtestcda2.controller;

import fr.alexisbourges.cefimtestcda2.SalleService;
import fr.alexisbourges.cefimtestcda2.model.Salle;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salle")
@Validated
class SalleController {

    @Autowired
    private SalleService salleService;

    @GetMapping("")
    public List<Salle> getAllSalles(){
        return salleService.launchTest();
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/secure")
    public List<Salle> getAllSallesSecure(){
        return salleService.launchTest();
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @Operation(summary = "Création d'une nouvelle salle")
    @PostMapping("")
    public Salle postSalle(@Valid @RequestBody Salle salle){
        return new Salle();
    }
}