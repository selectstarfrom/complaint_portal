package com.complaintportal.server.service.test.converter;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.complaintportal.server.model.entities.User;
import com.complaintportal.server.model.enums.UserStatus;
import com.complaintportal.server.service.converter.UserConverter;
import com.complaintportal.server.service.dto.UserDTO;

/**
 * @author imfroz
 *
 */
public class TestUserMapper {

	static Logger LOGGER = Logger.getLogger(TestUserMapper.class.getName());

	/**
	 * Test for converting User Entity to User TO
	 */
	@Test
	public void testUserEntityToUserTO1() {

		User lUser = new User("test_user@testmail.com", "12345", UserStatus.ACTIVE, "223213", "pic_1", 101L, new Date(),
				"test_user_1", new Date(), "test_user_1");

		LOGGER.debug("testUserEntityToUserTO: User: " + lUser);

		UserConverter lConverter = new UserConverter();

		UserDTO lUserDto = lConverter.getDto(lUser);

		LOGGER.debug("testUserEntityToUserTO: UserTO: " + lUserDto);

		assertEquals("User Entity to User DTO Convertion Failed", lUser.getId(), lUser.getId());

	}

	@Test
	public void testUserEntityToUserTOList() {

		User lUser1 = new User("test_user_1@testmail.com", "12345", UserStatus.ACTIVE, "223213", "pic_1", 101L,
				new Date(), "test_user_1", new Date(), "test_user_1");

		User lUser2 = new User("test_user_2@testmail.com", "123456", UserStatus.ACTIVE, "12345", "pic_2", 102L,
				new Date(), "test_user_1", new Date(), "test_user_1");

		List<User> lUsers = Arrays.asList(lUser1, lUser2);
		LOGGER.debug("testUserEntityToUserTO List: User Entity 1: " + lUser1);
		LOGGER.debug("testUserEntityToUserTO List: User Entity 2: " + lUser2);

		UserConverter lConverter = new UserConverter();

		List<UserDTO> lUserDto = lConverter.getDtos(lUsers);

		LOGGER.debug("testUserEntityToUserTO List: User TO 1: " + lUserDto.get(0));
		LOGGER.debug("testUserEntityToUserTO List: User TO 2: " + lUserDto.get(1));

		assertEquals("User Entity to User DTO List Convertion Failed", lUser1.getId(), lUserDto.get(0).getId());
		assertEquals("User Entity to User DTO List Convertion Failed", lUser2.getId(), lUserDto.get(1).getId());

	}
}
