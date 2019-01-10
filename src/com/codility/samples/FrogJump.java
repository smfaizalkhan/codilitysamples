package com.codility.samples;

public class FrogJump {

	
	public int solution(int X, int Y ,int D) {
		int distance = Y-X;
		if(distance ==0 )
			return 0;
		int moduloOfDistance = distance % D ;
		int remainSteps = distance / D;
		int noOfSteps = moduloOfDistance == 0 ? remainSteps :  remainSteps+1;		
		return noOfSteps;
		
	}
}
