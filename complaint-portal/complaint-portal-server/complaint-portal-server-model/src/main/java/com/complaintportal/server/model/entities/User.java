package com.complaintportal.server.model.entities;

import java.util.Date;

import javax.persistence.Entity;

import com.complaintportal.server.model.enums.UserStatus;

/**
 * @author imfroz
 *
 */
@Entity
public class User extends AbstractEntity {

	private String username;

	private String password;

	private UserStatus status;

	private String telephone;

	private String displayPicture;

	public User() {
		super();
	}

	public User(String pUsername, String pPassword, UserStatus pStatus, String pTelephone, String pDisplayPicture) {
		super();
		username = pUsername;
		password = pPassword;
		status = pStatus;
		telephone = pTelephone;
		displayPicture = pDisplayPicture;
	}

	public User(String pUsername, String pPassword, UserStatus pStatus, String pTelephone, String pDisplayPicture,
			Long pId, Date pCreatedDate, String pCreatedBy, Date pModifiedDate, String pModifiedBy) {

		super(pId, pCreatedDate, pCreatedBy, pModifiedDate, pModifiedBy);

		username = pUsername;
		password = pPassword;
		status = pStatus;
		telephone = pTelephone;
		displayPicture = pDisplayPicture;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String pUsername) {
		username = pUsername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pPassword) {
		password = pPassword;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus pStatus) {
		status = pStatus;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String pTelephone) {
		telephone = pTelephone;
	}

	public String getDisplayPicture() {
		return displayPicture;
	}

	public void setDisplayPicture(String pDisplayPicture) {
		displayPicture = pDisplayPicture;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", status=" + status + ", telephone="
				+ telephone + ", displayPicture=" + displayPicture + ", id=" + id + ", createdDate=" + createdDate
				+ ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy + "]";
	}

}
