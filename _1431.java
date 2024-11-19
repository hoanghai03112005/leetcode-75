package leetcode_75;

import java.util.ArrayList;
import java.util.List;

public class _1431 {
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> myList = new ArrayList<Boolean>();
        int max = 0;
        for (Integer element: candies) {
			max = Math.max(element, max);
		}
        for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= max) {
				myList.add(true);
			} else {
				myList.add(false);
			}
		}
        
        return myList;
    }
}
