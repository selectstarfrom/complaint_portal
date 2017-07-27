package com.complaintportal.server.service.converter;

import com.complaintportal.server.model.entities.User;
import com.complaintportal.server.service.dto.UserDTO;

public class UserConverter extends AbstractEntityTOConverter<User, UserDTO> {

	@Override
	UserDTO getNewDtoInstance() {
		return new UserDTO();
	}

	@Override
	User getNewEntityInstance() {
		return new User();
	}

}
