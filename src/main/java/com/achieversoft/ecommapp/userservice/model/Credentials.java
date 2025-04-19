package com.achieversoft.ecommapp.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

/**
 * The type User.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Credentials implements Serializable {

    private String loginId;
    private String userId;
    private String password;
    private String role;
    private String verifToken;
    private Date expireDate;
    private String isEnabled;
    private String isLocked;

}
