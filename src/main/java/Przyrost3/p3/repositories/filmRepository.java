package Przyrost3.p3.repositories;

import Przyrost3.p3.entities.film;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.ZonedDateTime;
import java.util.List;

public interface filmRepository extends CrudRepository<film, Integer> {

    film findByTytul(String tytul);

    @Query("select u from film u where u.DataPowstania = ?1")
    List<film> findFilmByDate(ZonedDateTime DataPowstania);

}