package com.bookmark.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmark.app.model.UserAuthModel;

@Repository
public interface UserAuthRepository extends JpaRepository<UserAuthModel, Long>{

}
