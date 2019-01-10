package com.codility.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CountDivTest {
 private static CountDiv countDiv;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		countDiv = new CountDiv();
	}

	@Test
	void testdata1() {
		assertEquals(3,countDiv.solution(6,11, 2));
	}
	
	@Test
	void testdata10() {
		assertEquals(3,countDiv.solution(11,345,17));
	}
	
	@Test
	void testdata2() {
		assertEquals(0,countDiv.solution(0,0,2));
	}
	
	@Test
	void testdata3() {
		assertEquals(51,countDiv.solution(0,100, 2));
	}
	
	@Test
	void testdata4() {
		assertEquals(1,countDiv.solution(1,100, 100));
	}
	
	@Test
	void testdata5() {
		assertEquals(0,countDiv.solution(100,100, 100));
	}
	
	@Test
	void testdata6() {
		assertEquals(0,countDiv.solution(100,100,2));
	}
	
	@Test
	void testdata7() {
		assertEquals(1,countDiv.solution(4,11,7));
	}
	
	/*@Test
	void testdata7() {
		assertEquals(0,countDiv.solution(100,500,1000));
	}*/
}
