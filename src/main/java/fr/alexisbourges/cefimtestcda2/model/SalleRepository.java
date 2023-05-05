package fr.alexisbourges.cefimtestcda2.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalleRepository extends JpaRepository<Salle, Integer> {

    @Query(value = "select Salle.* from Salle inner join Site on Site.id = Salle.id_site where Site.id = :siteId", nativeQuery = true)
    List<Salle> getSallesForSite(@Param("siteId") Integer siteId);
}