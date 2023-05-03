package fr.alexisbourges.cefimtestcda2.model;


import jakarta.persistence.*;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "salle")
public class Salle {

    public Salle(){
        this.name = "LALA";
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id = null;

    @Column(name= "name")
    String name = null;

    @ManyToOne
    @JoinColumn( name="id_site")
    Site siteName = null;


}