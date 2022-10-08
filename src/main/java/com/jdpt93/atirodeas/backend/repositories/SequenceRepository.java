package com.jdpt93.atirodeas.backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jdpt93.atirodeas.backend.documents.Sequence;

@Repository
public interface SequenceRepository extends MongoRepository<Sequence, String> {

}
