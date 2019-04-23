package leetCodeTest.array.easy;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 * 
 * Example 1:
 * 
 * Input: [1,2,3,4,5,6,7] and k = 3 Output: [5,6,7,1,2,3,4] Explanation: rotate
 * 1 steps to the right: [7,1,2,3,4,5,6] rotate 2 steps to the right:
 * [6,7,1,2,3,4,5] rotate 3 steps to the right: [5,6,7,1,2,3,4] Example 2:
 * 
 * Input: [-1,-100,3,99] and k = 2 Output: [3,99,-1,-100] Explanation: rotate 1
 * steps to the right: [99,-1,-100,3] rotate 2 steps to the right:
 * [3,99,-1,-100]
 */
public class RotateArray {
	public static void main(String[] args) {
		int[] nums = {-1,2};
		int k = 3;
		rotate(nums, k);
		System.out.println(Arrays.toString(nums));
	}

	public static void rotate(int[] nums, int k) {
		int len = nums.length;
		k = k % len;
		if(k >= len){
			return;
		}
		// 翻转 前len-k 的数
		for (int i = 0; i < (len - k) / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[len - k - 1 - i];
			nums[len - k - 1 - i] = temp;
		}
		// 翻转后 k 位的数
		for (int j = 0; j < k / 2; j++) {
			int temp = nums[len - 1 - j];
			nums[len - 1 - j] = nums[len - k + j];
			nums[len - k + j] = temp;
		}
		// 整体翻转
		for (int m = 0; m < len / 2; m++){
			int temp = nums[m];
			nums[m] = nums[len - 1 -m];
			nums[len -1 -m] = temp;
		}
			return;
	}
}
