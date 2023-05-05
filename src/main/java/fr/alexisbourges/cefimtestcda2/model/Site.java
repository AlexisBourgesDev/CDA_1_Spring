package fr.alexisbourges.cefimtestcda2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "site")
    public List<Salle> salle;

    public Site() {
    }

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
