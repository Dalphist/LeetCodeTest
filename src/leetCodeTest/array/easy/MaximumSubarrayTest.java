package leetCodeTest.array.easy;

/**
 * #53 Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example:
 * 
 * Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6 Explanation: [4,-1,2,1] has the
 * largest sum = 6. Follow up:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 * 
 * 
 */
public class MaximumSubarrayTest {

	public static void main(String[] args) {
		int[] nums = new int[] {9,1,-11,4,-1,2,1,-5,4};
		int a = maxSubArray(nums);
		System.out.println(a);
	}

	public static int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0) return Integer.MIN_VALUE;
        int preMaxSum = 0, max = Integer.MIN_VALUE;
        for (int num : nums) {
            preMaxSum = Math.max(num, preMaxSum + num);
            max = Math.max(max, preMaxSum);
        }
        return max;
	}
}
