package com.codility.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MissingElementTest {

	private static MissingElement missingElement;

	@BeforeAll

	public static void setUp() {
		missingElement = new MissingElement();
	}

	@Test

	public void testSolutiondataSet1() {
		int[] A = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		assertEquals(4, missingElement.solution(A));
	}

	@Test

	public void testSolutiondataSet2() {
		int[] A = { 10, 2, 3, 4, 5, 6, 7, 8, 1 };
		assertEquals(9, missingElement.solution(A));
	}

	@Test

	public void testSolutiondataSet3() {
		int[] A = { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(2, missingElement.solution(A));
	}

	@Test

	public void testSolutiondataSet4() {
		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(11, missingElement.solution(A));
	}

	@Test

	public void testSolutiondataSet5() {
		int[] A = {2};
		assertEquals(1, missingElement.solution(A));
	}
	
	@Test

	public void testSolutiondataSet6() {
		int[] A = null ;
		assertEquals(0, missingElement.solution(A));
	}
	
	@Test

	public void testSolutiondataSet7() {
		int[] A = {} ;
		assertEquals(1, missingElement.solution(A));
	}
	
	@Test

	public void testSolutiondataSet8() {
		int[] A = {2,3,4,5,6} ;
		assertEquals(1, missingElement.solution(A));
	}
	
	@Test

	public void testSolutiondataSet9() {
		int[] A = {1,2,3,4,5,7} ;
		assertEquals(6, missingElement.solution(A));
	}
	

	@Test

	public void testSolutiondataSet10() {
		int[] A = {1,3} ;
		assertEquals(2, missingElement.solution(A));
	}
}
