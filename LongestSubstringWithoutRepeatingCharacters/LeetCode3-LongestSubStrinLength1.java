import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.HashSet;
import java.util.Set;

class SubStringWithoutRepeatingCharacters {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		String s = "abcabcbb";
		// System.out.println("substring:"+s.substring(0,0));
		Set<String> allSubstrings = new HashSet<>();
		int length = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String sub = s.substring(i, j);
				allSubstrings.add(sub);

			}
		}
		System.out.println("All substrings" + allSubstrings);

		for (String str : allSubstrings) {
			int newLength = 0;

			newLength = longestSubstring(str);
			if (newLength > length) {
				length = newLength;
			}
		}
		System.out.println("The length of the longest substring is:" + length);
	}

	public static int longestSubstring(String str) {
		System.out.println("substring:" + str);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length() - 1; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return 0;
				}
			}
		}
		return str.length();
	}
}
