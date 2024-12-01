package leetcode_75;

import java.util.LinkedList;
import java.util.Queue;

public class _649 {

	public static String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<Integer>();
        Queue<Integer> dire = new LinkedList<Integer>();
        
        for (int i = 0; i < senate.length(); i++) {
			if (senate.charAt(i) == 'R') {
				radiant.offer(i);
			} else {
				dire.offer(i);
			}
		}
        
        while (!radiant.isEmpty() && !dire.isEmpty()) {
			int radiantIndex = radiant.poll();
			int direIndex = dire.poll();
			
			if (radiantIndex < direIndex) {
				radiant.offer(radiantIndex + senate.length());
			} else {
				dire.offer(direIndex + senate.length());
			}
		}
        
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }	
	 public static void main(String[] args) {
		String senate = "DRRD";
		System.out.println(predictPartyVictory(senate));
	}
}
