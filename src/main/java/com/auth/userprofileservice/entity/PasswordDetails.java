package com.auth.userprofileservice.entity;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="password_details")
@Data
public class PasswordDetails {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String passwordHash;
    private Instant createdDate;

    @PrePersist
    public void pre()
    {
        createdDate=Instant.now();

    }

}
