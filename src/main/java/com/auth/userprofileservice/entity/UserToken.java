package com.auth.userprofileservice.entity;

import java.time.Instant;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="user_token")
@Data
public class UserToken {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String userId;
    @Column(unique=true)
    private String tokenId;
    private String tokenStatus;
    private Instant tokenExpiration;
    private Instant createdDate;
    
    @PrePersist
    public void pre()
    	{
    	  this.createdDate = Instant.now();
          if (this.tokenStatus == null) this.tokenStatus = "ACTIVE";
    	}
    }
    



