package Przyrost3.p3.services;

import Przyrost3.p3.entities.film;
import org.springframework.stereotype.Service;

@Service
public interface filmService {

    Iterable<film>findAllFilmy();

    film getFilmById(Integer id);

    film saveFilm(film film);

    void deleteFilm(Integer id);

}
