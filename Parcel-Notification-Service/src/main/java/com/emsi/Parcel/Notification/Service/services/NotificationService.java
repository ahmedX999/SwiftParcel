package com.emsi.Parcel.Notification.Service.services;

import com.emsi.Parcel.Notification.Service.repositories.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;



}
