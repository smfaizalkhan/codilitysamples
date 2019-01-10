package com.codility.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PlanetSeasonAmplitudeTest {

	 private static PlanetSeasonAmplitude planetSeasonAmplitude;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		planetSeasonAmplitude = new PlanetSeasonAmplitude();
	}

	/*@Test
	void test() {
		int[] T = {-3,-14,-5,7,8,42,8,3};
		planetSeasonAmplitude.solution(T);
	}
	
	@Test
	void testdata1() {
		int[] T = {2,-3,3,1,10,8,2,5,13,-5,3,18};
		planetSeasonAmplitude.solution(T);
	}
	@Test
	void testdata2() {
		int[] T = {2, 1, 1, 10, 2, 13, 3, -18};
		planetSeasonAmplitude.solution(T);
	}*/
	
	@Test
	void testdata3() {
		int[] T = {2, 1, 1, 10, 2, 13, 3, -18,6, -7 , 8, -10, 3, 8,-7,4};
		planetSeasonAmplitude.solution(T);
	}
	
}
