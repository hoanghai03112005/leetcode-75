package leetcode_75;

public class _334 {
	public static boolean increasingTriplet(int[] nums) {
		 int first = Integer.MAX_VALUE;
		 int second = Integer.MAX_VALUE;
		 
		 	for (int i : nums) {
		 		if (i <= first) {
					first = i;
				} else if (i <= second) {
					second = i;
				} else {
					return true;
				}
			}
	        return false;
	   }
}
