package com.bookmark.app.service;

import org.springframework.http.ResponseEntity;

import com.bookmark.app.dto.ClientContactDTO;

public interface ClientQueryService {

	ResponseEntity<Object> saveClientQuery(ClientContactDTO clientContactDto);

}
