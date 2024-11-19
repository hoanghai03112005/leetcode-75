package leetcode_75;

import java.util.Arrays;

public class _1679 {
	public static int maxOperations(int[] nums, int k) {
	       int cnt = 0;
	       Arrays.sort(nums);
	       int start = 0;
	       int end = nums.length - 1;
	       
	       while (start < end) {
	    	   int target = k - nums[start];
	    	   if (target > nums[end]) {
				   start++;
	    	   } else if(target == nums[end]){
	    		   cnt++;
	    		   start++;
	    		   end--;
	    	   } else {
	    		   end--;
	    	   }
	    	   
	       }
	       return cnt;
	    }
	public static void main(String[] args) {
		int[] nums = {1,4,2,3};
		System.out.println(maxOperations(nums, 5));
	}
}
