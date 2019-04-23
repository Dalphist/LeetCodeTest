package leetCodeTest.string.easy;

public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		String s = "cc";
		System.out.println(firstUniqChar(s));
	}

	public static int firstUniqChar(String s) {
		char[] arr = s.toCharArray();
		StringBuilder temp = new StringBuilder();
		for (char c : arr) {
			if (temp.toString().indexOf(c) < 0) {
				int firstIndex = s.indexOf(c);
				int secondIndex = s.substring(firstIndex + 1).indexOf(c);
				if (secondIndex >= 0) {
					temp.append(c);
					continue;
				}else{
					return firstIndex;
				}
			}
		}
		return -1;
	}
}
