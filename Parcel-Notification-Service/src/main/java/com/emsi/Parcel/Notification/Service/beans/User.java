package com.emsi.Parcel.Notification.Service.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String username;
    private String email;
    private String firstname;
    private String lastname;
}
