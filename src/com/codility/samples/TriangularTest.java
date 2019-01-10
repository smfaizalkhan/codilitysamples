package com.codility.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TriangularTest {
  private static Triangular traingular;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		traingular =  new Triangular();
	}

	@Test
	public  void testdata1() {
		int[] A = {10,2,5,1,8};
		assertEquals(1,traingular.solution(A));
	}

	@Test
	public  void testdata2() {
		int[] A = {10,50,5,1};
		assertEquals(0,traingular.solution(A));
	}
	
	@Test
	public  void testdata3() {
		int[] A = {-20,-3,-20,-8,-5,-7,0,2,8,7,6,10,20};
		assertEquals(1,traingular.solution(A));
	}
   
	@Test
	public  void testdata4() {
		int[] A = {-20,-3,-20,-8,-5,-7};
		assertEquals(0,traingular.solution(A));
	}
}
