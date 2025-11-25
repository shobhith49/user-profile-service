package com.auth.userprofileservice.repository;

import java.time.Instant;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.userprofileservice.entity.UserToken;

public interface UserTokenRepository extends JpaRepository<UserToken, Long>{
	 List<UserToken> findByTokenExpirationBeforeAndTokenStatus(Instant time, String status);

}
