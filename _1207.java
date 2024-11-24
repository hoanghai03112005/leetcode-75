package leetcode_75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1207 {

	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		Set<Integer> mySet = new HashSet<Integer>();
		
		for (int i : arr) {
			myMap.put(i, myMap.getOrDefault(i, 0) + 1);
		}
		
		
		for (Map.Entry<Integer, Integer> m : myMap.entrySet()) {
			mySet.add(m.getValue());
		}
		
        return myMap.size() == mySet.size();
    }

}
