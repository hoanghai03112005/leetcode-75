package leetcode_75;

import java.util.Stack;

public class _735 {

	public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> myStack = new Stack<Integer>();
        
        for (int i = 0; i < asteroids.length; i++) {
        	boolean check = false;
        	while (!myStack.isEmpty() && asteroids[i] < 0 && myStack.peek() > 0) {
        		if (Math.abs(asteroids[i]) < myStack.peek()) {
					break;
				} else if(Math.abs(asteroids[i]) == myStack.peek()){
					myStack.pop();
					check = true;
					break;
				} else if (Math.abs(asteroids[i]) > myStack.peek()) {
					myStack.pop();	
				}
			}
        	
        	if ((myStack.isEmpty() || asteroids[i] > 0 || myStack.peek() < 0) && check == false) {
				myStack.add(asteroids[i]);
			}
        	
		}
        
        
        int[] result = new int[myStack.size()];
        int index = 0;
        for (int i : myStack) {
			result[index++] = i;
		}
        return result;
        
    }

}
