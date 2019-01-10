package com.codility.samples;

public class CountDiv {

	 public int solution(int A, int B, int K) {
		 
		 if(A == 0 && B == 0)
			 return 1;
		 int divCount =0;
		 for(int i=A; i<=B ; i++) {
			 
			 if(i%K ==0) {
				 divCount += 1; 
			 }
		 }
		return  divCount;
		 
	      /*  if(A == 0 && B == 0)
				 return 1;
			 int divCount =0;
			 for(int i=A; i<=B ; i++) {
				 
				 if(i%K ==0) {
					 divCount += 1; 
				 }
			 }
			return  divCount;*/
		
	 }
}
