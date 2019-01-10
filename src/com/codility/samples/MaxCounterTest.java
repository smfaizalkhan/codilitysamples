package com.codility.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MaxCounterTest {

	 private static MaxCounter maxCounter;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		maxCounter = new MaxCounter();
	}

	@Test
	void test() {
		int[] A = {3,4,4,6,1,4,4};
		int N = 5;
		int[] C = {3, 2, 2, 4, 2};
		assertArrayEquals(C, maxCounter.solution(N, A));
	}
	/*
	@Test
	void testdata1() {
		int[] A = {1,1,1,1,1};
		int N = 5;
		int[] C = {5,0,0,0,0};
		assertArrayEquals(C, maxCounter.solution(N, A));
	}
	
	@Test
	void testdata2() {
		int[] A = {1,0,0,0,1};
		int N = 5;
		int[] C = {2,0,0,0,0};
		assertArrayEquals(C, maxCounter.solution(N, A));
	}
	
	@Test
	void testdata3() {
		int[] A = {1,0,0,0,1};
		int N = 1;
		int[] C = {2};
		assertArrayEquals(C, maxCounter.solution(N, A));
	}*/

	@Test
	void testdata4() {
		int[] A = {3,4,4,6,1,4,4,6,3,3,6,2,3};
		int N = 5;
		int[] C = maxCounter.solution(N, A);
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i]+" ");
		}
		/*int[] C = {2};
		assertArrayEquals(C, maxCounter.solution(N, A));*/
	}

}
