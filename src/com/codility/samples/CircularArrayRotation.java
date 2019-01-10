package com.codility.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CircularArrayRotation {
	
	private static CircularArray circularArray;

	@BeforeAll
	public static void setUp() {
		 circularArray = new CircularArray();
	}

	 @Test
	 public void testSolution() {
		 int[] A = {3, 8, 9, 7, 6};
		 circularArray.solution(A,3) ;
	 }
	 
	 @Test
	 public void testSolutionZeros() {
		 int[] A = {0,0,0};
		 circularArray.solution(A,1) ;
	 }
	 
	 @Test
	 public void testSolution1234() {
		 int[] A = {1,2,3,4};
		 circularArray.solution(A,4) ;
	 }
}
