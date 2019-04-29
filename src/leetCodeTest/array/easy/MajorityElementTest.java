package leetCodeTest.array.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *	169#  Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
 */
public class MajorityElementTest {

	public static void main(String[] args) {
		int[] arr = new int[] {2,2,1,1,1,2,2};
		int result = majorityElement(arr);
		System.out.println(result);
	}

	/**
	 * 正常的是用map 存，但是效率不是最高，这里给定的是肯定有个众数，可以用下面的方法
	 * vote 是记数器，vote ++ 和 vote -- 的最终结果，在一定有个众数的情况下，最终的vote 一定  大于 1
	 */
	public static int majorityElement(int[] nums) {
		if (nums == null || nums.length == 0) {
            return -1;
        }
        int majorityNum = nums[0];
        int vote = 0;
        for (int num : nums) {
            vote += num == majorityNum ? 1 : -1;
            if (vote == 0) {
                majorityNum = num;
                vote = 1;
            }
        }
        return majorityNum;
    }
}
