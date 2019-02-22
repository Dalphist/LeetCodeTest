package leetCodeTest.string.easy;

/**
 * Write a function that takes a string as input and returns the string reversed.
   Example:
   Given s = "hello", return "olleh".
 */
public class ReverseString {
	
	public static String reverseString(String s) {
		if(s == null){
			return s;
		}
		char[] arr = s.toCharArray();
		for(int i = 0; i < s.length()/2; i ++){
			char temp = arr[i];
			arr[i] = arr[s.length() -1 - i];
			arr[s.length() -1 - i] = temp;
		}
		return String.copyValueOf(arr);
		
    }
	public static void main(String[] args) {
		String str = reverseString("hello");
		System.out.println(str);
	}
	
}
