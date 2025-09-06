package com.usspace.usspace.service;

import com.usspace.usspace.model.Couple;
import com.usspace.usspace.repository.CoupleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoupleService {

    @Autowired
    private CoupleRepository coupleRepository;

    public Couple createCouple(Long user1Id, Long user2Id) {
        Optional<Couple> existing = coupleRepository.findByUser1IdAndUser2Id(user1Id, user2Id);
        if (existing.isPresent()) {
            throw new IllegalStateException("Couple already exists");
        }
        Couple couple = new Couple();
        couple.setUser1Id(user1Id);
        couple.setUser2Id(user2Id);
        couple.setAnniversaryDate(java.time.LocalDate.now());
        return coupleRepository.save(couple);
    }

    public Optional<Couple> getCoupleByUsers(Long user1Id, Long user2Id) {
        return coupleRepository.findByUser1IdAndUser2Id(user1Id, user2Id);
    }

    public Optional<Couple> getCoupleById(Long id) {
        return coupleRepository.findById(id);
    }
}

