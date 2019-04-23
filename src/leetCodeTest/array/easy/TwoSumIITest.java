package leetCodeTest.array.easy;

import java.util.Arrays;

/**
 * 167# Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2.
 * 
 * Note:
 * 
 * Your returned answers (both index1 and index2) are not zero-based. You may
 * assume that each input would have exactly one solution and you may not use
 * the same element twice. Example:
 * 
 * Input: numbers = [2,7,11,15], target = 9 Output: [1,2] Explanation: The sum
 * of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoSumIITest {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,3,6,7,9};
		int[] result = twoSum(numbers,9);
		System.out.println(Arrays.toString(result));
	}

	public static int[] twoSum(int[] numbers, int target) {
		if (numbers == null || numbers.length == 0) {
            return numbers;
        }
        final int[] result = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            long sum = (long)(numbers[start] + numbers[end]);
            if (sum == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }//end while
        return result;
	}

}
