package com.fullstackjavadevelopercommunity.traning.hello_junit_5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * @author Full Stack Java developer Community
 *
 *         Jul 3, 2020
 */
@RunWith(JUnitPlatform.class)
public class GreetingImplTest {

	private GreetingImpl greetingImpl;

	@BeforeEach
	public void setUp() {
		System.out.println("setUp");
		greetingImpl = new GreetingImpl();

	}

	/**
	 * Test method for
	 * {@link com.hcl.traning.junit.GreetingImpl#greet(java.lang.String)}.
	 */
	@Test
	public void greetShouldValidOutput() {
		System.out.println("greetShouldValidOutput");
		// fail("Not yet implemented");
		String greet = greetingImpl.greet("Junit");
		Assertions.assertNotNull(greet);
		Assertions.assertEquals("Hello Junit", greet);
	}

	@Test
	public void greetShouldThrowAnException_for_nameIsNull() {
		System.out.println("greetShouldThrowAnException_for_nameIsNull");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			greetingImpl.greet(null);
		});

	}

	@Test
	public void greetShouldThrowAnException_for_nameIsBlank() {
		System.out.println("greetShouldThrowAnException_for_nameIsBlank");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			greetingImpl.greet("");
		});
	}

	@AfterEach
	public void tearDown() {
		System.out.println("tearDown");
		greetingImpl = null;
	}

}
