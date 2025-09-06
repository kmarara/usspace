package com.usspace.usspace.repository;

import com.usspace.usspace.model.Couple;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CoupleRepository extends JpaRepository<Couple, Long> {
    Optional<Couple> findByUser1IdAndUser2Id(Long user1Id, Long user2Id);
}
