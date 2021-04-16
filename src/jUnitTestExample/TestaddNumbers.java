package jUnitTestExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestaddNumbers {

	@Test
	void test() {
		jUnitTesting junit = new jUnitTesting();
		int result = junit.addNumbers(2,3);
		assertEquals(5,result);
	}

}
