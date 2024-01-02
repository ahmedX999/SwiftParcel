package com.emsi.Parcel.Notification.Service.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parcel {

    private Long id;
    private String trackingNumber;
    private String destination;
    private String status;
    private User user;
    private boolean isEmailSent;


}
