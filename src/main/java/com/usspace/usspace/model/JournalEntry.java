package com.usspace.usspace.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JournalEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long userId;
    private Long coupleId;
    private String content;
    private LocalDate timestamp;
}
