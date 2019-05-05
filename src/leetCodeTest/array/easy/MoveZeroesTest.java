package leetCodeTest.array.easy;

import java.util.Arrays;

/**
 * #283
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
public class MoveZeroesTest {

	public static void main(String[] args) {
		int[] nums = new int[] {0,1,0,3,12};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void moveZeroes(int[] nums) {
//		int count = 0;
//		for(int i : nums) {
//			if(i != 0) {
//				count ++;
//			}
//		}
//		
//        for(int i = 0; i< nums.length && count > 0; i ++,count --) {
//        	int targetIndex = i + 1;
//        	while(nums[i] == 0) {
//        		nums[i] = nums[targetIndex];
//        		nums[targetIndex] = 0;
//        		targetIndex ++;
//        	}
//        }
        if (nums == null || nums.length == 0) return;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
