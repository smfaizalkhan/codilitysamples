package com.codility.samples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxCounter {
	
	int[] counterArray;
	
	public int[]  solution(int N, int[] A) {
		
		
		
		  int P [] = new int [N];
	        int max = 0;
	        int lastUpdate = 0;
	        
	        for (int i=0;i<A.length;i++){
	            if (A[i] < N+1){
	                if (P[A[i]-1] < lastUpdate){
	                    P[A[i]-1] = lastUpdate + 1;          
	                }else{
	                    P[A[i]-1]++;    
	                }
	                max = Math.max(max, P[A[i]-1]);
	            }else if (A[i] == N+1){
	               lastUpdate = max;     
	            }    
	        }
	        
	        for(int i = 0; i < N; i++){
	            if(P[i] < lastUpdate){
	                P[i] = lastUpdate;
	            }
	        }   
	        return P; 
	
	
	
	
	
		
		/*counterArray = new int[N];
		
		
		for (int i = 0; i < A.length ; i++) {
			
			if(A[i] >= 1 && A[i] <= N)
				this.incrementArrayElemnts(A[i],counterArray);
			if(A[i] == N+1)
				this.maxCounter(counterArray);
		}
		return counterArray;*/
	}

	private void maxCounter(int[] counterArray) {
		// TODO Auto-generated method stub
		
//		System.out.println(" ");
		int maximNumber = Arrays.stream(counterArray).reduce((num1,num2) -> Math.max(num2, num1)).orElse(0);
//		System.out.println("maximNumber"+maximNumber);

		
		 Stream.generate(() -> maximNumber).limit(counterArray.length).toArray();

		int[] maximArray =  IntStream.range(0, counterArray.length).map(index -> counterArray[index]=maximNumber).toArray();
		

		
	}

	private void incrementArrayElemnts(int i,int[] counterArray) {
		// TODO Auto-generated method stub
		counterArray[i-1] = counterArray[i-1] + 1;
		/*System.out.println(" ");
		Arrays.stream(counterArray).forEach(val -> System.out.print(val));*/
		
	}

}
