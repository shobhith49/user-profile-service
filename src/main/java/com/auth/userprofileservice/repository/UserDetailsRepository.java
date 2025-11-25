package com.auth.userprofileservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.userprofileservice.entity.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, String>{

}
