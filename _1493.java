package leetcode_75;

public class _1493 {
	public int longestSubarray(int[] nums) {
        int max = 0;
        int start = 0;
        int k = 1;
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
			
			max = Math.max(max, end - start );
		} 
        return max;
    }
}
