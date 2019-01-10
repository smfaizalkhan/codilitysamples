package com.codility.samples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrogLeafJump {
	
	public int solution(int X, int[] A) {
		
		int lastIndex = 0;
		int lastIndexValue  = 0; 
		
	
		
		
		int indexOfX = IntStream.range(0, A.length).filter(index -> A[index] == X).findFirst().orElse(-1);
		int[] elementsTillX = Arrays.stream(A).filter(value -> value <= X).toArray();
		int[] sortedelementsTillX = Arrays.stream(elementsTillX).sorted().distinct().toArray();
		if(sortedelementsTillX.length > 0) {
			lastIndex =  sortedelementsTillX.length-1 ;
			lastIndexValue = sortedelementsTillX[lastIndex];
		}
	
		return Math.subtractExact(lastIndexValue, lastIndex) == 1 ? indexOfX : -1 ;
		
		
	}

	
	 public int betterSolution(int X, int[]A) {
		int countOfElemets = (int) Arrays.stream(A).sum();
		 System.out.println(countOfElemets);
		 Map<Integer,Integer> countOfElemetss = Arrays.stream(A).boxed().
				 collect(Collectors.groupingBy(vals -> Integer.valueOf(vals) , Collectors.summingInt(value -> Integer.valueOf(value)+1)));
		 
	    Set<Integer> positionsCovered = new HashSet<Integer>();
	   // positionsCovered =  Arrays.stream(A).boxed().filter(value ->  (value < X && value > 1)).collect(Collectors.toSet());
	    
	    if(X == 1)
		     return 0 ;
	   int position = 0;
	   // 1, 3, 1, 4, 2, 3, 5, 4 
	   for(int i = 0; i < A.length -1 ;i++ ) {		 
		   if(A[i] <= X && A[i] > 1 && positionsCovered.size() < (X-1)) {
			   positionsCovered.add(A[i]);
		   }
		   if(positionsCovered.size()== (X-1)) {
			   position = i ;
		    break;
		   }
	   }
	    
	   countOfElemetss =  IntStream.range(0, A.length-1).filter(i -> A[i] <= X && A[i] > 1).boxed().collect(Collectors.toMap(Function.identity(), ind -> A[ind]));
		 //Map<Integer,Integer> evalueCountMap = Arrays.stream(A).collect(Collectors.groupingBy(value , Collectors.summarizingInt(value)));
		return position != 0 ? position : -1; 
		 
	 }
}
