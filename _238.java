package leetcode_75;

public class _238 {
	public static int[] productExceptSelf(int[] nums) {
		int left = 1;
		int[] answer = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			answer[i] = left;
			left *= nums[i];
		}
		
		int right = 1;
		for (int i =  answer.length - 1; i >= 0; i--) {
			answer[i] *= right;
			right *= nums[i];
		}
		return answer;
    }
}
