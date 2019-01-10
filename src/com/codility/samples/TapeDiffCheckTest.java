package com.codility.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TapeDiffCheckTest {

	 private static TapeDiff tapeDiff;
	 
	 @BeforeAll
	 public static void setUp() {
		 tapeDiff = new TapeDiff();
	 }
/*	  
	  @Test
	 public void testData1() {
		 int[] A = {3,1,2,4,3};
		 assertEquals(1, tapeDiff.solution(A));
	 }
	 
	 @Test
	 public void testData2() {
		 int[] A = {3,1,2,4,4};
		 assertEquals(2, tapeDiff.solution(A));
	 }
	 
	 @Test
	 public void testData3() {
		 int[] A = {8,7,5,10,20,13,19,1};
		 assertEquals(17, tapeDiff.solution(A));
	 }
	 
	 @Test
	 public void testData4() {
		 int[] A = {-8,-7,5,-10,20,13,19,1};
		
		 tapeDiff.solution(A);
		 assertEquals(7, tapeDiff.solution(A));
	 }
	 
	 @Test
	 public void testData5() {
		 int[] A = {-1000 , 500 ,2000};
		
		 tapeDiff.solution(A);
		 assertEquals(1500, tapeDiff.solution(A));
	 }
	 */
	 @Test
	 public void testData6() {
		 int[] A = {-2,-3,-4,-1};
		
		 tapeDiff.solution(A);
		 assertEquals(0, tapeDiff.solution(A));
	 }

}
