package com.codility.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PassingCarTest {

	 private static PassingCars passingCars;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		passingCars = new PassingCars();
	}

	@Test
	void test() {
		int[] A = {0,1,0,1,1};
		assertEquals(5,passingCars.solution(A));
	}

	@Test
	void testdata1() {
		int[] A = {0,1};
		assertEquals(1,passingCars.solution(A));
	}
}
