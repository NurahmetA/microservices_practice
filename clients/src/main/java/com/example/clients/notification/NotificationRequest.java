package com.example.clients.notification;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequest {
    private Long toCustomerId;
    private String toCustomerEmail;
    private String msg;
    private String sender;
    private LocalDateTime sendAt;

    public NotificationRequest(Long id, String email, String msg) {
        this.msg = msg;
        this.toCustomerEmail = email;
        this.toCustomerId = id;
    }
}
