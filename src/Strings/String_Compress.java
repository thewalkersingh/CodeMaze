package Strings;
public class String_Compress {
	public static void main(String[] args) {
		char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c'};
		System.out.println(compress(chars));
	}
	
	public static int compress(char[] chars) {
		int put = 0;
		int start = 0;
		while (start < chars.length) {
			int count = 0;
			char current = chars[start];
			while (start < chars.length && current == chars[start]) {
				count++;
				start++;
			}
			chars[put++] = current;
			if (count > 1) {
				String temp = String.valueOf(count);
				for (char c : temp.toCharArray()) {
					chars[put++] = c;
				}
			}
		}
		return put;
	}
	
	public int compress2(char[] chars) {
		int index = 0, count = 1, L = chars.length;
		char c = chars[0];
		if (L <= 1) {
			return L;
		}
		for (int i = 1; i < L; i++) {
			if (chars[i] != c) {
				chars[index] = c;
				c = chars[i];
				index++;
				if (count > 1 && count < 10) {
					chars[index] = (char) (count + '0');
					index++;
				}
				else if (count >= 10) {
					String str = String.valueOf(count);
					for (int i1 = 0; i1 < str.length(); i1++) {
						chars[index] = str.charAt(i1);
						index++;
					}
				}
				count = 1;
			}
			else {
				count++;
			}
		}
		chars[index] = c;
		index++;
		if (count > 1 && count < 10) {
			chars[index] = (char) (count + '0');
			index++;
		}
		else if (count >= 10) {
			String str = String.valueOf(count);
			for (int i1 = 0; i1 < str.length(); i1++) {
				chars[index] = str.charAt(i1);
				index++;
			}
		}
		
		return index;
	}
}
/*
Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:
If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array
chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

Example 1:
Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

Example 2:
Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.

Example 3:
Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 */