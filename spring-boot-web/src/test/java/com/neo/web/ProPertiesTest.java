package com.neo.web;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neo.util.NeoProperties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProPertiesTest {

	@Autowired
	private NeoProperties neoProperties;

	@Test
	public void getHello() {
		System.out.println(this.neoProperties.getTitle());
		Assert.assertEquals(this.neoProperties.getTitle(), "damonx-test");
		Assert.assertEquals(this.neoProperties.getDescription(), "damonx-damonx");
	}

	@Test
	public void testMap() {
		final Map<String, Long> orderMinTime = new HashMap<>();
		orderMinTime.get("123");
	}

}