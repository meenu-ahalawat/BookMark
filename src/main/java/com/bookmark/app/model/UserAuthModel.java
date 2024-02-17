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

@Entity
@Table(name = "user_auth")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@ToString
public class UserAuthModel implements Serializable{
	
	@Override
	public String toString() {
		return "UserAuthModel [userAuthId=" + userAuthId + ", userId=" + userId + ", userPhnno=" + userPhnno
				+ ", userPassword=" + userPassword + ", createTimestamp=" + createTimestamp + ", updateTimestamp="
				+ updateTimestamp + "]";
	}

	public UserAuthModel() {}

	public UserAuthModel(Long userAuthId, String userId, long userPhnno, String userPassword,
			Timestamp createTimestamp, Timestamp updateTimestamp) {
		super();
		this.userAuthId = userAuthId;
		this.userId = userId;
		this.userPhnno = userPhnno;
		this.userPassword = userPassword;
		this.createTimestamp = createTimestamp;
		this.updateTimestamp = updateTimestamp;
	}

	public Long getUserAuthId() {
		return userAuthId;
	}

	public void setUserAuthId(Long userAuthId) {
		this.userAuthId = userAuthId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getUserPhnno() {
		return userPhnno;
	}

	public void setUserPhnno(long userPhnno) {
		this.userPhnno = userPhnno;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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

	private static final long serialVersionUID = -6470090944414208496L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
	@SequenceGenerator(name = "id_sequence", sequenceName = "ID_SEQ")
	private Long userAuthId;
	
	@Column(name = "user_profile_id")
	private String userId;
	
	@Column(name = "user_mobile")
	private long userPhnno;
	
	@Column(name = "user_password")
	private String userPassword;
	
	@Column(name = "create_timestamp")
	private Timestamp createTimestamp;
	
	@Column(name = "update_timestamp")
	private Timestamp updateTimestamp;
}
