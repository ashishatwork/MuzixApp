package com.stackroute.controller;

import com.stackroute.domain.Muzix;
import com.stackroute.exceptions.TrackAlreadyExistsException;
import com.stackroute.repository.MuzixRepository;
import com.stackroute.service.MuzixService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class MuzixController {
   private MuzixService muzixService;

    public MuzixController(MuzixService muzixService) {
        this.muzixService = muzixService;
    }

    @PostMapping("/muzix")
    public ResponseEntity<?> saveNewMuzix(@RequestBody Muzix muzix){
        ResponseEntity responseEntity;
        try{
            muzixService.saveNewMuzix(muzix);
            responseEntity=new ResponseEntity<String>("Successfully created", HttpStatus.CREATED);
        } catch (Exception ex){
            responseEntity=new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;
    }


    @GetMapping("/muzix")
    public ResponseEntity<?> getMuzix(){
        return new ResponseEntity<List<Muzix>>(muzixService.getMuzix(),HttpStatus.OK);
    }

    @GetMapping("/muzix/{id}")
    public ResponseEntity<?> getById(@PathVariable int id){
        return new ResponseEntity<Muzix>(muzixService.getById(id),HttpStatus.OK);

    }


    @DeleteMapping("/muzix/delete/{id}")
    public String deleteMuzix(@PathVariable int id) {

            muzixService.deleteById(id);
        return "Track deleted";
    }

    @PutMapping("/muzix/update/{id}")
    public String updateMuzix(@RequestBody Muzix muzix, @PathVariable int id) {

            muzixService.updateById(muzix, id);
        return "Track Updated";
    }

    @GetMapping("/muzix/name/{name}")
    public ResponseEntity<?> getByName(@PathVariable String name){
        return new ResponseEntity<Muzix>(muzixService.getByName(name),HttpStatus.OK);

    }



}
