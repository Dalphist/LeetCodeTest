package leetCodeTest.array.easy;

import java.util.Arrays;

/**
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 *
 */
public class PlusOne {

	public static void main(String[] args) {
		int[] arr = {9,9,9};
		System.out.println(Arrays.toString(plusOne(arr)));
	}

	public static int[] plusOne(int[] digits) {
		int len = digits.length;
		if(len == 0){
			return digits;
		}
		digits[len - 1] ++;
		for(int i = len-1;i >= 0; i--){
			if(digits[i] >= 10){
				digits[i] = 0;
				if(i > 0){
					digits[i - 1] ++;
				}else{
					int[] arr = new int[len + 1];
					arr[0] = 1;
					return arr;
				}
			}
		}
		return digits;
	}
}
