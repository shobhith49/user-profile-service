package com.auth.userprofileservice.entity;

import java.time.Instant;

import org.springframework.data.annotation.Persistent;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="login_history")
@Data
public class LoginHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String userID;
	private Instant  loginTime;
	private boolean success;
	
	@PrePersist
	public void pre()
	{
		loginTime=Instant.now();
	}
	
	

}
