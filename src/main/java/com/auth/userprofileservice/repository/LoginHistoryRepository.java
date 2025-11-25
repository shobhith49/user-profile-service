package com.auth.userprofileservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.userprofileservice.entity.LoginHistory;

public interface LoginHistoryRepository extends JpaRepository<LoginHistory, Long>{
	  List<LoginHistory> findTop10ByUserIdOrderByLoginTimeDesc(String userId);

}
