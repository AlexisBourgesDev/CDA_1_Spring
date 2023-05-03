package fr.alexisbourges.cefimtestcda2;

import fr.alexisbourges.cefimtestcda2.model.Salle;
import fr.alexisbourges.cefimtestcda2.model.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalleService{

    @Autowired
    private SalleRepository salleRepository;


    public List<Salle> launchTest(){
        List<Salle> salles = salleRepository.findAll();
        int t = 0;
        return salles;
        //salleRepository.save(new Salle());
        //List<Salle> salles2 = salleRepository.findAll();
        //t = 1;
    }
}