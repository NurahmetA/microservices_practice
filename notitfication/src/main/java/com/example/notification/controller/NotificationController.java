package com.example.notification.controller;

import com.example.clients.notification.NotificationRequest;
import com.example.notification.service.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/notification")
public class NotificationController {

    private NotificationService notificationService;

    @PostMapping("/send")
    public void saveNotification(@RequestBody NotificationRequest request) {
        log.info("Sending notification to customer {}", request.getToCustomerId());
        notificationService.sendNotification(request);
    }
}
