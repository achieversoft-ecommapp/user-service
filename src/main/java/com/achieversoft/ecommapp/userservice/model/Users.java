package com.achieversoft.ecommapp.userservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * The type User.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {

    private String userId;
    private String firstName;
    private String lastName;
    private Date dob;
    private String email;
    private String mobile;
    private String address;
    private String pin;

}
