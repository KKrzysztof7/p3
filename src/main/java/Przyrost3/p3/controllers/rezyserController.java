package Przyrost3.p3.controllers;

import Przyrost3.p3.entities.rezyser;
import Przyrost3.p3.services.rezyserService;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class rezyserController {

    @Autowired
    private rezyserService rezyserService;

    @RequestMapping(value = "/rezyser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<rezyser> list(Model model)
    {

        return rezyserService.listAllRezysers();
    }

    @RequestMapping(value = "/rezyser", method = RequestMethod.POST)
    public ResponseEntity<rezyser> create(@RequestBody @Valid @NotNull rezyser rezyser)
    {
        rezyserService.saveRezyser(rezyser);
        return ResponseEntity.ok().body(rezyser);
    }

    @RequestMapping(value = "/rezyser", method = RequestMethod.PUT)
    public ResponseEntity<Void> editRezyser(@RequestBody @Valid @NotNull rezyser rezyser)
    {
        rezyserService.saveRezyser(rezyser);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/rezyser/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<rezyser> deleteRezyser(@PathVariable Integer id)
    {
        rezyserService.deleteRezyser(id);
        return new ResponseEntity<rezyser>(HttpStatus.OK);
    }

}

