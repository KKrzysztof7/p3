package Przyrost3.p3.controllers;

import Przyrost3.p3.entities.aktor;
import Przyrost3.p3.services.aktorService;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class aktorController {

    @Autowired
    private aktorService aktorService;

   @RequestMapping(value = "/aktor", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
   public Iterable<aktor> list(Model model)
   {

       return aktorService.listAllAktors();
   }

    @RequestMapping(value = "/aktor", method = RequestMethod.POST)
    public ResponseEntity<aktor> create(@RequestBody @Valid @NotNull aktor aktor)
    {
        aktorService.saveAktor(aktor);
        return ResponseEntity.ok().body(aktor);
    }

    @RequestMapping(value = "/aktor", method = RequestMethod.PUT)
    public ResponseEntity<Void> editAktor(@RequestBody @Valid @NotNull aktor aktor)
    {
        aktorService.saveAktor(aktor);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/aktor/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<aktor> deleteAktor(@PathVariable Integer id)
    {
        aktorService.deleteAktor(id);
        return new ResponseEntity<aktor>(HttpStatus.OK);
    }

}

