/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matteoroxis.petservice.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 *
 * @author matt.rossi
 */
public class Pet {

    @Id
    private ObjectId _id;

    private String name;
    private String species;
    private String breed;

    public Pet() {
    }

    public Pet(ObjectId _id, String name, String species, String breed) {
        this._id = _id;
        this.name = name;
        this.species = species;
        this.breed = breed;
    }

    /**
     * @return the _id
     */
    public ObjectId getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(ObjectId _id) {
        this._id = _id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    

}
