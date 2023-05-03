package fr.alexisbourges.cefimtestcda2.model;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "salle")
@Schema(description = "Salle")
public class Salle {

    public Salle(){
        this.name = "LALA";
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id = null;

    @Column(name= "name")
    @Schema(description = "Nom de la salle", example = "MAME-016", required = true)
    String name = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name="id_site")
    Site site = null;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Site getSite() {
        return site;
    }
}