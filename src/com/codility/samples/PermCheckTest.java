package com.codility.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PermCheckTest {

	private static PermCheck permCheck ;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		permCheck = new PermCheck();
	}

	@Test
	public void testdata1() {
		int[] A = {4,1,3,2};
	assertEquals(1, permCheck.solution(A));
	}
	
	@Test
	public void testdata3() {
		int[] A = {4,1,3};
	assertEquals(0, permCheck.solution(A));
	}

	@Test
	public void testdata4() {
		int[] A = {1};
	assertEquals(1, permCheck.solution(A));
	}
	@Test
	public void testdata5() {
		int[] A = {1,1};
	assertEquals(0, permCheck.solution(A));
	}
}
