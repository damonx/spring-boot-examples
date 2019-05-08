package com.neo.domain;

import java.text.DateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {

	@Autowired
	private UserRepository userRepository;

	@Before
	public void setup() {
		this.userRepository.deleteAll();
	}

	@Test
	public void test() {
		final Date date = new Date();
		final DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		final String formattedDate = dateFormat.format(date);

		this.userRepository.save(new User("aa@126.com", "aa1", "aa123456", "aa", formattedDate));
		this.userRepository.save(new User("bb@126.com", "bb2", "bb123456", "bb", formattedDate));
		this.userRepository.save(new User("cc@126.com", "cc3", "cc123456", "cc", formattedDate));

		Assert.assertEquals(3, this.userRepository.findAll().size());
		Assert.assertEquals("bb2", this.userRepository.findByUserNameOrEmail("bb", "bb@126.com").getNickName());
		this.userRepository.delete(this.userRepository.findByUserName("aa"));
		Assert.assertEquals(2, this.userRepository.findAll().size());

	}

}