package com.codility.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FrogJumpTest {
	
	private static FrogJump frogJump;

	@BeforeAll
	
	public static void setUp() {
		frogJump = new FrogJump(); 
	}

	
	@Test 
	
	public void testDataSet1() {
		int X = 10;
		int Y = 85;
		int D =30;		
		assertEquals(3, frogJump.solution(X, Y, D));
	}
	
@Test 
	
	public void testDataSet2() {
		int X = 1;
		int Y = 1;
		int D =30;		
		assertEquals(0, frogJump.solution(X, Y, D));
	}


@Test 

public void testDataSet3() {
	int X = 1;
	int Y = 10;
	int D =1;		
	assertEquals(9, frogJump.solution(X, Y, D));
}



@Test 

public void testDataSet4() {
	int X = 10;
	int Y = 100;
	int D =30;		
	assertEquals(3, frogJump.solution(X, Y, D));
}

@Test 

public void testDataSet5() {
	int X = 10;
	int Y = 400;
	int D = 30;		
	assertEquals(13, frogJump.solution(X, Y, D));
}

@Test 

public void testDataSet6() {
	int X = 10;
	int Y = 700;
	int D = 30;		
	assertEquals(23, frogJump.solution(X, Y, D));
}
}
