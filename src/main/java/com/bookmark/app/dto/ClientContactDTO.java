package com.bookmark.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ClientContactDTO {

	String clientName;
	String clientEmail;
	String clientQuery;
	boolean registeredClient;		// unique email
}
