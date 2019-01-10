package com.codility.samples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class PlanetSeasonAmplitude {
	
	 int[] winterRecording;
	 int[] summerRecording;
	 int[] springRecording;
	 int[] autummnRecording;
	 int[] sourceArray;
	public String solution(int[] T) {
		
		if(T.length < 8 && T.length > 200)
			return "Array Length should be in Range of 8 to 200";
		if(T.length%4 !=0)
			return "ARray elemtn should be divisble by 4";
		int eachSeaonElementLength = T.length/4;
	  winterRecording = new int[eachSeaonElementLength];
	  summerRecording = new int[eachSeaonElementLength];
	 springRecording = new int[eachSeaonElementLength];
	  autummnRecording = new int[eachSeaonElementLength];
	  
	  winterRecording = Arrays.copyOfRange(T, 0, eachSeaonElementLength);
	  springRecording = Arrays.copyOfRange(T, winterRecording.length, (winterRecording.length+eachSeaonElementLength));
	  
	  int springRecordingstartIndex = (winterRecording.length+eachSeaonElementLength);
	  int springRecordingEndIndex = springRecordingstartIndex + eachSeaonElementLength;
	  summerRecording = Arrays.copyOfRange(T, springRecordingstartIndex, springRecordingEndIndex);
	  int autummnRecordingstartIndex = (springRecordingEndIndex);
	  int autummnRecordingEndIndex = autummnRecordingstartIndex + eachSeaonElementLength;
	  autummnRecording = Arrays.copyOfRange(T, autummnRecordingstartIndex, autummnRecordingEndIndex);
	
	   
	 
	   
	  int winterRecrodingDifference = Arrays.stream(winterRecording).reduce((num1 , num2) -> Math.subtractExact(Math.abs(num2), Math.abs(num1))).orElse(0);
	  int springRecordingDifference = Arrays.stream(springRecording).reduce((num1 , num2) ->Math.subtractExact(Math.abs(num2),  Math.abs(num1))).orElse(0);
	  int summerRecordingDifference = Arrays.stream(summerRecording).reduce((num1 , num2) -> Math.subtractExact(Math.abs(num2), Math.abs(num1))).orElse(0);	 
	  int autummnRecordingDifference = Arrays.stream(autummnRecording).reduce((num1 , num2) -> Math.subtractExact(Math.abs(num2), Math.abs(num1))).orElse(0);
	  
		System.out.println("winterRecrodingDifference"+winterRecrodingDifference);
		System.out.println("springRecordingDifference"+springRecordingDifference);
		System.out.println("summerRecordingDifference"+summerRecordingDifference);		
		System.out.println("autummnRecordingDifference"+autummnRecordingDifference);
		
		Map<Integer,String> seasopnMapingOfNameAndDiffernce = new HashMap<Integer,String>();
		
		seasopnMapingOfNameAndDiffernce.put(winterRecrodingDifference,"WINTER");
		seasopnMapingOfNameAndDiffernce.put(springRecordingDifference,"SPRING");
		seasopnMapingOfNameAndDiffernce.put(summerRecordingDifference,"SUMMER");		
		seasopnMapingOfNameAndDiffernce.put(autummnRecordingDifference,"AUTUMN");
	
		int maximDiff= Stream.of(winterRecrodingDifference,summerRecordingDifference,springRecordingDifference,autummnRecordingDifference).reduce((num1,num2) -> Math.max(num2, num1)).orElse(0);
		
		System.out.println(seasopnMapingOfNameAndDiffernce.get(maximDiff));
		
		
		return null;

}
	
}