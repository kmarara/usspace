package com.usspace.usspace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usspace.usspace.model.JournalEntry;

public interface JournalEntryRepository extends JpaRepository<JournalEntry, Long> {
    List<JournalEntry> findByCoupleIdOrderByTimestampDesc(Long coupleId);
}
