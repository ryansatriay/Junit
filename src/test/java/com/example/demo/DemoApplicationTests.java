package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	Math m = new Math();

	@Test
	public void addTest() {
		double expected = 4d;
		double actual = m.add(2,2);
		Assert.assertTrue(expected == actual);
	}

	@Test
	public void minTest() {
		double expected = 2d;
		double actual = m.min(4,2);
		Assert.assertTrue(expected == actual);
	}

	@Test
	public void mulTest() {
		double expected = 8d;
		double actual = m.mul(4,2);
		Assert.assertTrue(expected == actual);
	}

}
