package com.bookmark.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmark.app.model.UserProfileModel;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfileModel, Long>{

	UserProfileModel findByEmail(String clientEmail);

}
