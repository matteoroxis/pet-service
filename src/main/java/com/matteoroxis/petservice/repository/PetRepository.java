/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matteoroxis.petservice.repository;

import com.matteoroxis.petservice.model.Pet;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author matt.rossi
 */
public interface PetRepository extends MongoRepository<Pet, String> {

    Pet findById(ObjectId _id);

}
