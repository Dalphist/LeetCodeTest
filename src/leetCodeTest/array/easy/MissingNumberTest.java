package leetCodeTest.array.easy;

import java.util.Arrays;

/**
 * #268
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
Example 1:
Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class MissingNumberTest {

	public static void main(String[] args) {
		int[] nums = new int[] {9,6,4,2,3,5,7,0,1};
		int result = missingNumber(nums);
		System.out.println(result);
	}
	
	public static int missingNumber(int[] nums) {
		System.out.println(Arrays.toString(nums));
		if (nums == null || nums.length == 0) {
            return 0;
        }
//        int n = nums.length;
//
//        // 1st loop, swap to correct location
//        // 如果有最大数，最后总归会把这个数移动到少的那个数的位置
//        for (int i = 0; i < n; i++) {
//            int val = nums[i];
//            while (val != i && val < n && val != nums[val]) { // val != nums[val], avoid infinitely loop
//                int temp = nums[val];
//                nums[val] = nums[i];
//                nums[i] = temp;
//                val = nums[i];
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//        // 2nd loop, find 1st missing
//        for (int i = 0; i < n; i++) {
//            if (nums[i] != i) {
//                return i;
//            }
//        }
//
//        return n;
		//对于任何数X 都有 X^0=X,X^X=0,所以非常适合这种找奇偶出现次数的问题，val和i 如果XOR，对应上的话就是0,所有的数和下标XOR后，剩下的就是只出现一次的
		//对于越界的那个数，可以手动一开始加进来
		int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i] ^ i;
        }
        return result;
    }
}
