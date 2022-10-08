package com.jdpt93.atirodeas.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdpt93.atirodeas.backend.documents.Sequence;
import com.jdpt93.atirodeas.backend.repositories.SequenceRepository;

@Service
public class SequenceService {

    @Autowired
    private SequenceRepository sequenceRepository;

    public int next(String document) {
        Sequence sequence = sequenceRepository.findById(document).orElse(new Sequence(document, 0));
        sequence.increment();
        sequenceRepository.save(sequence);
        return sequence.getValue();
    }

}
