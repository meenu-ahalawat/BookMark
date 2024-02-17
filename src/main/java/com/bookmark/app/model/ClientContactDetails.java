package com.bookmark.app.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "client_query")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ClientContactDetails {

	@Id
	@GeneratedValue(generator = "id_sequence", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "id_sequence", sequenceName = "ID_SEQ")
	Long id;
	@Column(name = "client_name")
	String clientName;
	@Column(name = "client_email")
	String clientEmail;
	@Column(name = "client_query")
	String clientQuery;
	@Column(name = "is_client_registered")
	boolean registeredClient;		// unique email
	@Column(name = "client_query_date_time")
	@CreationTimestamp
	Timestamp queryDateTime;
}
