package com.innova.controller;

import com.innova.domain.Trabajo;
import com.innova.repository.TrabajoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

//@Controller
@RestController
@RequestMapping("/trabajos")
public class TrabajoController {



    private TrabajoRepo trabajoRepo;
    public TrabajoController(TrabajoRepo trabajoRepo){
        this.trabajoRepo=trabajoRepo;
    }

    //@ResponseBody
    @ResponseStatus(HttpStatus.OK)
    //@RequestMapping(path = "/list", method = RequestMethod.GET)
    @GetMapping(value = "list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Trabajo> list(){
          return   trabajoRepo.findAll();
    }

    @GetMapping(path = "list/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Trabajo findbyId(@PathVariable long id){
        Optional<Trabajo> trabajo=trabajoRepo.findById(id);
        if(trabajo.isPresent()) return trabajo.get();
        else throw new RuntimeException("not found!");
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes =MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Validated @RequestBody  Trabajo trabajo, BindingResult result){
        if(!result.hasErrors()){

        }else{ throw new RuntimeException("bad request!");}
    }
}
