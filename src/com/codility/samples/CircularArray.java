package com.codility.samples;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CircularArray {

	public void solution(int[] a, int K) {

         int[] destArray = new int[a.length];
         int j=1;
        if(a.length>2) {
         for(int i=0;i<K;i++) {
        	 a = rotateCircular(a, destArray, j).clone();
         }
         
//		for(int i=0;i<K;i++) {
//			destArray[0] = a[a.length-1];
//			
//			while(j<=a.length-1) {
//				destArray[j] = a[j-1];
//				j++;
//			}
//			a = destArray.clone();
//			
//		}
       
	System.out.println(" ");
		Arrays.stream(a).forEach(lastVal -> System.out.print(" "+lastVal));
//         for(int i=0;i<K;i++) {
        } 
//     	a = destArray.clone();
//         }
		
	}

	private int[] rotateCircular(int[] a, int[] destArray, int j) {
		destArray[0] = a[a.length-1]; 
     	IntStream.range(j, a.length).forEach(index -> {
     		int sourceVal = a[index-1];     		
     		destArray[index] =sourceVal;
     	});
     	return destArray;
	}
	
	

}
