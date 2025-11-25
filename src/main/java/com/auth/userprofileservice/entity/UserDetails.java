package com.auth.userprofileservice.entity;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="user_details")
@Data
public class UserDetails {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String status;
    private int invaliAttempts;
    private Instant creationDate;
    private Instant lastLoginTime;

    public void prePersist()
    {
        this.creationDate=Instant.now();
        this.status="Active";
        this.invaliAttempts=0;
        
    }
}
