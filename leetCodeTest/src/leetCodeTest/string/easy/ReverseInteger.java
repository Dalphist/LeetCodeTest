package leetCodeTest.string.easy;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * Input: 123 Output: 321 Example 2:
 * 
 * Input: -123 Output: -321 Example 3:
 * 
 * Input: 120 Output: 21 Note: Assume we are dealing with an environment which
 * could only store integers within the 32-bit signed integer range: [−231, 231
 * − 1]. For the purpose of this problem, assume that your function returns 0
 * when the reversed integer overflows.
 *
 */
public class ReverseInteger {
	public static int reverse(int x) {
		long l = x;
        String s = String.valueOf(Math.abs(l));
        char[] arr = s.toCharArray();
        for(int i = 0; i < s.length()/2; i ++){
            char temp = arr[i];
            arr[i] = arr[s.length() -1 -i];
            arr[s.length() -1 -i] = temp;
        }
        s = String.valueOf(arr);
        l = Long.parseLong(s) * ((x > 0)?1:-1);
        if(l > Integer.MAX_VALUE || l < Integer.MIN_VALUE){
            return 0;
        }
    	return (int)(l);
	}

	public static void main(String[] args) {
		int a = reverse(-2147483648);
		System.out.println(a);
		
	}

}
