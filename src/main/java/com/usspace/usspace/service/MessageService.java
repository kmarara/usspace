package com.usspace.usspace.service;

import com.usspace.usspace.model.Message;
import com.usspace.usspace.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message sendMessage(Long senderId, Long coupleId, String content, String moodTag) {
        Message message = new Message();
        message.setSenderId(senderId);
        message.setCoupleId(coupleId);
        message.setContent(content);
        message.setMoodTag(moodTag);
        message.setTimestamp(LocalDateTime.now());
        return messageRepository.save(message);
    }

    public List<Message> getMessagesByCouple(Long coupleId) {
        return messageRepository.findByCoupleIdOrderByTimestampAsc(coupleId);
    }
}

