package Przyrost3.p3.repositories;

import Przyrost3.p3.entities.gatunek;
import org.springframework.data.repository.CrudRepository;

public interface gatunekRepository extends CrudRepository<gatunek, Integer>{

    gatunek findByNazwa(String nazwa);

}
