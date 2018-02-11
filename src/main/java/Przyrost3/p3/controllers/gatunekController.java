package Przyrost3.p3.controllers;

import Przyrost3.p3.entities.gatunek;
import Przyrost3.p3.services.gatunekService;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class gatunekController {

    @Autowired
    private gatunekService gatunekService;

    @RequestMapping(value = "/gatunek", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<gatunek> list(Model model)
    {

        return gatunekService.listAllGatunek();
    }

    @RequestMapping(value = "/gatunek", method = RequestMethod.POST)
    public ResponseEntity<gatunek> create(@RequestBody @Valid @NotNull gatunek gatunek)
    {
        gatunekService.saveGatunek(gatunek);
        return ResponseEntity.ok().body(gatunek);
    }

    @RequestMapping(value = "/gatunek", method = RequestMethod.PUT)
    public ResponseEntity<Void> editGatunek(@RequestBody @Valid @NotNull gatunek gatunek)
    {
        gatunekService.saveGatunek(gatunek);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/gatunek/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<gatunek> deleteGatunek(@PathVariable Integer id)
    {
        gatunekService.deleteGatunek(id);
        return new ResponseEntity<gatunek>(HttpStatus.OK);
    }

}
