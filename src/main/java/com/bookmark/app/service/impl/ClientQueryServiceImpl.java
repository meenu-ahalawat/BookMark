package com.bookmark.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bookmark.app.book.repository.ClientContactDetailsRepository;
import com.bookmark.app.dao.UserProfileRepository;
import com.bookmark.app.dto.ClientContactDTO;
import com.bookmark.app.model.ClientContactDetails;
import com.bookmark.app.model.UserProfileModel;
import com.bookmark.app.service.ClientQueryService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ClientQueryServiceImpl implements ClientQueryService{
	
	@Autowired
	private ClientContactDetailsRepository clintContactRepository;
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Override
	public ResponseEntity<Object> saveClientQuery(ClientContactDTO clientContactDto) {
		
		isRegistredUser(clientContactDto);
		ClientContactDetails clientQuery = ClientContactDetails.builder()
				.clientEmail(clientContactDto.getClientEmail())
				.clientName(clientContactDto.getClientName())
				.clientQuery(clientContactDto.getClientQuery())
				.registeredClient(clientContactDto.isRegisteredClient())
				.build();
				
		clintContactRepository.saveAndFlush(clientQuery);
		log.info("Client Query Saved Successfully.");
		return new ResponseEntity<Object>(clientQuery, HttpStatus.OK);
	}

	private void isRegistredUser(ClientContactDTO clientContactDto) {
		UserProfileModel userProfile = userProfileRepository.findByEmail(clientContactDto.getClientEmail());
		if(userProfile == null) {
			clientContactDto.setRegisteredClient(false);
			log.info("User is not verified.");
			return;
		}
		clientContactDto.setRegisteredClient(true);
		log.info("User is verified.");
	} 

}
