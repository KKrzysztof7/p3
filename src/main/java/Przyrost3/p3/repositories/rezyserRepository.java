package Przyrost3.p3.repositories;

import Przyrost3.p3.entities.rezyser;
import org.springframework.data.repository.CrudRepository;

public interface rezyserRepository extends CrudRepository<rezyser, Integer>{

    rezyser findByImie(String imie);
    rezyser findByNazwiskoAndImie(String imie, String nazwisko);
    rezyser findByNazwisko(String nazwisko);

}
