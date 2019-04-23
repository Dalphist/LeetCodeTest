package leetCodeTest.math.easy;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when
 * it reads the same backward as forward.
 * 
 * Example 1:
 * 
 * Input: 121 Output: true Example 2:
 * 
 * Input: -121 Output: false Explanation: From left to right, it reads -121.
 * From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * 
 * Input: 10 Output: false Explanation: Reads 01 from right to left. Therefore
 * it is not a palindrome.
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		int x = 13322331;
		boolean b = isPalindrome(x);
		System.out.println(b);
	}

	public static boolean isPalindrome(int x) {
		if(x < 0) {
			return false;
		}
		String s = String .valueOf(x);
		char[] arr = s.toCharArray();
		int len = arr.length;
		int mid = len/2;
		for(int i = 0,j=len - 1; i <= mid && j >= mid; i++,j--) {
			if(arr[i] != arr[j]) {
				return false;
			}
		}
		return true;
	}
}
