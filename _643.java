package leetcode_75;

public class _643 {
	public static double findMaxAverage(int[] nums, int k) {
        if(nums.length < k) {
        	throw new IllegalArgumentException("invalid");
        }
        
        double max_average = 0;
        for (int i = 0; i < k; i++) {
			max_average += (double) nums[i] / k;
		}
        
        double window_average = max_average;
        
        for (int i = k; i < nums.length; i++) {
			window_average += (double) (nums[i] - nums[i - k]) / k;
			max_average = Math.max(window_average, max_average);
		}
        
        return max_average;
    }
}
