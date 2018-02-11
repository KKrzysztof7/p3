package Przyrost3.p3.services;

import Przyrost3.p3.entities.film;
import Przyrost3.p3.repositories.filmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class filmServiceImpl implements filmService{
    @Autowired
    private filmRepository filmRepository;
    @Override
    public Iterable<film> findAllFilmy() {
        return filmRepository.findAll();
    }
    @Override
    public film getFilmById(Integer id){
        return filmRepository.findOne(id);
    }
    @Override
    public film saveFilm(film film){
        return filmRepository.save(film);
    }
    @Override
    public void deleteFilm(Integer id){
        filmRepository.delete(id);
    }
}
