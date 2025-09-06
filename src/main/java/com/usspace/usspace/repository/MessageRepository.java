package com.usspace.usspace.repository;

import com.usspace.usspace.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByCoupleOrderByTimestampAsc(Long coupleId);

    List<Message> findByCoupleIdOrderByTimestampAsc(Long coupleId);
}
