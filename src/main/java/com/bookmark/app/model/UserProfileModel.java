package com.bookmark.app.model;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name = "user_profile")
@Builder
public class UserProfileModel implements Serializable{

	private static final long serialVersionUID = -6470090944414208496L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
	@SequenceGenerator(name = "id_sequence", sequenceName = "ID_SEQ")
	private Long id;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	public UserProfileModel() {}
	
	public UserProfileModel(Long id, String firstname, String lastname, String username, String email, long phnno,
			String address, Timestamp createTimestamp, Timestamp updateTimestamp) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.email = email;
		this.phnno = phnno;
		this.address = address;
		this.createTimestamp = createTimestamp;
		this.updateTimestamp = updateTimestamp;
	}

	@Override
	public String toString() {
		return "UserProfileModel [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", username="
				+ username + ", email=" + email + ", phnno=" + phnno + ", address=" + address + ", createTimestamp="
				+ createTimestamp + ", updateTimestamp=" + updateTimestamp + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhnno() {
		return phnno;
	}

	public void setPhnno(long phnno) {
		this.phnno = phnno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	@Column(name = "mobile", nullable = false)
	private long phnno;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "create_timestamp")
	private Timestamp createTimestamp;
	
	@Column(name = "update_timestamp")
	private Timestamp updateTimestamp;
}
