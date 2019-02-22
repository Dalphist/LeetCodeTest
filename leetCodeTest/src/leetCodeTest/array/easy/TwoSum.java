package leetCodeTest.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Example:
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] result = twoSum(nums,target);
		System.out.println(Arrays.toString(result));
	}
	//自己的最笨的方法
	public static int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		int len = nums.length;
		for(int i = 0; i < len; i++) {
			int firstNum = nums[i];
			if(firstNum > target) {
				continue;
			}
			for(int j = i+1; j < len; j++) {
				int lastNum = nums[j];
				if(firstNum + lastNum == target) {
					arr[0] = i;
					arr[1] = j;
				}
			}
		}
		return arr;
	}
	
	//利用hash一次判断，hash的对比时间复杂度为O(1)
	public static int[] twoSum1(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int len = nums.length;
		for(int i = 0; i < len; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}
			map.put(nums[i], i);
		}
		return null;
	}

}
