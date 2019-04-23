package leetCodeTest.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * #448 Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
 * elements appear twice and others appear once.
 * 
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * 
 * Could you do it without extra space and in O(n) runtime? You may assume the
 * returned list does not count as extra space.
 * 
 * Example:
 * 
 * Input: [4,3,2,7,8,2,3,1]
 * 
 * Output: [5,6]
 */
public class findDisappearedNumbersTest {

	public static void main(String[] args) {
		int[] nums = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
		findDisappearedNumbers(nums);
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int desiredIndex = (nums[i] - 1);
			if (nums[i] != nums[desiredIndex]) {
				int temp = nums[i];
				nums[i] = nums[desiredIndex];
				nums[desiredIndex] = temp;
				i--;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != (i+1)) {
				list.add(i+1);
			}
		}
		return list;
	}

}
