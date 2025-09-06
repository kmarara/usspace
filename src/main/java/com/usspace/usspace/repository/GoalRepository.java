package com.usspace.usspace.repository;

import com.usspace.usspace.model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoalRepository extends JpaRepository<Goal, Long> {
    List<Goal> findByCoupleId(Long coupleId);
}
