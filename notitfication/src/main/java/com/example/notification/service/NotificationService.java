package com.example.notification.service;

import com.example.clients.notification.NotificationRequest;
import com.example.notification.model.Notification;
import com.example.notification.repository.NotificationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {

    private NotificationRepository notificationRepository;

    public void sendNotification(NotificationRequest request) {
        notificationRepository.save(Notification.builder()
                .msg(request.getMsg())
                .sender("Nurahmet")
                .sendAt(LocalDateTime.now())
                .toCustomerEmail(request.getToCustomerEmail())
                .toCustomerId(request.getToCustomerId())
                .build());
    }
}
