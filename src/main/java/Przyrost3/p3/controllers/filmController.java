package Przyrost3.p3.controllers;

import Przyrost3.p3.entities.film;
import Przyrost3.p3.services.filmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
//@RequestMapping("/api")
public class filmController {

    @Autowired
    private filmService filmService;

    @RequestMapping(value = "/filmy", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<film> listFilmy(Model model) {return filmService.findAllFilmy();}
    @RequestMapping(value = "/film/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public film getFilmById(@PathVariable("id") Integer id)  {return filmService.getFilmById(id);}
    @RequestMapping(value = "/film", method = RequestMethod.POST)
    public ResponseEntity<film> createFilm(@RequestBody @Valid @NotNull film film) {
        filmService.saveFilm(film);
        return ResponseEntity.ok().body(film);
    }
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/film/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<film> deleteFilm(@PathVariable("id") Integer id) {
        filmService.deleteFilm(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value = "/film", method = RequestMethod.PUT)
    ResponseEntity<Void> editFilm(@RequestBody @Valid @NotNull film film) {
        filmService.saveFilm(film);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
