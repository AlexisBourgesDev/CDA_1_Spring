package fr.alexisbourges.cefimtestcda2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "site")
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id = null;

    @Column(name= "name")
    String name = null;
}
