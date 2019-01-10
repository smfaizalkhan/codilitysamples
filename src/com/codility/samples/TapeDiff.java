package com.codility.samples;

import java.util.Arrays;

public class TapeDiff {

	public int solution(int[] A) {
		
		
		if(A.length ==2 )
			return Math.abs(A[1] - A[0]);
		int totalSum = Arrays.stream(A).sum();
		if(totalSum ==0)
			return 0;
	    int medianSum = totalSum / 2 ;		 
		int  leftSum = 0, rightSum = 0, difference = 0 ,prevIndexdiff;
		for (int i = 0; i < A.length ; i++) {
			leftSum = leftSum + A[i];
			if(leftSum > medianSum) {
				//current index deiffernce
			   rightSum = totalSum -leftSum ;
			   difference =  rightSum > leftSum  ? rightSum  - leftSum :leftSum -rightSum ;
			   //prev index differnce
			   int prevIndexLeftSum = 0 ,prevIndexRightSum = 0;
			   prevIndexLeftSum = leftSum - A[i];
			   prevIndexRightSum = totalSum - prevIndexLeftSum;
			   prevIndexdiff = prevIndexRightSum > prevIndexLeftSum  ? 
					          Math.abs(prevIndexRightSum) - Math.abs(prevIndexLeftSum)
					             :Math.abs(prevIndexLeftSum) - Math.abs(prevIndexRightSum) ;
			   difference = prevIndexdiff < difference ? prevIndexdiff : difference ;
			   break;
			}
			
			if(leftSum == medianSum) {
				 rightSum = totalSum -leftSum ;
				   difference =  rightSum > leftSum  ? Math.abs(rightSum) - Math.abs(leftSum) :
					   Math.abs(leftSum) - Math.abs(rightSum) ;
				   break;
			}
				
			  
		}
		
		return difference;

	}

}
