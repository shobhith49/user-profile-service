package com.auth.userprofileservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.userprofileservice.entity.PasswordDetails;

public interface PasswordDetailsRepository extends JpaRepository<PasswordDetails, Long> {
	
	Optional<PasswordDetails> findTopByUserIdOrderByCreatedDateDesc(String userId);
	
	List<PasswordDetails> findTop5ByUserIdOrderByCreatedDateDesc(String userId);
	

}
