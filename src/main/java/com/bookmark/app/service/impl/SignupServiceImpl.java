package com.bookmark.app.service.impl;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bookmark.app.constant.ResponseCodeConstant;
import com.bookmark.app.dao.UserAuthRepository;
import com.bookmark.app.dao.UserProfileRepository;
import com.bookmark.app.dto.SignupDTO;
import com.bookmark.app.model.UserAuthModel;
import com.bookmark.app.model.UserProfileModel;
import com.bookmark.app.service.SignupService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SignupServiceImpl implements SignupService{
	
	@Autowired
	private UserProfileRepository userProfileRepository;
	@Autowired
	private UserAuthRepository userAuthRepository;
	
	@Override
	public ResponseEntity<Object> register(HttpServletRequest request, SignupDTO signupDto) {
		log.info("User Registration started for signup request : {}", signupDto);

		try {
			UserProfileModel userProfile = new UserProfileModel();
			userProfile.setFirstname(signupDto.getFirstname());
			userProfile.setLastname(signupDto.getLastname());
			userProfile.setUsername(signupDto.getUsername());
			userProfile.setPhnno(signupDto.getPhnno());
			userProfile.setEmail(signupDto.getEmail());
			userProfile.setAddress(signupDto.getAddress());

			Timestamp creationTime = new Timestamp(System.currentTimeMillis());
			Timestamp updateTime = new Timestamp(System.currentTimeMillis());

			userProfile.setCreateTimestamp(creationTime);
			userProfile.setUpdateTimestamp(updateTime);

			UserProfileModel savedUserProfile = userProfileRepository.saveAndFlush(userProfile);
			log.info("User Profile saved while registering : {}", savedUserProfile);

			UserAuthModel userAuth = new UserAuthModel();
			userAuth.setUserId(savedUserProfile.getId().toString());
			userAuth.setUserPhnno(savedUserProfile.getPhnno());
			userAuth.setUserPassword(signupDto.getPassword());
			userAuth.setCreateTimestamp(creationTime);
			userAuth.setUpdateTimestamp(updateTime);

			UserAuthModel savedUserAuth = userAuthRepository.saveAndFlush(userAuth);
			log.info("User Auth saved while registering : {}", savedUserAuth);
		} catch (Exception e) {
			log.error("Exception occured while user registration. ERROR : ", e.getMessage());
			return new ResponseEntity<Object>("Failed!!", HttpStatus.OK);
		}
		return new ResponseEntity<>(ResponseCodeConstant.RESPONSE_SUCCESS_STATUS, HttpStatus.OK);
	}

	
}
