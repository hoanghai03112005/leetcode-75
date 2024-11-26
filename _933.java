package leetcode_75;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

	private Queue<Integer> queue;
	
	public RecentCounter() {
        queue = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        queue.offer(t);
        
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
			queue.poll();
		}
        
        return queue.size();
    }

}
