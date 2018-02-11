package Przyrost3.p3.repositories;

import Przyrost3.p3.entities.aktor;
import org.springframework.data.repository.CrudRepository;

public interface aktorRepository extends CrudRepository<aktor, Integer> {

    aktor findByImie(String imie);
    aktor findByNazwiskoAndImie(String imie, String nazwisko);
    aktor findByNazwisko(String nazwisko);


}
