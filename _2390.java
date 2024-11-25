package leetcode_75;

import java.util.Stack;

public class _2390 {

	public String removeStars(String s) {
        Stack<Character> myStack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '*') {
				myStack.add(s.charAt(i));
			} else {
				myStack.pop();
				continue;
			}
		}
        
        StringBuilder sb = new StringBuilder();
        for (Character character : myStack) {
			sb.append(character);
		}
        
        return sb.toString();
    }

}
