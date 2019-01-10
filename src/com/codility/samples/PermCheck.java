package com.codility.samples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PermCheck {

	 public int solution(int[] A) {
		 /* int N = A.length;
		 int summationmatematical = N*(N+1)/2 ;
		 int sumofArray = Arrays.stream(A).sum();
		 if(sumofArray != summationmatematical)
			 return 0;
		 else
			 return 1;*/
		 
		 Arrays.sort(A);
		return  (A[A.length-1] - (A.length-1) > 1 || A[A.length-1] - (A.length-1) < 1) ? 0 : 1; 
		 
	 }
}
