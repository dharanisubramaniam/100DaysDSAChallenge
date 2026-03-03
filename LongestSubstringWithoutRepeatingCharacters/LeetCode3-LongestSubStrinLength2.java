import java.util.*;
import java.lang.*;
import java.io.*;

class SubStringWithoutRepeatingCharacters {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		String s = "abcabcbb";
		int left = 0;
		int right = 0;
		int length = 0;
		HashSet<Character> set = new HashSet<>();
		while (right < s.length() && left < s.length()) {
			System.out.println("left:" + left);
			System.out.println("right:" + right);
			System.out.println("set:" + set);
			if (!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				if (set.size() > length) {
					length = set.size();
				}
				right++;
			} else {
				set.remove(s.charAt(left));

				left++;
			}
		}
		System.out.println("Length of longest substring:" + length);
	}
}
