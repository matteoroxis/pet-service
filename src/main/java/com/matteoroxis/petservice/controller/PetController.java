/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matteoroxis.petservice.controller;

import com.matteoroxis.petservice.model.Pet;
import com.matteoroxis.petservice.repository.PetRepository;
import java.util.List;
import javax.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author matt.rossi
 */
@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetRepository repository;

    @GetMapping()
    public List<Pet> getAllPets() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Pet getPetById(@PathVariable("id") ObjectId id) {
        return repository.findById(id);
    }

    @PutMapping(value = "/{id}")
    public void modifyPetById(@PathVariable("id") ObjectId id, @Valid
            @RequestBody Pet pet) {
        pet.setId(id);
        repository.save(pet);
    }

    @PostMapping()
    public Pet createPet(@Valid @RequestBody Pet pet) {
        pet.setId(ObjectId.get());
        repository.save(pet);
        return pet;
    }

    @DeleteMapping(value = "/{id}")
    public void deletePet(@PathVariable ObjectId id) {
        repository.delete(repository.findById(id));
    }

}
