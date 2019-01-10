package com.codility.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CharsNesteTest {
	
	private static CharsNest charsNest;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		charsNest = new CharsNest();
	}

	@Test
	void testdata1() {
		assertEquals(1, charsNest.solution("{[()()]}"));
	}

}
