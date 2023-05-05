package fr.alexisbourges.cefimtestcda2;

import fr.alexisbourges.cefimtestcda2.model.Salle;
import fr.alexisbourges.cefimtestcda2.model.SalleRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SalleService{

    @Autowired
    private SalleRepository salleRepository;

    @Autowired
    private EntityManager entityManager;

//    @EventListener(ApplicationReadyEvent.class)
    public List<Salle> launchTest(){
        List<Salle> salles = salleRepository.findAll();
        List<Salle> salles2 = salleRepository.getSallesForSite(1);
        int t = 0;
        ExampleMatcher matcher = ExampleMatcher.matching();
        Salle s = new Salle();
        s.setName("MMMMMM");

        Example<Salle> example = Example.of(s, matcher);
        boolean exist = salleRepository.exists(example);
        int i = 0;
        return salles;
        //salleRepository.save(new Salle());
        //List<Salle> salles2 = salleRepository.findAll();
        //t = 1;


    }
}