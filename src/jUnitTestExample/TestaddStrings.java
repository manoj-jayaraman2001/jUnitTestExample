package jUnitTestExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestaddStrings {

	@Test
	void test() {
		jUnitTesting junitstr = new jUnitTesting();
		String str = junitstr.addStrings("Manoj", "Jayaraman");
		assertEquals(str,"ManojJayaraman");
	}

}
