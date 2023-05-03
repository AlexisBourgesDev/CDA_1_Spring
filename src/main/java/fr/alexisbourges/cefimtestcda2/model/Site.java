package fr.alexisbourges.cefimtestcda2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "site")
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id = null;

    @Column(name= "name")
    String name = null;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "site")
    public List<Salle> salle;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Salle> getSalle() {
        return salle;
    }
}
