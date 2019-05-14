package leetCodeTest.array.easy;

/**
 * 
 * #485
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
 */
public class MaxConsecutiveOnesTest {

	public static void main(String[] args) {
		int[] nums = new int[] {0,0};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int current = 0;
		for(int i = 0;i<nums.length;i++) {
			int num = nums[i];
			if(num == 1) {
				current ++;
				if(current > max) {
					max = current;
				}
			}else {
				current = 0;
			}
		}
        return max;
    }

}
