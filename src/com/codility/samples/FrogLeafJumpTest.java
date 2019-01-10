package com.codility.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FrogLeafJumpTest {

	private static FrogLeafJump frogLeafJump;

	@BeforeAll
	public static void setUp() {
		frogLeafJump = new FrogLeafJump();
		int X = 3 ;
	   	
	}

	@Test
	public void testData1() {
		int X = 5;
		int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 };
		assertEquals(6, frogLeafJump.betterSolution(X, A));
	}

    @Test
     public void testData2() {
    	int X = 6 ;
    	int[] A = {1,3,1,3,5,4,3,7,8,9,10,6,11,12,14,15,17,18,25};
    	assertEquals(-1, frogLeafJump.betterSolution(X, A));
    }
    
    @Test
    public void testData3() {
   	int X = 6 ;
   	int[] A = {11,12,14,15,17,18,25,10,6,1,3,1,3,5,4,3,7,8,9};
   	assertEquals(-1, frogLeafJump.betterSolution(X, A));
   }
    @Test
    public void testData4() {
   	int X = 1 ;
   	int[] A = {1,3,1,3,5,4,3,7,8,9,10,6,11,12,14,15,17,18,25};
   	assertEquals(0, frogLeafJump.betterSolution(X, A));
   }
    @Test
    public void testData5() {
   	int X = 3 ;
   	int[] A = {1,3};
   	assertEquals(-1, frogLeafJump.betterSolution(X, A));
   }
    
    @Test
    public void testData6() {
   	int X = 3 ;
   	int[] A = {};
   	assertEquals(-1, frogLeafJump.betterSolution(X, A));
   }
	
	@Test
	
	public void testDatat7() {
		int X = 3 ;
		int[] A = {1,3};
		assertEquals(-1,frogLeafJump.betterSolution(X, A));
	}

	
@Test
	
	public void testDatat8() {
		int X = 3 ;
		int[] A = {1, 3, 1, 3, 2, 1, 3};
		assertEquals(4,frogLeafJump.betterSolution(X, A));
	}
}
