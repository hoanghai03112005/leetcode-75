package leetcode_75;

public class _1004 {
	public static int longestOnes(int[] nums, int k) {
        int max = 0;
        int start = 0;
        
        for (int end = 0; end < nums.length; end++) {
			if (nums[end] == 0) {
				k--;
			}
			
			while (k < 0) {
				if (nums[start] == 0) {
					k++;
				}
				start++;
			}
			
			max = Math.max(max, end - start + 1);
		} 
        return max;
    }
}
