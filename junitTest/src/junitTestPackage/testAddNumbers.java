package junitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addNumbers(20,30);
		assertEquals (50,result);
	}
}