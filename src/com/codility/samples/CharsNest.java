package com.codility.samples;

import java.util.Deque;
import java.util.Stack;

public class CharsNest {

	public int solution(String S) {
		Stack<Character> charOfS = new Stack<Character>();
		char[] charArrayOfS = S.toCharArray();

		for (int i = 0; i < (charArrayOfS.length / 2); i++) {
			charOfS.push(charArrayOfS[i]);
		}

		for (int j = (charArrayOfS.length / 2); j < charArrayOfS.length ; j++) {
			if ((charArrayOfS[j] == '(' && charOfS.peek() == ')'))
				charOfS.pop();
			if ((charArrayOfS[j] == '{' && charOfS.peek() == '}'))
				charOfS.pop();
			if ((charArrayOfS[j] == '[' && charOfS.peek() == ']'))
				charOfS.pop();
			if ((charArrayOfS[j] == ')' && charOfS.peek() == '('))
				charOfS.pop();
			if ((charArrayOfS[j] == '}' && charOfS.peek() == '{'))
				charOfS.pop();
			if ((charArrayOfS[j] == ']' && charOfS.peek() == '['))
				charOfS.pop();

		}
		return charOfS.isEmpty() ? 1 : 0;

	}

}
