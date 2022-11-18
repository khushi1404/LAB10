package junitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddString {

	@Test
	void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.addStrings("khushi","sharma");
        assertEquals("khushisharma",result);
	}

}
