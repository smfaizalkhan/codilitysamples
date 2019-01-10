package com.codility.samples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallPositiveInteger {

	 public int solution(int[] A) {
		
		int[] B = Arrays.stream(A).filter(value -> value > 0).toArray();
		if (B.length == 0)
			return 1;
		int[] C = Arrays.stream(B).sorted().distinct().toArray();
		int N = C.length;

		if (C[0] != 1)
			return 1;

		for (int i = 1; i < N; i++) {

			if (C[i] - C[i - 1] > 1)
				return C[i - 1] + 1;

		}

		return C[N - 1] + 1;
		 
		 /*int summation =  N*(N+1) / 2 ;
		 int arraySu  = Arrays.stream(C).sum();
		 
		 if(arraySu > summation) {
			 System.out.println("lasr eel" +  C[C.length - 1]);
			 System.out.println("arraySu" +  arraySu);
			 System.out.println("summation " + summation);
			 return C[C.length - 1] - (arraySu - summation) ;
		   }
		 else
			 return C[C.length - 1] + 1;*/
		 
		 
	 }
}
