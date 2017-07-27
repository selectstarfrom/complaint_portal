package com.complaintportal.server.service.dto;

import com.complaintportal.server.model.enums.UserStatus;

/**
 * @author imfroz
 *
 */
public class UserDTO extends AbstractDTO {

	private String username;

	private String password;

	private UserStatus status;

	private String telephone;

	private String displayPicture;

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
		return "UserDTO [username=" + username + ", password=" + password + ", status=" + status + ", telephone="
				+ telephone + ", displayPicture=" + displayPicture + ", id=" + id + ", createdDate=" + createdDate
				+ ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy + "]";
	}

}
